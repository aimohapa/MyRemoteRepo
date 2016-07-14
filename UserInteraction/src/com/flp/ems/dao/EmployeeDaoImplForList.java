package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.view.UserInteraction;

public class EmployeeDaoImplForList implements IemployeeDao 
{

 public void AddEmployee(Employee e)
{
	  ArrayList<Object> arrlist = new ArrayList<Object>();
	  
	  arrlist.add(e);
	  System.out.println(arrlist);
	
}
public void ModifyEmployee(String a)
{
	
}
public void RemoveEmployee(String a)
{
	
}
public void SearchEmployee(String a)
{
	
}
public void getallEmployee(HashMap hm)
{
	System.out.println(hm);
} 
	
	

}
