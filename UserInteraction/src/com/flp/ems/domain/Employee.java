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
		
		//System.out.println("Validation for name :"+v.validatename(Name));
		System.out.println(Name);
		return Name;
	}
	public void setName(String name) {
		Name = name;
		
	}
	
	
	public String getKinId() {
		System.out.println(KinId);
		return KinId;
	}
	public void setKinId(String kinId) {
		KinId = kinId;
	}
	
		
	public String getEmailid() {
		
		//System.out.println("Validation for emailId :"+v.validateEmailId(emailid));
		System.out.println(emailid);
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	
	public String getPhoneno() {
		
		//System.out.println("Validation for Phone no. :"+v.validatePhone(Phoneno));
		System.out.println(Phoneno);
		return Phoneno;
	}
	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}
	
	
	public String getAddress() {
		
		//System.out.println("Validation for address :"+v.validateAddrerss(Address));
		System.out.println(Address);
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	public String getDateofbirth() {
		
		System.out.println("Validation for date of birth :"+v.validatedate(Dateofbirth));
		System.out.println(Dateofbirth);
		return Dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		Dateofbirth = dateofbirth;
	}
	
	
	
	public String getDateofJoining() {
		
		System.out.println("Validation for date of joining  :"+v.validatedate(DateofJoining));
		System.out.println(DateofJoining);
		return DateofJoining;
	}
	public void setDateofJoining(String dateofJoining) {
		DateofJoining = dateofJoining;
	}
	
	public int getDepartmentid() {
		System.out.println(Departmentid);
		return Departmentid;
	}
	public void setDepartmentid(int departmentid) {
		Department d= new Department();
	departmentid = d.departmentid;
	}
	public int getProjectid() {
		System.out.println(Projectid);
		return Projectid;
	}
	public void setProjectid(int projectid) {
		Project p= new Project();
		projectid = p.projid;
	}
	public int getRolesid() {
		System.out.println(Rolesid);
		return Rolesid;
	}
	public void setRolesid(int Rolesid) {
		Role r = new Role();
		Rolesid = r.roleid;
	}
	
	
	 @Override
		public String toString() {
			return "Employee [Name=" + Name + ", KinId=" + KinId + ", emailid=" + emailid + ", Phoneno=" + Phoneno
					+ ", Address=" + Address + ", Dateofbirth=" + Dateofbirth + ", DateofJoining=" + DateofJoining
					+ ", Departmentid=" + Departmentid + ", Projectid=" + Projectid + ", Rolesid=" + Rolesid + "]";
		}
	 @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((emailid == null) ? 0 : emailid.hashCode());
			result = prime * result + ((KinId == null) ? 0 : KinId.hashCode());
			return result;
		}
	 
	 @Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (emailid == null) {
				if (other.emailid != null)
					return false;
			} else if (!emailid.equals(other.emailid))
				return false;
			if (KinId == null) {
				if (other.KinId != null)
					return false;
			} else if (!KinId.equals(other.KinId))
				return false;
			return true;
		}
	
	
}