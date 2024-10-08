package com.fsd2425.Crudjpa.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="student")
public class student {
@Id
private String regno;
private String name;
private String branch;
private int sem;

public student () {}

public student(String regno, String name, String branch, int sem) {
	super();
	this.regno = regno;
	this.name = name;
	this.branch = branch;
	this.sem = sem;
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

public String getBranch() {
	return branch;
}

public void setBranch(String branch) {
	this.branch = branch;
}

public int getSem() {
	return sem;
}

public void setSem(int sem) {
	this.sem = sem;
}

@Override
public String toString() {
	
	return ("{\n\"Regno\":\""+regno+
			"\",\n\"Name\":\""+name+
			"\",\n\"Sem\":"+sem+
			"\",\n\"Branch\":\""+branch+
			"\"}");
}


}
