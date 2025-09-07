package com.rohit.mock;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n=sc.nextInt(),c;
		
		for(int j=2; j<=n; j++) {
			c=0;
		
		for(int i = 2; i<j; i++) {
			if(j%i==0) c++;
		}
		if(c==0) System.out.print(j+" ");
		else System.err.print(j+" ");
		
		}
		

	}

}
