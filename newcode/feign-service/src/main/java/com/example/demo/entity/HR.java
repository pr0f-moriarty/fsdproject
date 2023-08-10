package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="hr")
@Getter
@Setter

public class HR {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String userEmail;
	String userPassword;
	public int getId() {
		return id;
	}
	public HR() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HR(int id, String userEmail, String userPassword, String securityQuestion, String securityAnswer) {
		super();
		this.id = id;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "HR [id=" + id + ", userEmail=" + userEmail + ", userPassword=" + userPassword + ", securityQuestion="
				+ securityQuestion + ", securityAnswer=" + securityAnswer + "]";
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSecurityAnswer() {
		return securityAnswer;
	}
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	String securityQuestion;
	String securityAnswer;

}
