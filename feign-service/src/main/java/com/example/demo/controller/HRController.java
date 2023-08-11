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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.FeignClientAssociate;
import com.example.demo.client.FeignClientHR;
import com.example.demo.entity.Associate;
import com.example.demo.entity.HR;
import com.example.demo.entity.Skills;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/hr")
@AllArgsConstructor
public class HRController {
	private final FeignClientAssociate associate;
	private final FeignClientHR hr;
	@PostMapping("/createassociate")
	public ResponseEntity<Associate> createAssociate(@RequestBody Associate ass)
	{
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(associate.createAssociate(ass));
	}
	@GetMapping("/getallassociate")
	public ResponseEntity<List<Associate>> getallassociate()
	{
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(associate.getallassociate());
	}
	@GetMapping("/getassociatebyid/{id}")
	public ResponseEntity<Associate> getAssociateById(@PathVariable("id") int id)
	{   System.out.println(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(associate.getAssociateById(id));
	}
	@PutMapping("/updateassociate/{id}")
	public ResponseEntity<Associate> updateAssociate(@PathVariable("id") int id,@RequestBody Associate a)
	{
		Associate associate1=associate.updateAssociate(id, a);
		return ResponseEntity.status(HttpStatus.FOUND).body(associate1);
	}
	@DeleteMapping("/deleteassociate/{id}")
	public ResponseEntity<String> deleteAssociate(@PathVariable("id") int id)
	{
		String s=associate.deleteAssociate(id);
		return ResponseEntity.ok(s);
	}
	@GetMapping("/findassociatebycountry/{country}")
	public ResponseEntity<List<Associate>> getAssociateByCountry(@PathVariable("country") String country)
	{
		List<Associate> associate1=associate.getAssociateByCountry(country);
		return ResponseEntity.status(HttpStatus.FOUND).body(associate1);
	}
	@GetMapping("/findassociatebyemail/{email}")
	public Associate getAssociateByEmail(@PathVariable("email") String email)
	{
		Associate associate1=associate.getAssociateByEmail(email);
		return associate1;
	}
	@GetMapping("/findassociatebymobilenumber/{mobilenumber}")
	public ResponseEntity<Associate> getAssociateByMobileNumber(@PathVariable("mobilenumber") String mobilenumber)
	{
		Associate associate1=associate.getAssociateByMobileNumber(mobilenumber);
		return ResponseEntity.status(HttpStatus.FOUND).body(associate1);
	}
	@GetMapping("/findassociatebyskillname/{skillname}")
	public ResponseEntity<List<Associate>> getAssociateBySkill(@PathVariable("skillname") String skillname)
	{
		List<Associate> associate1=associate.getAssociateBySkill(skillname);
		return ResponseEntity.status(HttpStatus.FOUND).body(associate1);
	}
	@PostMapping("/create-hr")
	public ResponseEntity<HR> createHr(@RequestBody HR hr1) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(hr.createHr(hr1));
	}
	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public ResponseEntity<HR> verifyUser(@RequestBody HR hr1 ) {
		System.out.println("entered controller");
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(hr.verifyUser(hr1));
	}
	@GetMapping("/hrDetails/all")
	public  ResponseEntity<List> getAllHR() {
		List ul=hr.getAllHR();
		return ResponseEntity.status(HttpStatus.OK).body(ul);
		 
	}
	 @RequestMapping(value = "/HR/{id}", method = RequestMethod.GET)
		public ResponseEntity<HR> getToDoById(@PathVariable("id") int id){
	    	//HR hr = service.getHRById(id);
	    	return ResponseEntity.status(HttpStatus.ACCEPTED).body(hr.getToDoById(id));
	 }
	 @PostMapping("/skills/createskills")
		public Skills createSkillsDto(@RequestBody Skills skill)
		{
		 return associate.createSkillsDto(skill);
		}
	 @GetMapping("/skills/getallskills")
	 public List<Skills> getallskills()
	 {
		 return  associate.getallskills();
	 }
	@GetMapping("/skills/getskillsbyid/{id}")
	public Skills getskillsbyid(@PathVariable("id") int id)
	{
		return associate.getskillsbyid(id);
	}
	@DeleteMapping("/skills/deleteskills/{id}")
	public String deleteSkillsDto(@PathVariable("id") int id)
	{
		return associate.deleteSkillsDto(id);
	}
	@PutMapping("/skills/updateskills/{id}")
	public Skills updateSkillsDto(@PathVariable("id") int id,@RequestBody Skills skill)
	{
		return associate.updateSkillsDto(id, skill);
	}
	@PostMapping("/insertassociatedetails/{id}")
	public Skills insertassociatedetails(@PathVariable("id") int id,@RequestBody Associate associate1)
	{
		return associate.insertassociatedetails(id, associate1);
	}
	

}
