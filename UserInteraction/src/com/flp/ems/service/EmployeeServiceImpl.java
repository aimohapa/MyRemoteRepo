package com.flp.ems.service;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.util.Validate;
import com.flp.ems.view.UserInteraction;

public class EmployeeServiceImpl implements IEmployeeService{
	
	@Override
	public void AddEmployee(HashMap hm)
	{
		Employee e = new Employee();
		
		UserInteraction u = new UserInteraction();
		//Validate vj = new Validate();
		if(Validate.validatename(u.nm)== true)
		{
			e.setName((String)hm.get("Name"));
		}
		else
			e.setName(null);
		
		if(Validate.validateKinId(u.ki)==true)
		{
		e.setKinId((String)hm.get("Kinid"));
		}
		else
		e.setKinId(null);
		
		if(Validate.validateAddrerss(u.ad)==true)
		{
			e.setAddress((String)hm.get("Address"));
		}
		else
			e.setAddress(null);
		
		if(Validate.validateEmailId(u.ei)==true)
		{
			e.setEmailid((String)hm.get("Emailid"));
		}
				if(Validate.validatePhone(u.pn)==true)
		{
			e.setPhoneno((String)hm.get("Phone"));
		}
		else
			e.setPhoneno(null);
		
		
		
		
//		e.setName((String)hm.get("Name"));
//		e.setKinId((String)hm.get("Kinid"));
//		e.setAddress((String)hm.get("Address"));
//		e.setEmailid((String)hm.get("Emailid"));
//		e.setPhoneno((String)hm.get("Phone"));
//		
		e.setDateofbirth((String)hm.get("DOB"));
		e.setDateofJoining((String)hm.get("DOJ"));
		e.setDepartmentid((int)hm.get("Dept"));
		e.setProjectid((int)hm.get("Project"));
		e.setRolesid((int)hm.get("Role"));
		
		System.out.println(e.toString());
//		
//	String s= e.getKinId();
//	String ei = e.getEmailid();
//	
//	TreeSet t =  new TreeSet<>();
//	t.add(hm.get("Kinid"));
//	t.add(hm.get("Emailid"));
	
	
	
		
	EmployeeDaoImplForList l= new EmployeeDaoImplForList();
	l.AddEmployee(e);	
		
	}
	@Override
	public void ModifyEmployee(String a)
	{
		
	}
	@Override
	public void RemoveEmployee(String a)
	{
		EmployeeDaoImplForList l= new EmployeeDaoImplForList();
		l.RemoveEmployee(a);
	}
	@Override
	public void SearchEmployee(String a)
	{
		EmployeeDaoImplForList l= new EmployeeDaoImplForList();
		l.SearchEmployee(a);
	}
	@Override
	public void getallEmployee(HashMap hm)
	{
		EmployeeDaoImplForList l= new EmployeeDaoImplForList();
		l.getallEmployee(hm);
		System.out.println(hm);
	}
	
	

}
