package com.fsd2425.autowiring;

import org.springframework.stereotype.Component;

@Component
public class ClassStudy {
	private int sem;
	private String branch;
	
	public ClassStudy() {}

	public ClassStudy(int sem, String branch) {
		super();
		this.sem = sem;
		this.branch = branch;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return("{\"Sem\":\""+sem+"\",\n\"Branch\":\""+branch+"\"}");
	}


}
