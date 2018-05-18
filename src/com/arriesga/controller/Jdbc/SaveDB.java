package com.arriesga.controller.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by PC on 5/11/2018.
 */
public class SaveDB {
    Connection connection = null;

    public void Save(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "");
            Statement statement = connection.createStatement();
            String sqlcommand =  "Create table if not exists store (fruitname varchar(50),price int)";
            statement.execute(sqlcommand);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<String> gatherDatabase(){
        ArrayList a = new  ArrayList<String>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "");
            Statement s = connection.createStatement();
            String sql = "SELECT count(*) from store";
            Statement statement = connection.createStatement();
            String sqlcommand="SELECT * from store";
            ResultSet rs = statement.executeQuery(sqlcommand);
            int size = 0;
            while(size < rs.getFetchSize()){
                rs.next();
                a.add(rs.getString("fruitname"));
                size++;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return  a;
    }

}

