package com.qcby.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/GeteMotionPostServlet")
//情感模块
public class GeteMotionPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GeteMotionPostServlet() {
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
				"\t\"sad\": \"dad\",\n" +
				"\t\"data\": [{\n" +
				"\t\t\"id\": \"1\",\n" +
				"\n" +
				"\t\t\"name\": \"大威天龙\",\n" +
				"\n" +
				"\t\t\"postime\": \"2022/6/15\",\n" +
				"\n" +
				"\t\t\"author\": \"alis\",\n" +
				"\n" +
				"\t\t\"postcount\": \"23\",\n" +
				"\n" +
				"\t\t\"likecount\": \"44\"\n" +
				"\n" +
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
