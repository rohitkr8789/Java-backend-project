package com.rohit.mock;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num= sc.nextInt();
		
		int num2=num;
		int count=0;
		
		while(num2!=0) {
			num2/=10;
			count++;
		}
		
		System.out.println("Digits in "+num+" : "+count);

	}

}
