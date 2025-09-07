package com.rohit.overriding.mall;

import java.util.Scanner;

public class ShoppingMall {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Please select the Customer Type to get additional Discount :");
    System.out.println("\t\t1) General Customer");
    System.out.println("\t\t3) Prime Customer");
    System.out.println("\t\t3) VIP Customer");
    
    //Take Customer Type[option]
    System.out.println("Please enter Customer type:");
    int option=Integer.parseInt(sc.nextLine());
    
    //Generic class null reference because every option i create object and use reference 
    Customer customer= null;
    
    // Start switch case according to option
    switch(option)
    {
    case 1 ->{
    	System.out.println("Enter Customer Name:");
        String name=sc.nextLine();
        
        System.out.println("Enter Number of Item:");
        int item=Integer.parseInt(sc.nextLine());
        
        //take array to store multiple price
        double priceArray[]=new double[item];
        
        System.out.println("Please Enter the Item Name and Price :");
        
        //Start Loop according to select number of items
        for(int i=0;i<item;i++)
           {
        	System.out.print((i+1)+")Item Name:");
            String itemName=sc.nextLine();
            
            System.out.print(" Item Price:");
            double price=Double.parseDouble(sc.nextLine());
            
            priceArray[i]=price;		//Store price index by index
           }
        
        // Here create object using of generic class reference
        customer=new GeneralCustomer(name);
        
        //Call the static method and pass object and price array using of var args parameter
    	generateBill(customer, priceArray);
         }
    
    //Similar do in all case
    case 2 ->{
    	System.out.println("Enter Customer Name:");
        String name=sc.nextLine();
        
        System.out.println("Enter Number of Item:");
        int item=Integer.parseInt(sc.nextLine());
        
        double priceArray[]=new double[item];
        System.out.println("Please Enter the Item Name and Price :");
        
        for(int i=0;i<item;i++)
           {
        	System.out.print((i+1)+")Item Name:");
            String itemName=sc.nextLine();
            
            System.out.print(" Item Price:");
            double price=Double.parseDouble(sc.nextLine());
            priceArray[i]=price;
           }
        
        customer= new PrimeCustomer(name); 
    	generateBill(customer, priceArray);
         }
    case 3 ->{
    	System.out.println("Enter Customer Name:");
        String name=sc.nextLine();
        
        System.out.println("Enter Number of Item:");
        int item=Integer.parseInt(sc.nextLine());
        
        double priceArray[]=new double[item];
        
        System.out.println("Please Enter the Item Name and Price :");
        
        for(int i=0;i<item;i++)
           {
        	System.out.print((i+1)+")Item Name:");
            String itemName=sc.nextLine();
            
            System.out.print(" Item Price:");
            double price=Double.parseDouble(sc.nextLine());
            
            priceArray[i]=price;
           }
        
        customer= new VIPCustomer(name);
    	generateBill(customer, priceArray);
         }
    }
 }
	
	public static void generateBill(Customer cust, double... price) {
		System.out.println("---------------------------------------------");
		System.out.println("Welcome to Hyderabad Mall :");
		cust.calculateBill(price);
	}

}
