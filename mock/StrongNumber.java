package com.rohit.mock;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num= sc.nextInt();  //145
		
		int num2=num;
		int f=1;
		int sum=0;
		
		while(num2!=0) {
			int r=num2%10;
			f=1;
			while(r!=0) {
				f=f*r;
				r--;
			}
			sum+=f;
			num2/=10;
		}
		if(num==sum) System.out.println(sum+" is a Strong Number");
		else System.err.println(num+" is not a Strong Number");

	}

}
