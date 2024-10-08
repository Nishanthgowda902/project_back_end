package com.fsd2425.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	@Bean (name="add1")
	public Address add1(){
		return new Address ("bellur","hassan","573115");
		
	}
	@Bean (name="add2")
	public Address add2(){
		return new Address ("nehru nagra","puttur","574201");
		
	}

	@Bean (name="add3")
	public Address add3(){
		return new Address ("Kalladka","bantwal");
		
	}
	
	@Bean
	@Primary
	public ClassStudy cls() {
		return new ClassStudy(5,"Computer Science");
	}
	
	@Bean
	@Scope("singleton")
	public student student() {  
		return new student ("391CS2019","nishanth");
	}
	



}
