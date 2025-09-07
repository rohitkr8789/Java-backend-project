package com.rohit.mock;

import java.util.Scanner;

public class SumOfDivisors {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num= sc.nextInt();  //12 = 1+2+3+4+6+12 =28
		
		int sum=0;
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) sum+=i;
		}
		
		System.out.println("Sum of Divisors : "+sum);
		

	}

}
