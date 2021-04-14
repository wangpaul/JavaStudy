package com.fkjava;

import java.sql.*;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/4/14 11:16
 */
public class ConnMySql {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc?useSSL=true", "root", "wzz107929");
            System.out.println("数据库连接成功");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student_table s , teacher_table t\n" +
                    "where t.teacher_id = s.java_teacher");
            {
                while(rs.next()){
                    System.out.println(rs.getInt(1) + "\t"
                                    + rs.getInt(2) + "\t"
                                    + rs.getInt(3) + "\t"
                                    + rs.getString(4) );
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
