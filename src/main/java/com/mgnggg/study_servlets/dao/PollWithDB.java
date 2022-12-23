package com.mgnggg.study_servlets.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class PollWithDB {
    public HashMap<String, Object> getQuestion(String questionsUid) throws SQLException {


    Commons commons = new Commons();
    Statement statement = commons.getStatement();

    String query = "SELECT * FROM QUESTIONS_LIST " + 
                   "WHERE QUESTIONS_UID = '"+questionsUid+"'";

    ResultSet resultSet= statement.executeQuery(query);
    HashMap<String, Object> list = new HashMap<>();
    HashMap<String, Object> question = new HashMap<>();
    ArrayList<String> answers = new ArrayList<>();
    while(resultSet.next()) {
        question.put("QUESTION", resultSet.getString("QUESTIONS"));
        question.put("ORDERS", resultSet.getInt("ORDERS"));
    }
    Statement statement2 = commons.getStatement();
    query = "SELECT ANSWERS.QUESTIONS_UID, EXAMPLE_LIST.ORDERS, EXAMPLE_LIST.EXAMPLE " +
            "FROM ANSWERS " +
            "INNER JOIN EXAMPLE_LIST " +
            "ON ANSWERS.EXAMPLE_UID = EXAMPLE_LIST.EXAMPLE_UID " +
            "WHERE QUESTIONS_UID = '" + questionsUid + "' " +
            "ORDER BY QUESTIONS_UID; ";

    ResultSet resultSet_Answer = statement2.executeQuery(query);

    while (resultSet_Answer.next()) {
        answers.add(resultSet_Answer.getInt("ORDERS") + ". " + resultSet_Answer.getString("Example"));
    }
    list.put("QUESTION", question);
    list.put("ANSWERS", answers);

    return list;
     }

  
    
}

