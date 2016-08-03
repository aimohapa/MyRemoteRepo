package com.flp.ems.dao;

import java.sql.SQLException;
import java.util.HashMap;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;

public interface IemployeeDao {
	
	public Employee AddEmployee(Employee e,Department d, Project p, Role r) throws ClassNotFoundException, SQLException;
	public void  ModifyEmployee(Employee e,String empid,int ch)throws ClassNotFoundException, SQLException;
	public boolean RemoveEmployee(String a)throws ClassNotFoundException, SQLException;
	public Employee SearchEmployee(String name,String email,String kinid)throws ClassNotFoundException, SQLException;
	public void getallEmployee()throws ClassNotFoundException,SQLException;
}
