package com.rohit.mock;

import java.util.Scanner;

public class FactorialNumer {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num= sc.nextInt();
		int num2=num;
		
		int f=1;
		
		while(num!=0) {
			f=f*num;
			num--;
		}
		
		System.out.println(num2+" is : "+f);
		
		

	}

}
