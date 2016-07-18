package com.flp.ems.service;

import java.awt.Robot;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.dao.IemployeeDao;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;
import com.flp.ems.util.Validate;
import com.flp.ems.view.UserInteraction;

public class EmployeeServiceImpl implements IEmployeeService{
	
	EmployeeDaoImplForList l= new EmployeeDaoImplForList();
	Set<String> hskinid = new HashSet<>();
	Set<String> hsemailid = new HashSet<>();
	private String ki;
	private String ei;
	@Override
	public void AddEmployee(HashMap hm)
	{
		ki=(String)hm.get("Kinid");
		ei=(String)hm.get("Emailid");
		Employee e = new Employee();
		Project p = new Project();
		Department d= new Department();
		Role r = new Role();
		
		
		UserInteraction u = new UserInteraction();
		
		boolean b=Validate.validatename((String)hm.get("Name"));
		boolean b1=Validate.validateKinId((String)hm.get("Kinid"));
		boolean b2=Validate.validateAddress((String)hm.get("Address"));
		boolean b3=Validate.validateEmailId((String)hm.get("Emailid"));
		boolean b4=Validate.validatePhone((String)hm.get("Phone"));
		if(b && b1 && b2 && b4)
		{
			e.setName((String)hm.get("Name"));
			e.setKinId((String)hm.get("Kinid"));
			e.setAddress((String)hm.get("Address"));
			e.setEmailid((String)hm.get("Emailid"));
			e.setPhoneno((String)hm.get("Phone"));
		}
		else
		{System.out.println("inavalid");}
		
		
		
		if(hskinid.contains(ki))
		{
			System.out.println("kinid already exist");
			return;
		}
		else
		{	hskinid.add(ki);
		}
		
		if(hsemailid.contains(ei))
		{
			System.out.println("emailid already exist");
			return;
		}
		else
		{	hsemailid.add(ei);
		}
		
		
		e.setName((String)hm.get("Name"));
		e.setKinId((String)hm.get("Kinid"));
		e.setAddress((String)hm.get("Address"));
		e.setEmailid((String)hm.get("Emailid"));
		e.setPhoneno((String)hm.get("Phone"));
	
		e.setDateofbirth((String)hm.get("DOB"));
		e.setDateofJoining((String)hm.get("DOJ"));
		e.setDepartmentid((int)hm.get("Dept"));
		e.setProjectid((int)hm.get("Project"));
		e.setRolesid((int)hm.get("Role"));
		
		d.setDepartmentid((int)hm.get("Dept"));
		d.setName("Cloud");
		d.setDesp("worling in cloud");
		
		p.setDepid((int)hm.get("Dept"));
		p.setProjid((int)hm.get("Project"));
		p.setName("Morgan Stanley");
		p.setDesp("working in project");
		
		r.setRoleid((int)hm.get("Role"));
		r.setName("Developer");
		r.setDesp("setting code");
		
		
		l.AddEmployee(e);	
			}
	@Override
	public void ModifyEmployee(HashMap hm,String a,int ch)
	{
		l.ModifyEmployee(hm, a, ch);
	}
	@Override
	public void RemoveEmployee(String a)
	{
		
		l.RemoveEmployee(a);
	}
	@Override
	public Employee SearchEmployee(String name,String email,String kinid) {
		
		
		return l.SearchEmployee(name, email,kinid);
		
	}
	@Override
	public void getallEmployee()
	{
		
		l.getallEmployee();
		
	}
	
	

}
