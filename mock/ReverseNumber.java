package com.rohit.mock;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num= sc.nextInt();
		
		int rev=0; 
		int num2=num;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
		}
		System.out.println(num2+" Reverse Number is : "+rev);

	}

}
