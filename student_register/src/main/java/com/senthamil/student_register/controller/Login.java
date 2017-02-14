package com.senthamil.student_register.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.senthamil.student_register.dao.UserDAO;
import com.senthamil.student_register.model.User;

public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter printWriter = response.getWriter();
		String emailId = request.getParameter("email");
		String password = request.getParameter("password");
		UserDAO dao = new UserDAO();
		User user = dao.login(emailId, password);
		if (user == null)
			printWriter.print("invalid user");
		else
			printWriter.println("welcome to ----");
	}

}
