package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Skills;

public interface SkillRepository extends JpaRepository<Skills,Integer>{
@Query("SELECT u from Skills u where u.skillname = ?1")
List<Skills> FindBySkillName(String skillname);
}
