package com.flp.ems.dao;


import java.util.HashMap;
import java.util.Map;
import java.sql.*;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;
import com.flp.ems.util.Validate;
import com.mysql.jdbc.Connection;

public class EmployeeDaoImplJDBC implements IemployeeDao {
	private String Employee_Id;
	private String Name;
	private String Kin_Id;
	private String Email_Id;
	private String Phone_No;
	private String DOB;
	private String DOJ;
	private String Address;
	Employee e=new Employee();
	
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/test";
	private String s;
	
	
	@Override
	public Employee AddEmployee(Employee e1, Department d1, Project p1, Role r1) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test");

		
		PreparedStatement stmt1=con.prepareStatement("insert into EMPLOYEES(EMP_ID,NAME,KIN_ID,EMAILID,PHONENO,DOB,DOJ,ADDRESS,DEP_ID,PROJ_ID,ROLE_ID) values(?,?,?,?,?,?,?,?,?,?,?)");  
		stmt1.setInt(1,e1.getEmpid());//1 specifies the first parameter in the query  
		stmt1.setString(2,e1.getName());
		stmt1.setString(3,e1.getKinId());
		stmt1.setString(4,e1.getEmailid());
		stmt1.setString(5,e1.getPhoneno());
		
		stmt1.setString(6,e1.getDateofbirth());
		stmt1.setString(7,e1.getDateofJoining());
		stmt1.setString(8,e1.getAddress());
		stmt1.setInt(9,e1.getDepartmentid());
		stmt1.setInt(10,e1.getProjectid());
		stmt1.setInt(11,e1.getRolesid());
		stmt1.execute();
		return e;
	}


	
	
	
	@Override
	public void  ModifyEmployee(Employee e,String empid,int ch)throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
		
		switch(ch)
		{
		case 1:
			
			
			String na=e.getName();
			if(Validate.validatename(na))
			{
				PreparedStatement stmt2=con.prepareStatement("update  EMPLOYEES set NAME=? where KIN_ID=?");
				stmt2.setString(1,na);
				stmt2.setString(2,empid);
				stmt2.execute();
			}
			System.out.println("Invalid data");
			break;
			
			
		case 2:
			
			
			String em=e.getEmailid();
			if(Validate.validateEmailId(em))
			{
				PreparedStatement stmt2=con.prepareStatement("update  EMPLOYEES set EMAILID=? where KIN_ID=?");
				stmt2.setString(1,em);
				stmt2.setString(2,empid);
				stmt2.execute();
			
			}
			System.out.println("Invalid data");
			break;
				
		case 3:
			
			String k=e.getKinId();
			if(Validate.validateKinId(k))
			{
				PreparedStatement stmt2=con.prepareStatement("update  EMPLOYEES set KIN_ID=? where KIN_ID=?");
				stmt2.setString(1,k);
				stmt2.setString(2,empid);
				stmt2.execute();
			}
			System.out.println("Invalid data");
			break;
			
		case 4:
			
			String ad=e.getAddress();
			if(Validate.validateAddress(ad))
			{
				PreparedStatement stmt2=con.prepareStatement("update  EMPLOYEES set ADDRESS=? where KIN_ID=?");
				stmt2.setString(1,ad);
				stmt2.setString(2,empid);
				stmt2.execute();
			}
			System.out.println("Invalid data");
			break;
			
		case 5:
			
			String phno=e.getPhoneno();
			if(Validate.validatePhone(phno))
			{
				PreparedStatement stmt2=con.prepareStatement("update  EMPLOYEES set phoneno=? where KIN_ID=?");
				stmt2.setString(1,phno);
				stmt2.setString(2,empid);
				stmt2.execute();
			}
			System.out.println("Invalid data");
			break;
			
		case 6:
			
			String db=e.getDateofbirth();
			if(Validate.validatedate(db, "dd/mm/yyyy"))
			{
				PreparedStatement stmt2=con.prepareStatement("update  EMPLOYEES set DOB=? where KIN_ID=?");
				stmt2.setString(1,db);
				stmt2.setString(2,empid);
				stmt2.execute();
			}
			System.out.println("Invalid data");
			break;
			
		case 7:
			
			String dj=e.getDateofJoining();
			if(Validate.validatedate(dj, "dd/mm/yyyy"))
			{
				PreparedStatement stmt2=con.prepareStatement("update  EMPLOYEES set DOJ=? where KIN_ID=?");
				stmt2.setString(1,dj);
				stmt2.setString(2,empid);
				stmt2.execute();
			}
			System.out.println("Invalid data");
			break;
		}	
		}
	
	
	


	@Override
	public Employee SearchEmployee(String name, String email, String kinid)throws ClassNotFoundException, SQLException {
		Class<?> forName = Class.forName(driver);
		 
		 
		 Connection dbConnection=(Connection)DriverManager.getConnection(url);
		 Statement stmt = dbConnection.createStatement();
		    
		 PreparedStatement stmt1=dbConnection.prepareStatement("select * from EMPLOYEES inner join DEPARTMENT on EMPLOYEES.DEP_ID=DEPARTMENT.DEP_ID inner join ROLE on EMPLOYEES.ROLE_ID=ROLE.ROLE_ID inner join PROJECT on EMPLOYEES.PROJ_ID=PROJECT.PROJ_ID where EMPLOYEES.NAME=?"+
		 		"UNION select * from EMPLOYEES inner join DEPARTMENT on EMPLOYEES.DEP_ID=DEPARTMENT.DEP_ID inner join ROLE on EMPLOYEES.ROLE_ID=ROLE.ROLE_ID inner join PROJECT on EMPLOYEES.PROJ_ID=PROJECT.PROJ_ID where EMPLOYEES.EMAILID=?"+
		 		"UNION select * from EMPLOYEES inner join DEPARTMENT on EMPLOYEES.DEP_ID=DEPARTMENT.DEP_ID inner join ROLE on EMPLOYEES.ROLE_ID=ROLE.ROLE_ID inner join PROJECT on EMPLOYEES.PROJ_ID=PROJECT.PROJ_ID where EMPLOYEES.KIN_ID=?");
		
		 stmt1.setString(1,name);
		 stmt1.setString(2,email);
		 stmt1.setString(3,kinid);
		 
		 ResultSet rs = stmt1.executeQuery();
	 
		 while (rs.next()) {
			
		    	System.out.println("   RECORD FOUND  ");
		         System.out.println("  EMPLOYEE ID:  "+rs.getString("EMP_ID") + "  NAME: "+rs.getString("NAME") +" KINID: "+ rs.getString("KIN_ID") +"  EMAIL ID: "+ rs.getString("EMAILID") +"  PHONE NO:"+rs.getString("PHONENO") +"  DATE OF BIRTH :" +rs.getString("DOB")+"  DATE OF JOINING"+ rs.getString("DOJ")+"  ADDRESS: " +rs.getString("ADDRESS")+"\n"+"  DEPARTMENT ID:  "+rs.getString("DEP_ID")+"  DEPARTMENT NAME: "+rs.getString("DEPTNAME")+" DEPARTMENT DESCRIPTION:  "+rs.getString("DEPTDESP")+"\n" +"  PROJECT ID: "+rs.getString("PROJ_ID")+" PROJECT NAME: "+rs.getString("PROJNAME")+" PROJECT DESCRIPTION:  "+rs.getString("PROJDESP")+"\n"+"  ROLE ID: " +rs.getString("ROLE_ID")+"  ROLE NAME:  "+rs.getString("ROLENAME")+"  ROLE DESCRIPTION:"+rs.getString("ROLEDESP"));
		  
		    }
		 System.out.println("Match not found");
		return null;
	}

	
	@Override
	public boolean RemoveEmployee(String a) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class<?> forName = Class.forName(driver);
		Connection con =(Connection)DriverManager.getConnection(url);
		 String query = "delete from Employees where KIN_ID=?";
		PreparedStatement preparedStmt = con.prepareStatement(query);
		preparedStmt.setString(1, e.setKinId(a));
		preparedStmt.execute();
		 
		 

		return false;
	}
	
	@Override
	public void getallEmployee() throws ClassNotFoundException,SQLException {
		
		 Class<?> forName = Class.forName(driver);
		 
		 Connection dbConnection;
		dbConnection=(Connection)DriverManager.getConnection(url);
		 Statement stmt = dbConnection.createStatement();
		    
		 ResultSet rs = stmt.executeQuery("select * from EMPLOYEES inner join DEPARTMENT on EMPLOYEES.DEP_ID=DEPARTMENT.DEP_ID inner join ROLE on EMPLOYEES.ROLE_ID=ROLE.ROLE_ID inner join PROJECT on EMPLOYEES.PROJ_ID=PROJECT.PROJ_ID");
		    while (rs.next()) {
		    //	 s = rs.getString("name"); 
		    	
		         System.out.println("  EMPLOYEE ID:  "+rs.getString("EMP_ID") + "  NAME: "+rs.getString("NAME") +" KINID: "+ rs.getString("KIN_ID") +"  EMAIL ID: "+ rs.getString("EMAILID") +"  PHONE NO:"+rs.getString("PHONENO") +"  DATE OF BIRTH :" +rs.getString("DOB")+"  DATE OF JOINING"+ rs.getString("DOJ")+"  ADDRESS: " +rs.getString("ADDRESS")+"\n"+"  DEPARTMENT ID:  "+rs.getString("DEP_ID")+"  DEPARTMENT NAME: "+rs.getString("DEPTNAME")+" DEPARTMENT DESCRIPTION:  "+rs.getString("DEPTDESP")+"\n" +"  PROJECT ID: "+rs.getString("PROJ_ID")+" PROJECT NAME: "+rs.getString("PROJNAME")+" PROJECT DESCRIPTION:  "+rs.getString("PROJDESP")+"\n"+"  ROLE ID: " +rs.getString("ROLE_ID")+"  ROLE NAME:  "+rs.getString("ROLENAME")+"  ROLE DESCRIPTION:"+rs.getString("ROLEDESP"));
		  
		    }
	}



}

