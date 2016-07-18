package com.flp.ems.domain;

import java.util.Scanner;

public class Project {
	  int projid,depid;
	 String name,desp;
	 
	 Scanner sc = new Scanner(System.in);
	
	public int getDepid() {
		
		System.out.println("Department id:"+depid);
		return depid;
	}
	public void setDepid(int depid) {
		Department d = new Department();
		depid=d.departmentid;
	}
	public int getProjid() {
		
		System.out.println("Project id:"+projid);
		return projid;
	}
	public void setProjid(int projid) {
		this.projid = projid;
	}
	public String getName() {
		
		System.out.println("Project name:"+name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesp() {
		
		System.out.println("Project description:"+desp);
		return desp;
	}
	public void setDesp(String desp) {
		this.desp = desp;
	}
	
}
