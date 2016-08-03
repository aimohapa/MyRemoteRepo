package com.flp.ems.domain;

import java.util.Scanner;

public class Project {
	  int projid,depid;
	 String name,desp;
	 
	 Scanner sc = new Scanner(System.in);
	
	public int getDepid() {
		
		
		return depid;
	}
	public void setDepid(int depid) {
		Department d = new Department();
		depid=d.departmentid;
	}
	public int getProjid() {
		
		
		return projid;
	}
	public void setProjid(int projid) {
		this.projid = projid;
	}
	public String getName() {
		
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesp() {
		
		
		return desp;
	}
	public void setDesp(String desp) {
		this.desp = desp;
	}
	
}
