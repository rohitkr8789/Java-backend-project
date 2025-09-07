package com.rohit.methodoverriding;

public class PartTimeEmployee extends Employee{
	protected double hourlyRate;
	protected int hoursWorked;
	
	
	
	public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
		super(id, name);
		if(hoursWorked<0 || hourlyRate<0) {
			System.err.println("Employee hours of work can't be Negative");
			System.exit(0);
		}
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}



	@Override
	public double calculateSalary() {
		return hourlyRate*hoursWorked;
		
	}



	@Override
	public String toString() {
		return name+" Salary is :"+calculateSalary();
	}
	
	

}
