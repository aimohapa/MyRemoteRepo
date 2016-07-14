package com.flp.ems.domain;
import java.util.Scanner;
import java.util.UUID;

public class Department {
	
	  int departmentid;
	 String name;
	 String desp;
	Scanner sc = new Scanner(System.in);
	
	public int getDepartmentid() {
		
		System.out.println("Department id:"+departmentid);
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public String getName() {
		System.out.println("Department name:"+name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesp() {
		System.out.println("Department description:"+desp);
		return desp;
	}
	public void setDesp(String desp) {
		this.desp = desp;
	}
	
	

}
