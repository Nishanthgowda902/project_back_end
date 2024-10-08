package com.fsd2425.bookscrud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsd2425.bookscrud.Entity.books;
import com.fsd2425.bookscrud.Service.BooksService;

@RestController
public class bookscltr {
    	    @Autowired
	    private BooksService s;

	    @GetMapping("/")
	    public String display(){
	        return "Welcome to mongodb";
	    }

	    @GetMapping("/list")
	    public ResponseEntity<?> getbookslist(){
	        return s.getAllBooks(); 
	    }

	    @DeleteMapping ("/del/{isbn}")
	    public ResponseEntity<?> deletebooks(@PathVariable String isbn) {
	        return s. deleteExistingBook(isbn); 
	    }

	    @PostMapping ("/insert")
	    public ResponseEntity<?> insertbooks(@RequestBody books b){
	        return s.insertbooks(b);
	    }

	    @PutMapping ("/update")
	    public ResponseEntity<?> updatebooks(@RequestBody books b){
	        return s.updatebooks(b);
	    }
	}