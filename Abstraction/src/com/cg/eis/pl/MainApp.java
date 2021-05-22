package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

public class MainApp {
	
	static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Service s = new Service();
		
		
		while(true) {
			System.out.println("Services are:"+"\n"+"1. Insert an employee"+"\n"+"2. Details based on salary and designaation"+"\n"+"3. Display details");
			int n = sc.nextInt();
			switch(n) { 
				case 1: System.out.println("Enter the details of the employee");
				int id = sc.nextInt();
				String name = sc.next();
				double salary = sc.nextDouble();
				String designation = sc.next();
				String insuranceScheme = sc.next();
				s.getDetails(id, name, designation, salary, insuranceScheme);
				break;
				
				case 2: 
					System.out.println("Enter the salary and designation of the employee");
					double salary1 = sc.nextDouble();
					String designation1 = sc.next();
					s.getEnsuranceScheme(salary1, designation1);
					break;
					
				case 3: 
					System.out.println("Enter the id of the employee to get the details");
					int id1 = sc.nextInt();
					s.displayDetails(id1);
					break;
					}
		}
		
		
		
	}
	

}
