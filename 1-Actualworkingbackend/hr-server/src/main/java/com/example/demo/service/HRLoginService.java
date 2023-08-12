package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.example.demo.entity.HR;
import com.example.demo.repository.HRLoginRepository;

@Service
public class HRLoginService 
{
	@Autowired
	private HRLoginRepository repo;
	
	
	@Autowired
	public HRLoginService(HRLoginRepository repo) {
		super();
		this.repo = repo;
		
	}
	
	
	public HR createHR(HR hr) {
		//String bpass = bCryptPasswordEncoder.encode(hr.getUserPassword());
		//hr.setBcryptPass(bpass);
		//System.out.println(hr.getBcryptPass());
		
    	return repo.save(hr);
	}

public HR verifyUser(String email, String pass ) {
	
	HR hr = repo.findByUserEmail(email);
	System.out.println(email);
	if(hr!=null) {
		    if(hr.getUserEmail().equals(email) && hr.getUserPassword().equals(pass))
		    {
		    	System.out.println("success");
			return hr;
		    }
		  else
		  {
			  System.out.println("wrong");
			return null;
		  }
		}
	else {
		System.out.println("null");
		return null;
		}
}
	

	public List<HR> getAllHR() 
	{
		return repo.findAll();
	}

	public void updateHR(HR hr) {
	    //String bpass = bCryptPasswordEncoder.encode(hr.getUserPassword());
		//hr.setBcryptPass(bpass);
		//System.out.println(hr.getBcryptPass());
    	repo.save(hr);
	}

	

	public HR getHRById(int id) {
		return repo.findById(id);
	}
	public void delete(int id)
	{
		repo.deleteById(id);
	}
	
}
