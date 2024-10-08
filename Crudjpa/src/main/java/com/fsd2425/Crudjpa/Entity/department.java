package com.fsd2425.Crudjpa.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="department")
public class department {
@Id
private String depid;
private String depname;
private String hod;
public department () {}
public department(String depid, String depname, String hod) {
	super();
	this.depid = depid;
	this.depname = depname;
	this.hod = hod;
}

public String getDepid() {
	return depid;
}

public void setDepid(String depid) {
	this.depid = depid;
}

public String getDepname() {
	return depname;
}

public void setDepname(String depname) {
	this.depname = depname;
}

public String getHod() {
	return hod;
}

public void setHod(String hod) {
	this.hod = hod;
}
@Override
public String toString() {
	return ("{\n\"DepId\":\""+this.depid+
			"\",\n\"DepName\":\""+this.depname+
			"\",\n\"HOD\":\""+this.hod+
			"\"}");
}
}

