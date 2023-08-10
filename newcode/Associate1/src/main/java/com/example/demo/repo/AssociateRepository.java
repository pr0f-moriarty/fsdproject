package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Associate;

public interface AssociateRepository extends JpaRepository<Associate,Integer>{
	@Query("SELECT u FROM Associate u WHERE u.associatecountry = ?1")
	List<Associate> FindByAssociatecountry(String country);
	@Query("SELECT u FROM Associate u WHERE u.associateemail = ?1")
	Associate FindByAssociateemail(String email);
	@Query("SELECT u FROM Associate u WHERE u.associatemobilenumber = ?1")
	Associate FindByAssociatemobile(String mobile);

}
