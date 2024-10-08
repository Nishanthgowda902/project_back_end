package com.fsd2425.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class student {
	private String regno;
	private String name;
	@Autowired
	@Qualifier("add3")
	private Address add;
	@Autowired
	@Qualifier("cls")
	private ClassStudy cls;
	
	public student() {}

	public student(String regno, String name) {
		super();
		this.regno = regno;
		this.name = name;
		
	}

	public String getRegno() {
		return regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public String toString() {
		return("{\"Regno\":\""+regno+"\",\n\"Name\":\""+name+"\",\n\"Address\":\""+add+"\",\n\"ClassStudying\":\""+cls+"\"}");
	}
	
}

