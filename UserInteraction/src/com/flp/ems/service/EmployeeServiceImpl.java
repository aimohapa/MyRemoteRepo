package com.flp.ems.service;

import java.awt.Robot;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

//import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.dao.EmployeeDaoImplJDBC;
import com.flp.ems.dao.IemployeeDao;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;
import com.flp.ems.util.Validate;
import com.flp.ems.view.UserInteraction;

public class EmployeeServiceImpl implements IEmployeeService{
	
	//EmployeeDaoImplForList l= new EmployeeDaoImplForList();
	EmployeeDaoImplJDBC ej = new EmployeeDaoImplJDBC();
	Set<String> hskinid = new HashSet<>();
	Set<String> hsemailid = new HashSet<>();
	private String ki;
	private String ei;
	@Override
	public void AddEmployee(HashMap hm) throws ClassNotFoundException, SQLException
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
		e.setEmpid((int)hm.get("Empid"));
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
		
		
		//l.AddEmployee(e);
		ej.AddEmployee(e,d,p,r);
			}
	@Override
	public void ModifyEmployee(HashMap hm,String a,int ch)throws ClassNotFoundException, SQLException
	{
		Employee e = new Employee();
		
		e.setName((String)hm.get("empName"));
		e.setKinId((String)hm.get("Kini"));
		
		e.setAddress((String)hm.get("Addr"));
		e.setEmailid((String)hm.get("email"));
		e.setPhoneno((String)hm.get("Phon"));
	
		e.setDateofbirth((String)hm.get("Dateob"));
		e.setDateofJoining((String)hm.get("Dateoj"));
		
		
		
		
		ej.ModifyEmployee(e, a, ch);
	}
	@Override
	public void RemoveEmployee(String a) throws ClassNotFoundException, SQLException
	{
		
		//l.RemoveEmployee(a);
		ej.RemoveEmployee(a);
	}
	@Override
	public Employee SearchEmployee(String name,String email,String kinid)throws ClassNotFoundException, SQLException {
		
		
		return ej.SearchEmployee(name, email,kinid);
		
	}
	@Override
	public void getallEmployee()throws ClassNotFoundException,SQLException
	{
		
		ej.getallEmployee();
		
	}
	
	

}
