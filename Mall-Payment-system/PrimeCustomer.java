package com.rohit.overriding.mall;

public class PrimeCustomer extends Customer{
	protected double discountRate=0.10;
	public PrimeCustomer(String name) {
		super(name);
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
		System.out.println("Discount :"+(tot*discountRate));
		System.out.println("Final amount RS :"+(tot-(tot*discountRate)));
	}	

}
