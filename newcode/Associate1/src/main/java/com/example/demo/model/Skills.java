package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="skills")

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
	@ManyToMany()
	public List<Associate> associate;
	public int getSkillid() {
		return skillid;
	}
	public void setSkillid(int skillid) {
		this.skillid = skillid;
	}
	public String getSkillname() {
		return skillname;
	}
	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}
	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public List<Associate> getAssociate() {
		return associate;
	}
	public void setAssociate(List<Associate> associate) {
		this.associate = associate;
	}
	public Skills(int skillid, String skillname, String startdate, String enddate, List<Associate> associate) {
		super();
		this.skillid = skillid;
		this.skillname = skillname;
		this.startdate = startdate;
		this.enddate = enddate;
		this.associate = associate;
	}
}
