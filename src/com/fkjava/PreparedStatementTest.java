package com.fkjava;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/22 09:32
 */
public class PreparedStatementTest {
    private String driver;
    private String url;
    private String user;
    private String pass;

    public void initParam(String paramFile) throws Exception{
        Properties props = new Properties();
        props.load(new FileInputStream(paramFile));
        driver = props.getProperty("driver");
        url = props.getProperty("url");
        user = props.getProperty("user");
        pass = props.getProperty("pass");

        Class.forName(driver);
    }

    public void insertUseStatment() throws Exception{
        long start = System.currentTimeMillis();
        try(
                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement()
                )
        {
            for (int i =0; i < 100; i++)
            {
                stmt.executeUpdate("insert into teacher_table values("+ i + " , 'cc')");
            }
            System.out.println("使用Statment耗时：" + (System.currentTimeMillis() - start));
        }
    }

    public void insertUserPrepare() throws Exception{
        long start = System.currentTimeMillis();
        try(
                Connection conn = DriverManager.getConnection(url, user, pass);
                PreparedStatement pstmt = conn.prepareStatement(
                        "insert into teacher_table values(?,'cc')")
                )
        {
            for (int i =0 ; i < 100; i++){
                pstmt.setString(1, String.valueOf(i));
                pstmt.executeUpdate();
            }
            System.out.println("使用PreparedStatment耗时：" + (System.currentTimeMillis() - start));
        }
    }

    //执行存储过程
    public void callProcedure() throws Exception{
        try(
                Connection conn = DriverManager.getConnection(url, user, pass);
                CallableStatement cstmt = conn.prepareCall("{call add_pro(?,?,?)}")
                )
        {
            cstmt.setInt(1, 4);
            cstmt.setInt(2, 5);
            cstmt.registerOutParameter(3, Types.INTEGER);
            cstmt.execute();
            System.out.println("执行结果是： " + cstmt.getInt(3));
        }
    }

    public static void main(String[] args) throws Exception{
        PreparedStatementTest pt = new PreparedStatementTest();
        pt.initParam("mysql.properties");
        pt.insertUseStatment();
        pt.insertUserPrepare();
        pt.callProcedure();
    }
}
