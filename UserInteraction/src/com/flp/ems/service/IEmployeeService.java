package com.flp.ems.service;

import java.sql.SQLException;
import java.util.HashMap;

import com.flp.ems.domain.Employee;

public interface IEmployeeService {
	
	public void AddEmployee(HashMap hm) throws ClassNotFoundException, SQLException;
	public void ModifyEmployee(HashMap hm,String a,int ch)throws ClassNotFoundException, SQLException;
	public void RemoveEmployee(String a)throws ClassNotFoundException, SQLException;
	public Employee SearchEmployee(String name,String email,String kinid)throws ClassNotFoundException, SQLException;
	public void getallEmployee()throws ClassNotFoundException,SQLException;

}
