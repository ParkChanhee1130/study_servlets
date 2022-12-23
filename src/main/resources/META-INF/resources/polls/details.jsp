
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
</head>

<body>
  <%
      String questions_Uid = (String)request.getAttribute("QUESTIONS_UID");
      HashMap<String, Object> question = (HashMap<String, Object>) request.getAttribute("question");
      ArrayList<String> answers = (ArrayList<String>)request.getAttribute("answers");
    %>
    <div >
      <div>
      <%-- 1page --%>
      <% if((int)question.get("ORDERS") == 1){ %>
   
        <a href="/polls/PollServlet?QUESTIONS_UID=Q2" class="btn btn-outline-primary">next</a
        >
      <%} %>
      <%-- 2page --%>
      <% if((int)question.get("ORDERS") == 2){ %>
        <a href="/polls/PollServlet?QUESTIONS_UID=Q1" class="btn btn-outline-primary"
          >prev</a
        >
        <a href="/polls/PollServlet?QUESTIONS_UID=Q3" class="btn btn-outline-primary"
          >next</a
        >
       
      <%} %>
            <%-- 3page --%>
      <% if((int)question.get("ORDERS") == 3){ %>
        <a href="/polls/PollServlet?QUESTIONS_UID=Q2" class="btn btn-outline-primary"
          >prev</a
        >
        <a href="/polls/PollServlet?QUESTIONS_UID=Q4" class="btn btn-outline-primary"
          >next</a
        >
       
      <%} %>
            <%-- 4page --%>
      <% if((int)question.get("ORDERS") == 4){ %>
        <a href="/polls/PollServlet?QUESTIONS_UID=Q3" class="btn btn-outline-primary"
          >prev</a
        >
        <a href="/polls/PollServlet?QUESTIONS_UID=Q5" class="btn btn-outline-primary"
          >next</a
        >
       
      <%} %>
            <%-- 5page --%>
      <% if((int)question.get("ORDERS") == 5){ %>
        <a href="/polls/PollServlet?QUESTIONS_UID=Q4" class="btn btn-outline-primary"
          >prev</a
        >
 
       
      <%} %>
      </div>
      
      <div class="border fs-6 text-align-center" style="height: 4rem">
      


      <div><%= question.get("ORDERS") %>. <%= question.get("QUESTION")%></div>
      </div>
      <div class="d-flex flex-column mt-3">
        <% for(int i=0; i<answers.size(); i++){ %>
        <div class="mb-3"><input type="radio" name="chck_info" /> <%= answers.get(i) %></div>
        <% } %>
      </div>
    </div>
</body>

</html>