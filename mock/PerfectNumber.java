package com.rohit.mock;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num= sc.nextInt();
		
		int sum=0; 
		
		for(int i=1; i<num; i++) {
			if(num%i==0) sum+=i;
		}
		
		if(num==sum) System.out.println(num+" is Perfect Number!!");
		else System.err.println(num+" is not a Perfect Number!!");
		
		
		
		

	}

}
