package com.fsd2425.employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.fsd2425.employee.Entity.employe;
import com.fsd2425.employee.Service.employeeservice;



@RestController
public class employeectrl {
	 @Autowired
	    private employeeservice s;

	    @GetMapping("/")
	    public String display(){
	        return "Welcome";
	    }

	    @GetMapping("/list")
	    public ResponseEntity<?>  getAllemploye(){
	        return s.getAllemploye(); 
	    }
	    @DeleteMapping ("/del/{Eid}")
	    public ResponseEntity<?> deleteExistingemploye(@PathVariable String Eid) {
	        return s. deleteExistingemploye(Eid); 
	    }
	    @PostMapping("/insert")
	    public ResponseEntity<?> insertemploye(@RequestBody employe e){
	        return s.insertemploye(e);
	    }
	    @PutMapping ("/update")
	    public ResponseEntity<?> updateemploye(@RequestBody employe e){
	        return s.updateemploye(e);
	    }
	    

}
