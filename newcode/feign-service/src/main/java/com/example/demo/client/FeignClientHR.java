package com.example.demo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.HR;


@FeignClient(value="HR-SERVER")
public interface FeignClientHR {
	@PostMapping("/api/create-hr")
	public HR createHr(@RequestBody HR hr);
	@RequestMapping(method = RequestMethod.POST, value = "/api/login")
	HR verifyUser(@RequestBody HR hr );
	@GetMapping("/api/hrDetails/all")
	public List getAllHR();
	@RequestMapping(method = RequestMethod.PATCH, value = "/updateHR")
	void updateHR(@RequestBody HR hr);
	@RequestMapping(value = "/HR/{id}", method = RequestMethod.GET)
	public HR getToDoById(@PathVariable("id") int id);
	
}
