package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
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
@Table(name="associate")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Associate{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int associateid;
	private String associatefirstname;
	private String associatelastname;
	private String gender;
	private Date dob;
	@Column(unique=true)
	private String associateemail;
	private String associatecountry;
	@Column(unique=true)
	private String associatemobilenumber;
	private String password;
}
