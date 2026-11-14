package com.example.lab9_20233383.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BaseDao {

    public Connection getConnection() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        String USER = "root";
        String PASS = "root";
        String URL = "jdbc:mysql://localhost:3306/hr?serverTimezone=America/Lima";
        return DriverManager.getConnection(URL,USER,PASS);
    }

}
