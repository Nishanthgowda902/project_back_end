package com.fsd2425.bookscrud.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="books")
public class books {
	private String isbn;
	private String booksname;
	private String author;
	private String publisher;
	private float price;
	public books() {
		
	}
	
	public books(String isbn, String booksname, String author, String publisher, float price) {
		super();
		this.isbn = isbn;
		this.booksname = booksname;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}


		
	

	public String getISBN() {
		return isbn;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	public String getBooksname() {
		return booksname;
	}

	public void setBooksname(String booksname) {
		this.booksname = booksname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return ("{\"isbn\":\""+isbn+
				"\",\n\"booksname\":\""+ booksname+
				"\",\n\"author\":\""+author+
				"\",\n\"publisher\":\""+publisher+
				"\",\n\"price\":\""+price+
				"\"}");
	}
	
}
