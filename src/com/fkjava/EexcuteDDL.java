package com.fkjava;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/4/14 14:49
 */
public class EexcuteDDL {
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
    }

    public void createTable(String sql) throws Exception{
        Class.forName(driver);
        try(
                Connection conn = DriverManager.getConnection(url,user,pass);
                      Statement stmt = conn.createStatement()){
            stmt.executeUpdate(sql);
        }
    }

    public static void main(String[] args) throws Exception {
        EexcuteDDL ed = new EexcuteDDL();
        ed.initParam("mysql.properties");
        String sql = "CREATE TABLE `jdbc_test` (\n" +
                "  `jdbc_name` varchar(255),\n" +
                "  `jdbc_desc` text\n" +
                ") ;";
        ed.createTable(sql);
        System.out.println("建表成功");

    }



}
