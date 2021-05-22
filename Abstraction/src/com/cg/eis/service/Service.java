package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class Service implements EmployeeService{

	Employee e = new Employee();
	Employee e1[] = new Employee[10000];
	int index = 0;
	
	@Override
	
	public void getDetails(int id, String name, String designation, double salary, String insurance) {
		
		for(int i = 0; i < e1.length; i++) {
			e1[i] = new Employee(id, name, salary, designation, insurance);
		}
		
	}
	@Override
	public void getEnsuranceScheme(double salary, String designation) {
		// TODO Auto-generated method stub
		for(int i = 0; i < e1.length; i++) {
		if(salary == (e1[i].getSalary()) && designation.equals(e1[i].getDesignation())) {
			System.out.println("The Insurance scheme is: "+e1[i].getInsuranceScheme());
			break;
		}
		else {
			System.out.println("No user found");
		}
		}
		
		
		
	}

	
	@Override
	public void displayDetails(int l) {
		// TODO Auto-generated method stub
		for(int i = 0; i < e1.length; i++) {
		if(l == e1[i].getId()) {
		System.out.println("The details are: "+e1[i].getName()+" "+e1[i].getDesignation()+" "+e1[i].getId()+" "+e1[i].getInsuranceScheme()
		+" "+e1[i].getSalary()+" ");
		break;
		}
		else {
			System.out.println("No user found with the id: "+e.getId());
		}
		
	}
	}
	

	

	
	
}
