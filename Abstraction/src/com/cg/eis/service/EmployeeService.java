package com.cg.eis.service;

public interface EmployeeService{
	
	
	public void getEnsuranceScheme(double salary, String designation);
	
	void displayDetails(int id);
	void getDetails(int id, String name, String designation, double salary, String insurance);

}
