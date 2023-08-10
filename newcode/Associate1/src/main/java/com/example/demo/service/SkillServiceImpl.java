package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Associate;
import com.example.demo.model.Skills;
import com.example.demo.repo.SkillRepository;
import com.example.demo.service.SkillsService;
import lombok.AllArgsConstructor;

@Service

public class SkillServiceImpl implements SkillsService{
	private final SkillRepository repo;
	public SkillServiceImpl(SkillRepository repo) {
		super();
		this.repo = repo;
	}

	public Skills createskill(Skills skill) {
		return repo.save(skill);
	}

	@Override
	public Skills getskillsbyid(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<Skills> getallskills() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Skills updateskill(int id,Skills skill) {
		Skills k=repo.findById(id).get();
		if(k!=null)
		{
			k.setSkillname(skill.getSkillname());
			k.setStartdate(skill.getStartdate());
			k.setEnddate(skill.getEnddate());
			repo.save(k);
			return k;
		}
		return null;
	}

	@Override
	public String deleteskills(int id) {
		String s=null;
		Skills k=repo.findById(id).get();
		if(k!=null)
		{repo.delete(k);
		 s="done";
		}
		return s;
	}

	@Override
	public Skills insertassociatedetails(int id,Associate associate) {
		Skills s=repo.findById(id).get();
	    List<Associate> a=s.getAssociate();
	    a.add(associate);
	    s.setAssociate(a);
	    repo.save(s);
		return s;
	}

	@Override
	public Skills updateskillname(int id, String name) {
		Skills s=repo.findById(id).get();
		s.setSkillname(name);
		repo.save(s);
		return s;
	}

	@Override
	public Skills updatestartdate(int id, String date) {
		Skills s=repo.findById(id).get();
		s.setStartdate(date);
		repo.save(s);
		return s;
	}

	@Override
	public Skills updateenddate(int id, String date) {
		Skills s=repo.findById(id).get();
		s.setEnddate(date);
		repo.save(s);
		return s;
	}

}
