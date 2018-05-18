package com.arriesga.controller.Controller;

import com.arriesga.controller.Jdbc.SaveDB;
import com.arriesga.controller.Jdbc.UserDB;
import com.arriesga.controller.Model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by PC on 5/11/2018.
 */
public class ServletRegister  extends HttpServlet {
    ArrayList drinks = new ArrayList<String>();
    Boolean bool = false;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User(req.getParameter("user"), req.getParameter("pass"), req.getParameter("email"),
                req.getParameter("fname"), req.getParameter("lname"));
        UserDB userDbc = new UserDB();
        SaveDB storeDbc =new SaveDB();
        bool =  userDbc.UserRegister(user);
        drinks = storeDbc.gatherDatabase();
        if (bool){
            RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
            req.setAttribute("value",drinks);
            rd.include(req, resp);
            rd.forward(req, resp);
        }else {
            RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
            rd.include(req, resp);
            rd.forward(req, resp);
        }
    }
}
