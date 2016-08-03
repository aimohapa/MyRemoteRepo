package com.flp.ems.domain;

import java.util.Scanner;

public class Role {
	 int roleid;
	 String name,desp;
	 
	 Scanner sc = new Scanner(System.in);

	public int getRoleid() {
		
		
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
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
