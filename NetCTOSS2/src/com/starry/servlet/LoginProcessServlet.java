package com.starry.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.starry.service.AdminService;

/**
 * Servlet implementation class LoginProcessServlet
 */
@WebServlet("/LoginProcessServlet")
public class LoginProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginProcessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String randomCode = request.getParameter("randomCode");
		
		String codesave = (String) request.getSession().getAttribute("codesave");//从后台获取到的自动生成的验证码
		
		String result1="";
		String result2="";
		AdminService adminService = new AdminService();
		if(codesave.equals(randomCode)) {
			result1 = "correctcode";
		}
		if(adminService.isExist(username, password)) {
			result2 = "correctuser";
		}
		String json = "{\"result1\":\""+result1+"\",\"result2\":\""+result2+"\"}";
		response.getWriter().print(json);
		//System.out.println(username+"     "+randomCode+"  = = = = ="+result);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
