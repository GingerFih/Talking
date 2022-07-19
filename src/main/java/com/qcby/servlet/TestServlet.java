package com.qcby.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
//考试题模块
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
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
				"			\"name\": \"世上最遥远的距离，不是生与死的距离，不是天各一方， 而是我就站在你面前，你却不知道我爱你......\"\r\n" +
				"		},\r\n" +
				"\r\n" +
				"		{\r\n" +
				"			\"id\": 2,\r\n" +
				"			\"name\": \"我们放下尊严, 放下个性, 放下固执, 都只是因为放不下一个人\"\r\n" +
				"		},\r\n" +
				"\r\n" +
				"		{\r\n" +
				"			\"id\": 3,\r\n" +
				"			\"name\": \"喜欢一个人，是不会有痛苦的。爱一个人，也许有绵长的痛苦， 但他给我的快乐， 也是世上最大的快乐 \"\r\n" +
				"		},\r\n" +
				"\r\n" +
				"		{\r\n" +
				"			\"id\": 4,\r\n" +
				"			\"name\": \"爱人是很卑微的，很卑微的， 如果对方不爱你的话。\"\r\n" +
				"		}\r\n" +
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
