package com.flp.ems.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

	public static boolean validatename(String Name){
		
		 String newname=Name;
		if(newname.equals(""))
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
		 String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
			java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
			java.util.regex.Matcher m = p.matcher(emailId);
			return m.matches();
	   } 
	 
	 public static boolean validateAddress(String address){
		 
		  if (address.length() > 10) 
				return true;
		else
			return false;
			
	 }
	 public static boolean validatedate(String dateToValidate, String dateFromat){
			
			if(dateToValidate == null){
				return false;
			}
			
			SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
			sdf.setLenient(false);
			
			try {
				
				//if not valid, it will throw ParseException
				Date date = sdf.parse(dateToValidate);
				System.out.println(date);
			
			} catch (ParseException e) {
				
				e.printStackTrace();
				return false;
			}
			
			return true;
		}

}
       
	

