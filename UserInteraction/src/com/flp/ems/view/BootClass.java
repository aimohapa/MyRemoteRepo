package com.flp.ems.view;

import java.util.Scanner;

public class BootClass {

	
	public static void main(String[] args){
		
		UserInteraction u =new UserInteraction();
		System.out.println("Choose option for Transaction");
		System.out.println("choose '1' to add employee");
		System.out.println("choose '2' to modify employee");
		System.out.println("choose '3' to remove employee");
		System.out.println("choose '4' to search employee");
		System.out.println("choose '5' to search getALL data");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
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
				
			
		}
		
		}
}
