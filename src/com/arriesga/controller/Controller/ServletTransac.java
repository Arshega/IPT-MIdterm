package com.arriesga.controller.Controller;

import com.arriesga.controller.Jdbc.SaveDB;
import com.arriesga.controller.Logic.Solve;

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
public class ServletTransac extends HttpServlet {
    ArrayList drinks = new  ArrayList<String>();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SaveDB storeDbc = new SaveDB();
        storeDbc.Save();
        String a = req.getParameter("Fruits");
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        Solve math = new Solve();
        int b =   math.Sump(a,quantity);
        req.setAttribute("value",b);
        req.setAttribute("value2",a);
        RequestDispatcher r = req.getRequestDispatcher("recommended.jsp");
        r.forward(req,resp);
    }
}
