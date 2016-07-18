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

	public String EmpId;
	
	public String dob;

	public String doj;
	
	String e,name,email,kin;
	int did=100;
	int projid=200;
	int roleid=300;
	HashMap mapStudent = new HashMap<>();
		
	Scanner sc = new Scanner(System.in);
	EmployeeServiceImpl k= new EmployeeServiceImpl();
	
	public void AddEmployee(){
		System.out.println("Enter no of data to be entered ");
		int n = sc.nextInt();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			
			Employee e= new Employee();
			
			System.out.println("Enter the name");
			 nm = sc.next();
			
			
			 EmpId = UUID.randomUUID().toString();
			
			System.out.println(EmpId);
			
			System.out.println("Enter the KinId");
			 ki = sc.next();
			
			
			System.out.println("Enter the emailId");
			ei = sc.next();
			
			
			System.out.println("Enter the phone no");
			 pn = sc.next();
						
			System.out.println("Enter the Address");
			 ad = sc.next();
			
			
			System.out.println("Enter the date of birth");
			 dob = sc.next();
			
			
			
			System.out.println("Enter the date of joining");
			 doj = sc.next();
			
					
			
			
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
				ch=sc.nextInt();
				switch(ch){
				case 3:
					
					e.setDepartmentid(did);
					did++;
					
					
					e.setProjectid(projid);
					projid++;
					
					e.setRolesid(roleid);
					roleid++;
					break;
					
				case 4:
					
					e.setDepartmentid(did);
					did++;
					
					
					e.setProjectid(projid);
					projid++;
					
					e.setRolesid(roleid);
					roleid++;
					break;
					
					
				case 5:
					
					e.setDepartmentid(did);
					did++;
					e.setProjectid(projid);
					projid++;
					e.setRolesid(roleid);
					roleid++;
					break;
					
				}
				
						
			case 2:
				
				e.setDepartmentid(did);
				did++;
				e.setProjectid(projid);
				projid++;
				e.setRolesid(roleid);				
				roleid++;
			break;
			}
		
			 
			 
			 int de = e.getDepartmentid();
			 System.out.println(de);
			 int pe = e.getProjectid();
			 System.out.println(pe);
			int re = e.getRolesid();
			 System.out.println(re);
			 	mapStudent.put("Kinid",ki);
				mapStudent.put("Emailid",ei);
				mapStudent.put("Name", nm);
				mapStudent.put("Phone", pn);
				mapStudent.put("Address", ad);
				if(Validate.validatedate(doj, "dd/mm/yyyy"))
						mapStudent.put("DOJ", doj);
				if(Validate.validatedate(dob,"dd/mm/yy"))
						mapStudent.put("DOB",dob);
				
				mapStudent.put("Dept", de);
				mapStudent.put("Project", pe);
				mapStudent.put("Role", re);
				
				
				
				//EmployeeServiceImpl ew= new EmployeeServiceImpl();
				k.AddEmployee(mapStudent);
							
				

		}
	}

	public void ModifyEmployee(){
		
		System.out.println("kin_id");
		String empId;
		empId=sc.next();
		Employee emp=k.SearchEmployee("*","*", empId);
		if(emp!=null)
		{ 	
					HashMap empModifiedDetails=new HashMap();
					System.out.println("Modify Employee by:");
					System.out.println("1.Modify  Name:");
					System.out.println("2.Modify  emailId:");
					System.out.println("3.Modify  KinId:");
					System.out.println("4.Modify  Address:");
					System.out.println("5.Modify  phone number:");
					System.out.println("6.Modify  Date of birth:");
					System.out.println("7.Modify  Date of joinig:");
					
					System.out.println("Enter ur choice:"); 	
					int ch=sc.nextInt();
					
					switch(ch)
					{
						case 1:System.out.println("Enter The name");
							empModifiedDetails.put("empName", sc.next());
							k.ModifyEmployee(empModifiedDetails,empId,ch);
							break;
						case 2:
							System.out.println("Enter The email");
							empModifiedDetails.put("email", sc.next());
							k.ModifyEmployee(empModifiedDetails,empId,ch);
							break;
						case 3:
							System.out.println("Enter The empId");
							empModifiedDetails.put("Kini", sc.next());
							k.ModifyEmployee(empModifiedDetails,empId,ch);
							break;
						case 4:
							System.out.println("Enter The Address");
							empModifiedDetails.put("Addr", sc.next());
							k.ModifyEmployee(empModifiedDetails,empId,ch);
							break;
						case 5:
							System.out.println("Enter The Phone number");
							empModifiedDetails.put("Phon", sc.next());
							k.ModifyEmployee(empModifiedDetails,empId,ch);
							break;
						case 6:
							System.out.println("Enter The date of birth");
							empModifiedDetails.put("dateob", sc.next());
							k.ModifyEmployee(empModifiedDetails,empId,ch);
							break;
						case 7:
							System.out.println("Enter The date of joining");
							empModifiedDetails.put("dateoj", sc.next());
							k.ModifyEmployee(empModifiedDetails,empId,ch);
							break;
					   		
					}
		
		}

		
	}

	public void RemoveEmployee(){
		System.out.println("Enter the kin id to remove the data");
		e=sc.next();	
		k.RemoveEmployee(e);
	}
//	public void SearchEmployee(){
//		System.out.println("Enter the employee id to search the data");
//		 e=sc.next();	
//		k.SearchEmployee(e);
//	}
	
	public Employee  SearchEmployee() {
		System.out.println("Enter option \n 1.name only \n2.email id \n3.kinid  \n4.name & email \n5.name & kinid \n6.email and kinid \n7.name email and kinid three");
		int opt = sc.nextInt();
		switch(opt)
		{
		case 1:
			
			System.out.println("Enter Name to be searched");
			name=sc.next();
			return k.SearchEmployee(name,"*","*");
			
		
		case 2:
			System.out.println("enter email to be searched");
		 email=sc.next();
		 return k.SearchEmployee("*",email,"*");
		 
		
		case 3:
			
			System.out.println("enter kin id to be searched");
			 kin=sc.next();
			return k.SearchEmployee("*","*",kin);
			 
		case 4:
			System.out.println("enter email and name to be searched");
			System.out.println("Enter Name to be searched");
			name=sc.next();
			System.out.println("enter email to be searched");
			email=sc.next();
			
		return	k.SearchEmployee(name,email,"*");
			
			
		case 5:
			System.out.println("enter  name  and kin id to be searched");
			System.out.println("Enter Name to be searched");
			name=sc.next();
			System.out.println("enter email to be searched");
			kin=sc.next();
			
			return k.SearchEmployee(name,"*",kin);
			
		case 6:
			System.out.println("enter email and kinidto be searched");
			System.out.println("Enter email to be searched");
			email=sc.next();
			System.out.println("enter kinid to be searched");
			kin=sc.next();
			
			return k.SearchEmployee("*",email,kin);
			 
		case 7:
			System.out.println("enter name, email id and kinid to be searched");
			System.out.println("Enter name to be searched");
			name=sc.next();
			System.out.println("Enter email to be searched");
			email=sc.next();
			System.out.println("enter kinid to be searched");
			kin=sc.next();
			
			return k.SearchEmployee(name,email,kin);
			
			
		}	
		return null;
		
	}	
	
	
	
	public void getAllEmployee(){
		
		
		k.getallEmployee();
	}
};

