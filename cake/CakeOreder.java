package com.rohit.abstraction.cake;

import java.util.Scanner;

public class CakeOreder {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("\t\t ***Welcome to Mayur Cake Shop***");
		System.out.println("\n\t 1) Default Cake");
		System.out.println("\t 2) Specific Shape,taste and weight required on Cake");
		System.out.println("\t 2) Specific Shape,taste and weight required on Cake with some message");
		
		System.out.println("Please Enter Choice [1/2/3]");
		int choice= Integer.parseInt(sc.nextLine());
		
		Cake cake=null;
		
		switch(choice) {
		case 1 ->{
			cake = new OrderedCake();
			System.out.println(cake);	
		}
		case 2 ->{
			System.out.println("Which Shape you Want ? (Round,square,rectange...)");
			String shape=sc.next();
			
			System.out.println("Which Flavour you Want ? (chocolate,Vanila,orange...)");
			String flavour=sc.next();
			
			System.out.println("How much KG of Cake Required !!");
			int weight= Integer.parseInt(sc.next());
			
			cake = new OrderedCake(shape,flavour,weight);
			System.out.println(cake);	
		}
		case 3 ->{
			System.out.println("Which Shape you Want ? (Round,square,rectange...)");
			String shape=sc.next();
			
			System.out.println("Which Flavour you Want ? (chocolate,Vanila,orange...)");
			String flavour=sc.next();
			
			System.out.println("How much KG of Cake Required !!");
			int weight= Integer.parseInt(sc.next());
			sc.nextLine();
			
			System.out.println("Give me Some beautiful message !!");
			String message=sc.nextLine();
			
			cake = new OrderedCake(shape,flavour,weight,message);
			System.out.println(cake);
		}
		default ->{
			System.err.println("Invalid Choice XXX");
		  }
		}
		System.out.println();
		System.out.println("\n\t * * * * * * * * * Thank You Visit Again * * * * * * * * *");
	}

}
