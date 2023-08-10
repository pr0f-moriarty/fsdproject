package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Associate;
import com.example.demo.model.Skills;

public interface SkillsService {
Skills createskill(Skills skill);
Skills getskillsbyid(int id);
List<Skills> getallskills();
Skills updateskill(int id,Skills skill);
String deleteskills(int id);
Skills insertassociatedetails(int id, Associate associate);
Skills updateskillname(int id , String name);
Skills  updatestartdate(int id,String date);
Skills updateenddate(int id,String date);
}
