package com.rohit.mock;

import java.util.Scanner;

public class ArmStrongNumer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int num2=num,num3=num;
		int count=0;
		int sum=0;
		
		while(num2!=0) {
		     num2/=10;
		     count++;
		}
		
		while(num3!=0) {
			int r=num3%10;
			sum+=Math.pow(r, count);
			num3/=10;
		}
		
		if(num==sum) System.out.println(sum+" is a ArmStrong Number !!");
		else System.err.println(num+" is not a ArmStrong Number !!");

	}

}
