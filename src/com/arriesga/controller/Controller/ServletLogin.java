package com.arriesga.controller.Controller;

import com.arriesga.controller.Logic.DataCheck;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by PC on 5/11/2018.
 */
public class ServletLogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Boolean bool = false;
        try{
            String user = req.getParameter("user");
            String password = req.getParameter("pass");
            DataCheck check = new DataCheck();
            bool = check.checkUser(user.toLowerCase(),password.toLowerCase());
            String fname = check.getname();
            if(bool){
                req.setAttribute("value",fname);
                RequestDispatcher r = req.getRequestDispatcher("result.jsp");
                r.forward(req,resp);

            } else {
                RequestDispatcher r = req.getRequestDispatcher("index.jsp");
                r.forward(req,resp);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
