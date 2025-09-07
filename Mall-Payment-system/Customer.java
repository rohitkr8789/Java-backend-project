package com.rohit.overriding.mall;

public class Customer {
	protected String name;

	public Customer(String name) {
		super();
		if(name.isEmpty()) {
			System.err.println("Enter Name");
			System.exit(0);
		}
		this.name = name;
	}
	
	public void calculateBill(double... prices) {
		double tot=0;
		for( double p :prices ) {
			if(p<0) 
				{
				System.out.println("Invalid Price");
				System.exit(0);
				}
			tot+=p;
		}	
		System.out.println("Customer :"+this.name);
		System.out.println("Total Cost :"+tot);
		System.out.println("Discount :"+(tot*0));
    }	
}






















