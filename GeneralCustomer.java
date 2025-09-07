package com.rohit.overriding.mall;

class GeneralCustomer extends Customer{
	public GeneralCustomer(String name) {
		super(name);
	}
	@Override
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
		System.out.println("Customer :"+super.name);
		System.out.println("Total Cost :"+tot);
		System.out.println("Discount :No discount for general customers.");
    }
}
