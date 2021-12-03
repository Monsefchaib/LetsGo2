package com.example.letsgo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConn {

    Connection conn;

    public DatabaseConn(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11456083","sql11456083","U4WtcZ96X9");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }


    public Connection getConnection() {
        return conn;
    }

    public void setConnection(Connection connection) {
        this.conn = connection;
    }

}
