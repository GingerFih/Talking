package com.qcby.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChatServlet
 */

@WebServlet("/ChatServlet")
//聊天列表
public class ChatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChatServlet() {
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
				"		\"id\": 1,\r\n" + 
				"		\"send_u_id\": \"123456\",\r\n" + 
				"		\"receive_u_id\": \"123457\",\r\n" + 
				"		\"content\": \"asdas\",\r\n" +
				"		\"time\": \"2022.6.6\"\r\n" + 
				"	}]\r\n" + 
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
