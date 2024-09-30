package com.BeingTech.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BeingTech.Dto.UsersDto;
import com.BeingTech.Service.IUserservice;
import com.BeingTech.ServiceFactory.UserServiceFactory;

@MultipartConfig
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		
		//reading data
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
//		String terms=request.getParameter("terms");
		   System.out.println("Email: " + email); 
		//
		UsersDto udto = new UsersDto();
		udto.setName(username);
		udto.setEmail(email);
		udto.setPazzword(password);
		udto.setGender(gender);
		
		IUserservice userService = UserServiceFactory.getUserService();
		boolean status = userService.saveUser(udto);

		if(status) {
			out.println("done");
			System.out.println("User save");
		}
		else {
			System.out.println("something wrong is userdao");
		}
		//		video - 4 time 20:20 open register user form
	}

}
