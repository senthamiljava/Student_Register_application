package com.senthamil.student_register.dao;

import org.springframework.dao.EmptyResultDataAccessException;

import org.springframework.jdbc.core.JdbcTemplate;

import com.senthamil.student_register.model.User;
import com.senthamil.student_register.util.ConnectionUtil;


public class UserDAO {
   JdbcTemplate jdbcTemplate=ConnectionUtil.getjdbcTemplate();
   public void addUser(User user)
   {
	   String sql="INSERT INTO user_details(NAME,email_id,mobile_number,PASSWORD) VALUES(?,?,?,?)";
	   Object[] params={user.getName(),user.getEmailId(),user.getMobile_number(),user.getPassword()};
	   int row=jdbcTemplate.update(sql,params);
	   System.out.println("number of row inserted "+row);
   }
   public User login(String email_id,String password)
   {
	   User user=null;
	   try{
	   String sql="SELECT * FROM user_details WHERE email_id=? AND PASSWORD=?;";
	   Object[] params={email_id,password};
	   user=jdbcTemplate.queryForObject(sql,params,(rs,row)->
	   {
		   User u=new User();
		   u.setId(rs.getInt("id"));
		   u.setName(rs.getString("name"));
		   u.setMobile_number(rs.getLong("mobile_number"));
		   u.setEmailId(rs.getString("email_id"));
		   u.setPassword(rs.getString("password"));
		   return u;
	   });
	   }
	   catch(EmptyResultDataAccessException e)
	   {
		   System.out.println(e);
	   }
	   return user;
   }
}
