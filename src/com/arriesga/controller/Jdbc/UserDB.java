package com.arriesga.controller.Jdbc;

import com.arriesga.controller.Logic.DataCheck;
import com.arriesga.controller.Model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by PC on 5/11/2018.
 */
public class UserDB {
    Connection connection = null;

    public UserDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "");
            Statement statement = connection.createStatement();
            String sqlcommand =  "create table if not exists user(username varchar(50)" +
                    ",password varchar(50)" +
                    ",firstname varchar(50)" +
                    ",lastname varchar(50)" +
                    ",email varchar(50))";
            statement.execute(sqlcommand);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public Boolean UserRegister(User user){
        Boolean bool = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DataCheck check = new DataCheck();
            bool= check.checkUser(user.getUsername(),user.getPassword());
            Statement statement = connection.createStatement();
            if(!bool) {
                String sql = "insert into user values('" + user.getUsername() + "','" + user.getPassword() + "','" + user.getFname() + "'" +
                        ",'" + user.getLname() + "','" + user.getEmail() + "')";
                statement.executeUpdate(sql);
                bool = true;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return bool;
    }
}
