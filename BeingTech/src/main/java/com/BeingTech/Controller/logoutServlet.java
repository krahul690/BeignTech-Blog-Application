package com.BeingTech.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.BeingTech.Dto.MessageDto;

/**
 * Servlet implementation class logoutServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/logoutServlet" })
public class logoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}
	
	public void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		HttpSession s = req.getSession();
		s.removeAttribute("currentUser");
		
		MessageDto m = new MessageDto("Logout Successfully", "success", "alert-success");
		s.setAttribute("msg", m);
		resp.sendRedirect("login_page.jsp");
	}

}
