package com.mgnggg.study_servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dispatcherJSPServlets")

public class DispatcherJSPServlets extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {



    // /dispatcherServlets?hiddenParam=createCookieServlets
    
  
        request.setAttribute("firstName", "chanhee");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/search_form.jsp");
        requestDispatcher.forward(request, response);
    }

    }

