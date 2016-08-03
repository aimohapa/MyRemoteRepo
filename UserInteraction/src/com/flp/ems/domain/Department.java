package com.flp.ems.domain;
import java.util.Scanner;
import java.util.UUID;

public class Department {
	
	  int departmentid;
	 String name;
	 String desp;
	Scanner sc = new Scanner(System.in);
	
	public int getDepartmentid() {
		
		
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
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
