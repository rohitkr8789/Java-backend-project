package com.rohit.abstraction.cake;

public abstract class Cake {
	private String shape;
	private String flavor;
	private int quantity;
	public static double price =400;
	
	
	public Cake(String shape, String flavor, int quantity) {
		super();
		this.shape = shape;
		this.flavor = flavor;
		this.quantity = quantity;
	}


	public String getShape() {
		return shape;
	}


	public void setShape(String shape) {
		this.shape = shape;
	}


	public String getFlavor() {
		return flavor;
	}


	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public static double getPrice() {
		return price;
	}


	public static void setPrice(double price) {
		Cake.price = price;
	}


	@Override
	public String toString() {
		return "A " + shape + " " + flavor + " cake of " + quantity + " KG is Ready @RS."+price*quantity;
	}
	
	
	

}
