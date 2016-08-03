package com.flp.ems.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;
import com.flp.ems.util.Validate;

/*public class EmployeeDaoImplForList implements IemployeeDao 
{
	List<Employee> emparrlist = new ArrayList<Employee>();
	List<Employee> department = new ArrayList<Employee>();
	List<Employee> project = new ArrayList<Employee>();
	List<Employee> role = new ArrayList<Employee>();

	@Override
 public Employee AddEmployee(Employee e,Department d,Project p,Role r)
{
	  	  
	  emparrlist.add(e);
	  return e;
}
	 

	@Override
	public void ModifyEmployee(HashMap empModifiedDetails,String empid,int ch)
	{
		Employee emp=SearchEmployee("*","*",empid);
		int index=emparrlist.indexOf(emp);
		RemoveEmployee(emp.getKinId());
		switch(ch)
		{
		case 1:
			emp.setName((String) empModifiedDetails.get("empName"));
			if(Validate.validatename(emp.getName()))
			{
			emparrlist.add(index,emp);
			}
			
			break;
			
			
		case 2:
			emp.setEmailid((String) empModifiedDetails.get("email"));
			if(Validate.validateEmailId(emp.getEmailid()))
			{
			emparrlist.add(index,emp);
			}
			
			break;
				
		case 3:
			emp.setKinId((String) empModifiedDetails.get("Kini"));
			if(Validate.validateKinId(emp.getKinId()))
			{
			emparrlist.add(index,emp);
			}
			
			break;
			
		case 4:
			emp.setAddress((String) empModifiedDetails.get("Addr"));
			if(Validate.validateAddress(emp.getAddress()))
			{
			emparrlist.add(index,emp);
			}
			
			break;
			
		case 5:
			emp.setPhoneno((String) empModifiedDetails.get("Phon"));
			if(Validate.validatePhone(emp.getPhoneno()))
			{
			emparrlist.add(index,emp);
			}
			
			break;
			
		case 6:
			emp.setDateofbirth((String) empModifiedDetails.get("dateob"));
			if(Validate.validatedate(emp.getDateofbirth(), "dd/mm/yyyy"))
			{
			emparrlist.add(index,emp);
			}
			
			break;
			
		case 7:
			emp.setDateofJoining((String) empModifiedDetails.get("dateoj"));
			if(Validate.validatedate(emp.getDateofJoining(), "dd/mm/yyyy"))
			{
			emparrlist.add(index,emp);
			}
			
			break;
		}
	}

	

@Override
public boolean RemoveEmployee(String a)
{
	
for(Employee e : emparrlist){
	if(e.getKinId().equals(a))
	{
		emparrlist.remove(e);
		System.out.println("Removed with kin id"+a);
		return true;
	}
		
}
return false;
}


@Override
public Employee SearchEmployee(String name,String email,String kinid)
{	
	for(Employee e:emparrlist)
	{
		 if(e.getName().equals(name))
		{
			System.out.println("match found for name provided");
		
			return e;
			
		}
		  
		  else if( e.getEmailid().equals(email))
			{
				System.out.println("match found for email id provided ");
				return e;
				
			}
		  else if( e.getKinId().equals(kinid))
			{
				System.out.println(" match found for kin id provided");
			return e;
			}	
			
			else if(e.getName().equals(name) && e.getEmailid().equals(email) && e.getKinId().equals(kinid))
		{
			System.out.println("match found for name,email id and kin id provided");
		
			return e;
			
		}
		 else if(e.getName().equals(name) && e.getEmailid().equals(email))
			{
				System.out.println("match found for name,email id provided");
			return e;
			
				
			}
		 else if( e.getEmailid().equals(email) && e.getKinId().equals(kinid))
			{
				System.out.println("match found for email id and kin id provided");
			
			return e;
				
			}
		 else if(e.getName().equals(name)  && e.getKinId().equals(kinid))
			{
				System.out.println("match found for name and kin id provided");
			
			return e;
				
			}
		
	}
	return null;
}

@Override
public void getallEmployee()
{	
	

	
	for(Object obj:emparrlist)
	{
		System.out.println(obj);
	}

} 
	
	

}*/
