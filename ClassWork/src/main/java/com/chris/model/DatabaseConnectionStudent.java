package com.chris.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionStudent {

    public static Connection initializeDataBase() throws SQLException, ClassNotFoundException {
        String dbDriver = "com.mysql.cj.jdbc.Driver";
        String dbUrl = "jdbc:mysql://localhost:3306/";
        String dbName = "Person";
        String dbUserName = "root";
        String dbPassword = "chris001";

        Class.forName(dbDriver);
        Connection connection = DriverManager.getConnection(dbUrl + dbName, dbUserName, dbPassword);

        return connection;
    }
}
/*
*     public static Connection initializeDatabase() throws ClassNotFoundException, SQLException {
        String dbDriver = "com.mysql.cj.jdbc.Driver";
        String dbUrl = "jdbc:mysql://localhost:3306/";
        String dbName = "Person";
        String dbUserName = "root";
        String dbPassword = "chris001";

        Class.forName(dbDriver);
        Connection connection = DriverManager.getConnection(dbUrl + dbName, dbUserName, dbPassword);

        return connection;
    }
* */