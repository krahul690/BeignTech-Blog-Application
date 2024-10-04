package com.BeingTech.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.BeingTech.Dto.MessageDto;
import com.BeingTech.Dto.UsersDto;
import com.BeingTech.Service.IUserservice;
import com.BeingTech.ServiceFactory.UserServiceFactory;

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		String checkOut = request.getParameter("checkMeOut");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if(checkOut != null && email != null && password != null) {
		IUserservice userService = UserServiceFactory.getUserService();
		UsersDto user = userService.getUserByEmailAndPassword(email, password);
		
		if(user != null) {
			HttpSession hs = request.getSession();
			hs.setAttribute("currentUser", user);
			response.sendRedirect("profile.jsp");
			
		}
		else {
			MessageDto msg = new MessageDto("Invalid Details ! Try again", "error", "alert-danger");
			HttpSession s = request.getSession();
			s.setAttribute("msg", msg);
			response.sendRedirect("login_page.jsp");

		}
		}
		else {
			System.out.println("error");
			response.sendRedirect("error_page.jsp");
		}
	}

}
