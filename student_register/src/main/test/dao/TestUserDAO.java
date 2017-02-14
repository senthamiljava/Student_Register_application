package com.senthamil.student_registre.dao;

import com.senthamil.student_register.dao.UserDAO;
import com.senthamil.student_register.model.User;

public class TestUserDAO {

	public static void main(String[] args) {
		User user = new User();
//		user.setEmailId("senthamild@revature.com");
//		user.setMobile_number(1456376L);
//		user.setName("thamil");
//		user.setPassword("pass@123");
		UserDAO userDao = new UserDAO();
//		userDao.addUser(user);
		user=userDao.login("itsmesentamil@gmail.com","pass@123");
		System.out.println(user);

	}

}
