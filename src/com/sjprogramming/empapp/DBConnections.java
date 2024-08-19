package com.sjprogramming.empapp;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class DBConnections {
    static Connection con = null;
    public static Connection createDBConnection()
    {
        try {
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //get connection
            String url = "jdbc:mysql://localhost:3306/employeeDB?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "admin123";
            con= DriverManager.getConnection(url,username,password);
        }catch (Exception ex)
        {
           ex.printStackTrace();
        }
        return con;
    }
}
