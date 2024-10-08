package com.fsd2425.bookscrud.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fsd2425.bookscrud.Entity.books;

@Repository
public interface booksrepo extends MongoRepository<books, String> {
    
    
    public void deleteByIsbn(String isbn);      
    
    public Optional<books> findByIsbn(String isbn); 
    
    public boolean existsByIsbn(String isbn);    
}


