package com.fsd2425.Crudjpa.dto;

public class studdetail {
	private String regno;
	private String name;
	private int sem;
	private String depname;
	private String hod;
	
	public studdetail() {}

	public studdetail(String regno, String name,int sem, String depname, String hod) {
		super();
		this.regno = regno;
		this.name = name;
		this.sem = sem;
		this.depname = depname;
		this.hod = hod;
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

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
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
		
		return ("{\n\"Regno\":\""+this.regno+
				"\",\n\"Name\":\""+this.name+
				"\",\n\"Sem\":"+this.sem+
				"\",\n\"DeptName\":\""+this.depname+
				"\",\n\"HOD\":\""+this.hod+
				"\"}");

}


}
