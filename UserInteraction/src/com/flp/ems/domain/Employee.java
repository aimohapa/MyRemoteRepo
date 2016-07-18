package com.flp.ems.domain;
import java.util.Scanner;


import com.flp.ems.util.Validate;

public class Employee {

	
	String Name;
	 String KinId ;
	
	 String emailid; 
	 String Phoneno;
	 String Address;
	 String Dateofbirth;
	 String DateofJoining; 
	 int Departmentid ;
	int Projectid , Rolesid ;
	
	Scanner sc = new Scanner(System.in);
	
	Validate v = new Validate();
	
	public String getName() {
		
		
		return Name;
	}
	public void setName(String name) {
		Name = name;
		
	}
	
	
	public  String getKinId() {
		
		return KinId;
	}
	public void setKinId(String kinId) {
		KinId = kinId;
	}
	
		
	public String getEmailid() {
		
		
		
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	
	public String getPhoneno() {
		
		
		
		return Phoneno;
	}
	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}
	
	
	public String getAddress() {
		
		
		
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	public String getDateofbirth() {
		
		
		
		return Dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		Dateofbirth = dateofbirth;
	}
	
	
	
	public String getDateofJoining() {
		
		
		
		return DateofJoining;
	}
	public void setDateofJoining(String dateofJoining) {
		DateofJoining = dateofJoining;
	}
	
	public int getDepartmentid() {
		
		return Departmentid;
	}
	public void setDepartmentid(int departmentid) {
		
	Departmentid=departmentid;
	}
	public int getProjectid() {
		
		return Projectid;
	}
	public void setProjectid(int projectid) {
	
		 Projectid=projectid;
	}
	public int getRolesid() {
		
		return Rolesid;
	}
	public void setRolesid(int rolesid) {
		
		 Rolesid=rolesid;
	}
	
	
	 @Override
		public String toString() {
			return "Employee [Name=" + Name + ", KinId=" + KinId + ", emailid=" + emailid + ", Phoneno=" + Phoneno
					+ ", Address=" + Address + ", Dateofbirth=" + Dateofbirth + ", DateofJoining=" + DateofJoining
					+ ", Departmentid=" + Departmentid + ", Projectid=" + Projectid + ", Rolesid=" + Rolesid + "]";		}

	 
	 
	 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((KinId == null) ? 0 : KinId.hashCode());
		result = prime * result + ((emailid == null) ? 0 : emailid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
		{
			System.out.println("null creation");
		}
		if(obj instanceof Employee)
		{
			
			Employee ep=(Employee)obj;
			if((this.getKinId().equals(ep.getKinId()))) // (this.getEmailid().equals(ep.getEmailid()))))
			{
				System.out.println("same kin_id found");
				return true;
			}
			else if((this.getEmailid().equals(ep.getEmailid())))
			{
				System.out.println("same Email_id found");
				return true;
			}
			else if((this.getKinId().equals(ep.getKinId())) && (this.getEmailid().equals(ep.getEmailid())))
			{
				System.out.println("same kinid and emailid");
				return true;
			}
		}
		//System.out.println("add some record first");
		return false;
	}
		}
	
	
