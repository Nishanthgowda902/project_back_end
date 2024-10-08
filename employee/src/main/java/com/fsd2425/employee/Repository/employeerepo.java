package com.fsd2425.employee.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fsd2425.employee.Entity.employe;



@Repository
public interface employeerepo extends MongoRepository<employe, String> {
	
	public void deleteByEid(String eid); 
	
	public Optional<employe> findByEid(String eid); 
	
	public boolean existsByEid(String eid);
    

}
  