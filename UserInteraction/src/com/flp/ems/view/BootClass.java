package com.flp.ems.view;

import java.sql.SQLException;
import java.util.Scanner;

public class BootClass {

	static UserInteraction u =new UserInteraction();
	 static Scanner sc = new Scanner(System.in);
	 private static int a=0;
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		menu();
		
		
	}	
	
	private static void menu() throws ClassNotFoundException, SQLException {
	
		while(true)
		{
		
		System.out.println("Choose option for Transaction");
		System.out.println("choose 1 to add employee");
		System.out.println("choose 2 to modify employee");
		System.out.println("choose 3 to remove employee");
		System.out.println("choose 4 to search employee");
		System.out.println("choose 5 to getALL data");
		System.out.println("choose 6 to exit");
		
	 a = sc.nextInt();
	switch(a)
		{
			case 1:
				u.AddEmployee();
				break;
				
			case 2:
				u.ModifyEmployee();
				break;
			case 3:
				u.RemoveEmployee();
				break;
			case 4:
				u.SearchEmployee();
				break;
			case 5:
				u.getAllEmployee();
				break;
			case 6:
				System.exit(0);
				break;
			
		}
	
		
	}
	}
}
		

