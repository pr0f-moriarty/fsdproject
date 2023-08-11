package com.example.demo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Associate;
import com.example.demo.entity.Skills;

@FeignClient(value ="ASSOCIATE-SERVICE")
public interface FeignClientAssociate
{
	@GetMapping("/associate/getallassociate")
	List<Associate> getallassociate();
	@PostMapping("/associate/createassociate")
	public Associate createAssociate( @RequestBody Associate associate);
	@GetMapping("/associate/getassociatebyid/{id}")
	public Associate getAssociateById(@PathVariable("id") int id);
	@PutMapping("/associate/updateassociate/{id}")
	public Associate updateAssociate(@PathVariable("id") int id,@RequestBody Associate a);
	@DeleteMapping("/associate/deleteassociate/{id}")
	public String deleteAssociate(@PathVariable("id") int id);
	@GetMapping("/associate/findassociatebycountry/{country}")
	public List<Associate> getAssociateByCountry(@PathVariable String country);
	@GetMapping("/associate/findassociatebyemail/{email}")
	public Associate getAssociateByEmail(@PathVariable("email") String email);
	@GetMapping("/associate/findassociatebyskillname/{skillname}")
	public List<Associate> getAssociateBySkill(@PathVariable("skillname") String skillname);
	@GetMapping("/associate/findassociatebymobilenumber/{mobilenumber}")
	public Associate getAssociateByMobileNumber(@PathVariable("mobilenumber") String mobilenumber);
	@GetMapping("/skills/getallskills")
	List<Skills> getallskills();
	@GetMapping("/skills/getskillsbyid/{id}")
	public Skills getskillsbyid(@PathVariable("id") int id);
	@PostMapping("/skills/createskills")
	public Skills createSkillsDto(@RequestBody Skills skill);
	@DeleteMapping("/skills/deleteskills/{id}")
	public String deleteSkillsDto(@PathVariable("id") int id);
	@PutMapping("/skills/updateskills/{id}")
	public Skills updateSkillsDto(@PathVariable("id") int id,@RequestBody Skills skill);
	@PostMapping("/insertassociatedetails/{id}")
	public Skills insertassociatedetails(@PathVariable("id") int id,@RequestBody Associate associate);
	
}
