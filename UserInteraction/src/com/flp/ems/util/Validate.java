package com.flp.ems.util;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

	public static boolean validatename(String Name){
		
		 String newname=Name;
		if(newname.equals(null))
		{
			System.out.println("name is invalid");
			return false;
		}
		
		return true;
		
	}
	
public static boolean validateKinId(String KinId){
		
		return true;
		
	}
	
	
	
	 public static boolean validatePhone( String phone )
	   {
		 if (phone.equals("")) {
				System.out.println("plz enter number");
			} else if (phone.length() > 10) {
				System.out.println("invalid number");

			} else if (phone.length() < 10) {
				System.out.println("invalid number");
			} else {

				System.out.println("valid email id");
			}

			return true;

	   } // end method validatePhone
	 
	 public static boolean validateEmailId( String emailId )
	   {
		 String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		 Boolean b = emailId.matches(EMAIL_REGEX);
	      
		 return b;
	   } 
	 
	 public static boolean validateAddrerss(String address){
		 
		  if (address.length() > 10) 
				return true;
		else
			return false;
			
	 }
		public static boolean validatedate(String d){
			
			 Pattern dateFrmtPtrn =
	            Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");
		
		Matcher mtch = dateFrmtPtrn.matcher(d);     
			if(mtch.matches()){
				System.out.println("valid date");
		           return true;
		       }
			System.out.println("Invalid date");
			return false;
		}
}
       
	

