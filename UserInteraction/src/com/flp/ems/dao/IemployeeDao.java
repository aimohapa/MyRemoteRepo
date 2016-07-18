package com.flp.ems.dao;

import java.util.HashMap;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {
	
	public Employee AddEmployee(Employee e);
	public void  ModifyEmployee(HashMap empModifiedDetails,String empid,int ch);
	public boolean RemoveEmployee(String a);
	public Employee SearchEmployee(String name,String email,String kinid);
	public void getallEmployee();
}
