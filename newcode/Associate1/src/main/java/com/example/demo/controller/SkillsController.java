package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.SkillNotCreatedException;
import com.example.demo.exception.SkillNotFoundException;
import com.example.demo.model.Associate;
import com.example.demo.model.Skills;
import com.example.demo.service.SkillsService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/skills")

public class SkillsController {
	private final SkillsService service;
	public SkillsController(SkillsService service) {
		super();
		this.service = service;
	}
	@PostMapping("/createskills")
	public Skills createskills(@RequestBody Skills skill)
	{
		Skills skills=service.createskill(skill);
		if(skills==null)
		{
			throw new SkillNotCreatedException("Skill cannot be created");
		}
		return skills;
	}
   @ExceptionHandler
   public ResponseEntity<?> handleException(SkillNotCreatedException e)
   {
	   e.setErrorReportringTime(System.currentTimeMillis());
		e.setStatusCode(HttpStatus.NOT_FOUND.value());
		
		StringBuffer sb=new StringBuffer();
		sb.append(e.getMessage());
		sb.append(e.getErrorReportringTime());
		sb.append(e.getStatusCode());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(sb);
   }
   @GetMapping("/getskillsbyid/{id}")
   public Skills getskillsbyid(@PathVariable("id") int id)
	{
		Skills skills=service.getskillsbyid(id);
		if(skills==null)
		{
			throw new SkillNotFoundException("Skill cannot be found");
		}
		return skills;
	}
   @ExceptionHandler
   public ResponseEntity<?> handleException(SkillNotFoundException e)
   {
	   e.setErrorReportringTime(System.currentTimeMillis());
		e.setStatusCode(HttpStatus.NOT_FOUND.value());
		
		StringBuffer sb=new StringBuffer();
		sb.append(e.getMessage());
		sb.append(e.getErrorReportringTime());
		sb.append(e.getStatusCode());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(sb);
   }
   @GetMapping("/getallskills")
   public List<Skills> getallskills()
   {
	   return service.getallskills();
   }
   @PutMapping("/updateskills/{id}")
   public Skills updateskills(@PathVariable("id") int id,@RequestBody Skills skill)
   {
	   Skills skill1=service.getskillsbyid(id);
	   if(skill1==null)
	   {
		   throw new SkillNotFoundException("skill cannot be found");
	   }
	   return service.updateskill(id,skill);
   }
   @DeleteMapping("/deleteskills/{id}")
   public String deleteskills(@PathVariable("id") int id)
   {
	   Skills skill1=service.getskillsbyid(id);
	   if(skill1==null)
	   {
		   throw new SkillNotFoundException("skill cannot be found");
	   }
	   return service.deleteskills(id);
   }
   @PostMapping("/insertassociatedetails/{id}")
   public Skills insertassociatedetails(@PathVariable("id") int id,@RequestBody Associate associate)
   {
	   Skills s=service.insertassociatedetails(id,associate);
	   return s;
   }
   @PutMapping("/updateskillname/{id}/{name}")
   public Skills updateskillsname(@PathVariable("id") int id,@PathVariable("name") String name)
   {
	   return service.updateskillname(id, name);
   }
   @PutMapping("/updateskillstartdate/{id}/{date}")
   public Skills updateskillsstartdate(@PathVariable("id") int id,@PathVariable("date") String date)
   {
	   return service.updatestartdate(id, date);
   }
   @PutMapping("/updateskillenddate/{id}/{date}")
   public Skills updateskillsenddate(@PathVariable("id") int id,@PathVariable("date") String date)
   {
	   return service.updateenddate(id, date);
   }
}
