package com.flp.ems.service;

import java.util.HashMap;

import com.flp.ems.domain.Employee;

public interface IEmployeeService {
	
	public void AddEmployee(HashMap hm);
	public void ModifyEmployee(HashMap hm,String a,int ch);
	public void RemoveEmployee(String a);
	public Employee SearchEmployee(String name,String email,String kinid);
	public void getallEmployee();

}
