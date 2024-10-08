package com.fsd2425.employee.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employee")
public class employe {
	private String ename;
	private String eid;
	private String email;
	public employe(String ename, String eid, String email) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.email = email;
	}
	public employe() {
		
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return ("{\"eid\":\""+eid+
				"\",\n\"ename\":\""+ ename+
				"\",\n\"email\":\""+email+
				"\"}");
	}
	
}

