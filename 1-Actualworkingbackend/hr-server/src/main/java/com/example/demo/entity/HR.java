package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "hr")
@Component
public class HR 
{
	@Id
	@GeneratedValue
	int id;
	@Column(name = "user_email")
	String userEmail;
	@Column(name = "user_password")
	String userPassword;
	@Column(name = "security_question")
	String securityQuestion;
	@Column(name = "security_answer")
	String securityAnswer;
	
	
	
	public HR(int id, String userEmail, String userPassword, String securityQuestion, String securityAnswer
			) {
		super();
		this.id = id;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
		
	}
	public HR(String userEmail, String userPassword, String securityQuestion, String securityAnswer,
			String bcryptPass) {
		super();
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
		
	}
	public HR() {
		super();
	}
}