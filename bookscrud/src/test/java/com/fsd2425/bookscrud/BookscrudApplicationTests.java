package com.fsd2425.bookscrud;


import java.util.List;
import java.util.Optional;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.fsd2425.bookscrud.Entity.books;
import com.fsd2425.bookscrud.Repository.booksrepo;
import com.fsd2425.bookscrud.Service.BooksService;

@SpringBootTest
class BookscrudApplicationTests {				
		@Autowired
		private booksrepo r;
		@Autowired
		private BooksService s;

		@Test
		void contextLoads() {
		    ResponseEntity<?> basic_response=s.load();
		    Assertions.assertEquals(basic_response.getBody(), "Welcome to MongoDb Crud Demo...");
		}
		
		@Test
		void testInsert() {
			books newbook=new books();
			books insertedbook=new books();
			newbook.setISBN("20EC51I");
			newbook.setBooksname("PLC Training Kit");
			newbook.setAuthor("Usha Kiran");
			newbook.setPublisher("VPT Publications");
			newbook.setPrice(500);
			s.insertbooks(newbook);
			insertedbook=r.findByIsbn("20EC51I").get();
			SoftAssertions checks=new SoftAssertions();
			checks.assertThat(insertedbook.getISBN()).isEqualTo("20EC51I").withFailMessage("isbn mismatch");
			checks.assertThat(insertedbook.getBooksname()).isEqualTo("PLC Training Kit").withFailMessage("bookName mismatch");
			checks.assertThat(insertedbook.getAuthor()).isEqualTo("Usha Kiran").withFailMessage("author mismatch");
			checks.assertThat(insertedbook.getPublisher()).isEqualTo("VPT Publications").withFailMessage("publisher mismatch");
			checks.assertThat(insertedbook.getPrice()).isEqualTo(500).withFailMessage("price mismatch");
			checks.assertAll();
			r.deleteByIsbn("20EC51I");
		}
		
		@Test
		void testUpdate() {
			books newbook=new books();
			books updation=new books();
			books updated=new books();
			newbook.setISBN("20EC51I");
			newbook.setBooksname("PLC Training Kit");
			newbook.setAuthor("Usha Kiran");
			newbook.setPublisher("VPT Publications");
			newbook.setPrice(500);
			r.save(newbook);
			updation.setISBN("20EC51I");
			updation.setBooksname("PLC And PCB");
			updation.setAuthor("Usha Kiran B");
			updation.setPublisher("VPT EC Publications");
			updation.setPrice(550);
			s.updatebooks(updation);
			updated=r.findByIsbn("20EC51I").get();
			SoftAssertions checks=new SoftAssertions();
			checks.assertThat(updated.getISBN()).isEqualTo("20EC51I").withFailMessage("isbn mismatch");
			checks.assertThat(updated.getBooksname()).isEqualTo("PLC And PCB").withFailMessage("bookName not updated");
			checks.assertThat(updated.getAuthor()).isEqualTo("Usha Kiran B").withFailMessage("author not updated");
			checks.assertThat(updated.getPublisher()).isEqualTo("VPT EC Publications").withFailMessage("publisher not updated");
			checks.assertThat(updated.getPrice()).isEqualTo(550).withFailMessage("price not updated");
			checks.assertAll();
			r.deleteByIsbn("20EC51I");
			
		}
		
		@Test
		void testDelete() {
			books newbook=new books();
			newbook.setISBN("20EC51I");
			newbook.setBooksname("PLC Training Kit");
			newbook.setAuthor("Usha Kiran");
			newbook.setPublisher("VPT Publications");
			newbook.setPrice(500); 
			r.save(newbook);
			s.deleteExistingBook("20EC51I");
			Assertions.assertEquals(Optional.empty(), r.findByIsbn("20EC51I"));		
		}

		@Test
		void testRead() {
			
			int count_before=r.findAll().size();
			books newbook=new books();
			newbook.setISBN("20EC51I");
			newbook.setBooksname("PLC Training Kit");
			newbook.setAuthor("Usha Kiran");
			newbook.setPublisher("VPT Publications");
			newbook.setPrice(500);
			r.save(newbook);
			List<books> booklist=r.findAll();
			int count_after=booklist.size();
			Assertions.assertEquals(count_before+1,count_after );
			r.deleteByIsbn("20EC51I");
			}
	}