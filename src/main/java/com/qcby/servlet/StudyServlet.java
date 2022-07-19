package com.qcby.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudyServlet
 */
@WebServlet("/StudyServlet")
//学习模块
public class StudyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudyServlet() {
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

		String json="{\r\n" +
				"	\"message\": \"success\",\r\n" +
				"	\"code\": \"000\",\r\n" +
				"	\"data\": [{\r\n" +
				"			\"id\": 1,\r\n" +
				"			\"name\": \"八大排序是那些？\"\r\n" +
				"		},\r\n" +
				"		{\r\n" +
				"			\"id\": 2,\r\n" +
				"			\"name\": \"Java是值传递还是引用传递？\"\r\n" +
				"		},\r\n" +
				"		{\r\n" +
				"			\"id\": 3,\r\n" +
				"			\"name\": \"什么是128陷阱，什么是装箱和拆箱？\"\r\n" +
				"		},\r\n" +
				"		{\r\n" +
				"			\"id\": 4,\r\n" +
				"			\"name\": \"String和StringBuffer,StringBuilder的区别有哪些？所有类名包含Buffer的类的内部实现原理是什么？有什么优势？\"\r\n" +
				"		}\r\n" +
				"\r\n" +
				"	]\r\n" +
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
