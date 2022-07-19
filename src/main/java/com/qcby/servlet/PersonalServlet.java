package com.qcby.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonalServlet
 */
@WebServlet("/PersonalServlet")
//个人中心页面
public class PersonalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonalServlet() {
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

		String json="{\"sad\":\"dad\",\n" +
				"\n" +
				"\"data\":[{\"urladress\":\"11\",\"likenumber\":\"666\",\"concern\":\"8938\",\"vermicelli\":\"789\",\"name\":\"韩韩\",\n" +
				"\n" +
				"\"age\":\"44\",\"signature\":\"死了都要爱\",\"uphone\":\"278378378\",\"account\":\"修改账号\",\n" +
				"\n" +
				"\"password\":\"修改密码\",\"message\":\"你好\",\"personaldata\":\"个人资料\",\"blacklist\":\"黑名单\",\n" +
				"\n" +
				"\"chat\":\"你也好\"}]}";
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
