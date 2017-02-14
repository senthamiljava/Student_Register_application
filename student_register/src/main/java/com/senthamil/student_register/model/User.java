package com.senthamil.student_register.model;

import lombok.Data;

@Data
public class User {
	private int id;
	private String name;
	private String password;
	private String emailId;
	private Long mobile_number;
}
