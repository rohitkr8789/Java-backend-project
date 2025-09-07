package com.rohit.methodoverriding;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t***Salary Calculation Menu***");
		System.out.println("\t1) FullTime Employees");
		System.out.println("\t2) PartTime Employees");
		System.out.println("Please select the Employee type");
		int choice = Integer.parseInt(sc.nextLine());
		
		switch(choice) {
		case 1 ->{
			System.out.print("Enter Fulltime Employee Id : ");
			int id=Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter Fulltime Employee Name : ");
			String name= sc.nextLine();
			
			System.out.print("Enter the Salary : ");
			double salary= Double.parseDouble(sc.nextLine());
			Employee fe = new FullTimeEmployee(id, name, salary);
			System.out.println(fe);
			
		}
		
		case 2 ->{
			System.out.print("Enter Parttime Employee Id : ");
			int id=Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter Parttime Employee Name : ");
			String name= sc.nextLine();
			
			System.out.println("Enter your hourly rate:");
			Double hrRate=Double.parseDouble(sc.nextLine()); 
			
			System.out.println("Enter your total works hour in the month :");
			int hrWork=Integer.parseInt(sc.nextLine());
			
			Employee pe= new PartTimeEmployee(id, name, hrRate, hrWork);
			System.out.println(pe);
		}
		 default -> System.err.println("Invalid choice!!");
		}
		
		sc.close();

	}

}
