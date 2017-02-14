package com.senthamil.student_register.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.senthamil.student_register.dao.UserDAO;
import com.senthamil.student_register.model.User;

public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String emailId = request.getParameter("emailId");
		String mobileNumber = request.getParameter("mobileNumber");
		String password = request.getParameter("password");
		User user = new User();
		user.setEmailId(emailId);
		user.setMobile_number(Long.valueOf(mobileNumber));
		user.setName(name);
		user.setPassword(password);
		UserDAO userDAO = new UserDAO();
		userDAO.addUser(user);
		// System.out.println("successfully registered");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("successfully registered");

	}

}
