package com.rohit.abstraction.cake;

public class OrderedCake extends Cake{
	private String message;
	
	public OrderedCake() {
		super("Round","Vanilla",1);
	}
	
	
	public OrderedCake(String shape, String flavor, int quantity) {
		super(shape, flavor, quantity);
	}
	
	public OrderedCake(String shape, String flavor, int quantity,String message) {
		super(shape, flavor, quantity);
		
		this.message=message;	
	}


	@Override
	public String toString() {
		if(this.message==null)
		{
			
			return super.toString();
			 
		}
		else
		{
		return "A "+getShape()+" "+getFlavor()+" Cake of "+getQuantity()+" KG is Ready "+this.message+" @ RS."+getPrice()*getQuantity();
		}
	}


	
	
	
	
	

}
