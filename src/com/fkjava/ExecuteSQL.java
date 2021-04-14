package com.fkjava;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/22 08:42
 */
public class ExecuteSQL {
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

    public void executeSql(String sql) throws Exception{
        Class.forName(driver);
        try(
                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement()
                )
        {
            boolean hasResultSet = stmt.execute(sql);
            if (hasResultSet){
                try(ResultSet rs = stmt.getResultSet())
                {
                    ResultSetMetaData rsmd = rs.getMetaData();
                    int columCount = rsmd.getColumnCount();
                    while (rs.next()){
                        for(int i = 0; i < columCount; i++){
                            System.out.println(rs.getString(i + 1) + "\t");
                        }
                        System.out.println("\n");
                    }
                }
            }else{
                System.out.println("该SQL语句影响的记录有" + stmt.getUpdateCount() + "条");
            }
        }
    }

    public static void main(String[] args) throws Exception{
        ExecuteSQL es = new ExecuteSQL();
        es.initParam("mysql.properties");


    }
}
