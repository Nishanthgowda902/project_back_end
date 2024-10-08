package com.fsd2425.Crudjpa.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd2425.Crudjpa.Entity.student;
import com.fsd2425.Crudjpa.Repository.studentrepo;
import com.fsd2425.Crudjpa.dto.studdetail;

@Service
public class studservice {
@Autowired
private studentrepo studrepo;

public List<student> getallstudents(){
	return studrepo.findAll();
}

public student insertstudent(student st){
	studrepo.save(st);
	return st;
}

public student updatestudent(student st){
	studrepo.save(st);
	return st;
}

public student deletestudent(String id) {
    student s = studrepo.getReferenceById(id);
    studrepo.delete(s);
    return s;
}

public List<studdetail> getStudentDetails() {
	List<studdetail> detail_list=new ArrayList<>();
	List<Object[]> result= studrepo.getDetails();
	for (Object[] row : result){
		studdetail d=new studdetail();
		d.setRegno((String)row[0]);
		d.setName((String)row[1]);
		d.setSem((int)row[2]);
		d.setDepname((String)row[3]);
		d.setHod((String)row[4]);
		detail_list.add(d);
	}
	return detail_list;
}
}
