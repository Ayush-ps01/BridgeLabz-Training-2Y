package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/student_db";
    private static final String USER = "root"; // your MySQL username
    private static final String PASSWORD = "8520"; // your MySQL password

    static {
        try {
            // Force loading the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("✅ MySQL JDBC Driver loaded.");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ MySQL JDBC Driver NOT found!");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
