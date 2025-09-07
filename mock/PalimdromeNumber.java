package com.rohit.mock;

import java.util.Scanner;

public class PalimdromeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number ");
		int num=sc.nextInt();  //121
		int num2=num;
		int rev=0;
		
		while(num2!=0) {
			 rev=rev*10 +num2%10;
			 num2/=10;
		}
		
		if(num==rev) System.out.println(rev+" is a Palindrome");
		else System.err.println(num+" is not a Palindrome");
		
	}

}
