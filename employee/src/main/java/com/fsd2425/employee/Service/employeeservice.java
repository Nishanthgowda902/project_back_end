package com.fsd2425.employee.Service;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.fsd2425.employee.Entity.employe;
import com.fsd2425.employee.Repository.employeerepo;
import com.mongodb.MongoException;



@Service
public class employeeservice {
	@Autowired
    private employeerepo repo;
    
    public ResponseEntity<?> load() {
        return ResponseEntity.ok("Welcome to MongoDb Crud Demo...");
        
    }
        
        public ResponseEntity<?> getAllemploye() {
            List<employe> employelist = repo.findAll();
            if (employelist.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No employee Found");
            } else {
  				return ResponseEntity.ok(employelist);
            }
        }
            
            public ResponseEntity<?> insertemploye(employe em) {
                List<employe> employelist = new ArrayList<>();
                String err_msg = "";
                try {
                    repo.save(em);
                } catch (MongoException e) {
                    err_msg = e.getMessage();
                    return ResponseEntity.internalServerError().body(err_msg);
                }
                employelist = repo.findAll();
                if (employelist.isEmpty()) {
                    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No employee Found");
                } else {
                    return ResponseEntity.ok(employelist);
                }

          }
            public ResponseEntity<?> updateemploye(employe em) {
                Optional<employe> existingbook = repo.findByEid(em.getEid()); 
                List<employe> updatedemploye = new ArrayList<>();
                if (!existingbook.isPresent()) {
                    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Specified employee with eid : " + em.getEid() + " not found.");
                } else {
                    try {
                        repo.deleteByEid(em.getEid()); 
                        repo.save(em);
                        updatedemploye = repo.findAll();
                        return ResponseEntity.ok(updatedemploye);
                    } catch (MongoException e) {
                        return ResponseEntity.internalServerError().body(e.getMessage());
                    }
                }
            }
            public ResponseEntity<?> deleteExistingemploye(String Eid) {
                List<employe> newemployeelist = new ArrayList<>();
                System.out.println(repo.existsByEid(Eid));  
                
                if (repo.existsByEid(Eid)) {  
                    try {
                        repo.deleteByEid(Eid);  
                        newemployeelist = repo.findAll();
                        return ResponseEntity.ok(newemployeelist);
                    } catch (MongoException e) {
                        return ResponseEntity.internalServerError().body(e.getMessage());
                    }
                } else {
                    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Specified employee with eid: " + Eid + " not found.");
                }
            }
    }




