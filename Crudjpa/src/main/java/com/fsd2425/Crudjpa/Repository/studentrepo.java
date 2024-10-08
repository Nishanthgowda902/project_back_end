package com.fsd2425.Crudjpa.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface studentrepo extends JpaRepository <com.fsd2425.Crudjpa.Entity.student,String>{
	@Query(value="select s.regno,s.name,s.sem,d.depname,d.hod "+ 
			   "from student s, department d "+ 
			   "where s.branch=d.depid" , nativeQuery=true)
	public List <Object []> getDetails();

}



