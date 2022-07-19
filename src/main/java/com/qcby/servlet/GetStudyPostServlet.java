package com.qcby.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetStudyPostServlet
 */
@WebServlet("/GetStudyPostServlet")
public class GetStudyPostServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetStudyPostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/json;charset=utf-8");

        String json="{\n" +
                "\n" +
                "\t\"data\": [{\n" +
                "\t\t\"id\": \"66\",\n" +
                "\t\t\"name\": \"hb\",\n" +
                "\t\t\"postion\": \"哈哈\",\n" +
                "\t\t\"author\": \"66\",\n" +
                "\t\t\"postcount\": \"132\",\n" +
                "\t\t\"likecount\": \"asd\"\n" +
                "\t}]\n" +
                "}";
        response.getWriter().append(json);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
