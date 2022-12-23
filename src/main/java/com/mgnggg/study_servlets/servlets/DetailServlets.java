package com.mgnggg.study_servlets.servlets;

import java.io.IOException;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.mgnggg.study_servlets.dao.PollWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/polls/PollServlet")
public class DetailServlets extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // input type
        String questions_Uid = request.getParameter("QUESTIONS_UID");

        // biz with DB and Class
        PollWithDB pollWithDB = new PollWithDB();
        HashMap<String, Object> list = null;
        ArrayList<String> answers = null;
   
        try {
            list = pollWithDB.getQuestion(questions_Uid);
            HashMap<String, Object> question = (HashMap<String, Object>) list.get("QUESTION");

            System.out.println(question.get("ORDERS") + ". " + question.get("QUESTION"));

            answers = (ArrayList<String>) list.get("ANSWERS");
            for (int i = 0; i < answers.size(); i++) {
                System.out.println(answers.get(i));
            }
            request.setAttribute("question", question);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // output with html
        request.setAttribute("answers", answers);
        request.setAttribute("QUESTIONS_UID", questions_Uid);

        
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/polls/details.jsp");
        requestDispatcher.forward(request, response);
    }
}

