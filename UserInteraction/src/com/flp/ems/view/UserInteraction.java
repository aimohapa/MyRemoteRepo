package com.flp.ems.view;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;
import java.util.UUID;



public class UserInteraction {
	public String nm;

	public String ki;

	public String ei;

	public String pn;

	public String ad;

	public String dob;

	public String doj;
	
	HashMap mapStudent = new HashMap<>();
	String EmpId = UUID.randomUUID().toString();	
	Scanner sc = new Scanner(System.in);
	
	
	public void AddEmployee(){
		System.out.println("Enter no of data to be entered ");
		int n = sc.nextInt();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			
			Employee e= new Employee();
			Project p= new Project();
			Department d= new Department();
			Role r= new Role();
			
			System.out.println("Enter the name");
			 nm = sc.next();
			//e.setName(nm);
			
			
			//Validate v =new Validate();
			//v.validateEmpId(EmpId);
			System.out.println(EmpId);
			
			System.out.println("Enter the KinId");
			 ki = sc.next();
			//e.setKinId(ki);
			
			System.out.println("Enter the emailId");
			ei = sc.next();
			//e.setEmailid(ei);
			
			System.out.println("Enter the phone no");
			 pn = sc.next();
			//e.setPhoneno(pn);
			
			System.out.println("Enter the Address");
			 ad = sc.next();
			//e.setAddress(ad);
			
			System.out.println("Enter the date of birth");
			 dob = sc.next();
			//e.setDateofbirth(dob);e.getDateofbirth();
			
			
			System.out.println("Enter the date of joining");
			 doj = sc.next();
			//e.setDateofJoining(doj);e.getDateofJoining();
					
			
			
			System.out.println("Enter 1 for financial");
			System.out.println("Enter 2 for nonfinancial");
			
			int a = 0;
			a=sc.nextInt();
			switch(a)
			{
			
			case 1:
				System.out.println("Enter 3 for ADM");
				System.out.println("Enter 4 for testing");
				System.out.println("Enter 5 for cards");
				int ch=0;
				switch(ch){
				case 3:
					d.setName("development");
					d.setDepartmentid(4004);
					d.setDesp("the description of develpoment");
					
					p.setName("cloud");
					p.setProjid(566778);
					r.setName("developer");
					r.setRoleid(56);
					break;
					
				case 4:
					d.setName("testing");
					d.setDepartmentid(4005);
					d.setDesp("the description of testing");
					
					p.setName("project testing");
					p.setProjid(566754);
					r.setName("developer");
					r.setRoleid(58);
					break;
					
					
				case 5:
					d.setName("cards");
					d.setDepartmentid(4009);
					d.setDesp("the description of cards");
					
					p.setName("project cards");
					p.setProjid(566752);
					r.setName("developer");
					r.setRoleid(55);
					break;
					
				}
				
						
			case 2:
				d.setName("nonfinanacial");
				d.setDepartmentid(4007);
				d.setDesp("nonfinancial services");
				p.setName("domain");
				p.setProjid(566781);
				r.setName("nonfinancial");
				r.setRoleid(57845);				
				
			break;
			}
		
			 
			 
			 int de = e.getDepartmentid();
			 int pe = e.getProjectid();
			int re = e.getRolesid();
			 	mapStudent.put("Kinid",ki);
				mapStudent.put(" Emailid",ei);
				mapStudent.put("Name", nm);
				mapStudent.put("Phone", pn);
				mapStudent.put("Adress", ad);
				if(Validate.validatedate(doj)==true)
				mapStudent.put("DOJ", doj);
				else
					mapStudent.put("DOJ", null);
				if(Validate.validatedate(dob)==true)
					mapStudent.put("DOB",dob);
				else
					mapStudent.put("DOB", null);
				mapStudent.put("Dept", de);
				mapStudent.put("Project", pe);
				mapStudent.put("Role", re);
				
		
				
				EmployeeServiceImpl ew= new EmployeeServiceImpl();
				ew.AddEmployee(mapStudent);
							


		}
	}

	public void ModifyEmployee(){
		
	}
	public void RemoveEmployee(){
		System.out.println("Enter the employee id to remove the data");
		String e=sc.nextLine();	
		EmployeeServiceImpl k= new EmployeeServiceImpl();
		k.RemoveEmployee(e);
	}
	public void SearchEmployee(){
		System.out.println("Enter the employee id to search the data");
		String e=sc.nextLine();	
		EmployeeServiceImpl k= new EmployeeServiceImpl();
		k.SearchEmployee(e);
	}
	public void getAllEmployee(){
		
		EmployeeServiceImpl k= new EmployeeServiceImpl();
		k.getallEmployee(mapStudent);
	}
};

