package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name="skills")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Skills {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int skillid;
	private String skillname;
	private String startdate;
	private String enddate;
	@ManyToMany
	public List<Associate> associate;
}
