package com.flp.ems.service;

import java.util.HashMap;

public interface IEmployeeService {
	
	public void AddEmployee(HashMap hm);
	public void ModifyEmployee(String a);
	public void RemoveEmployee(String a);
	public void SearchEmployee(String a);
	public void getallEmployee(HashMap hm);

}
