package com.rohit.mock;

import java.util.Scanner;

/*
 f0   f1 = f2
 0  +  1 = 1
 1  +  1 = 2
 1  +  2 = 3
 2  +  3 = 5
 3  +  5 = 8
 
 
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num= sc.nextInt();
		int f2=0,f1=1,f0=0;
		
		System.out.print("Fabonacci Series is : ");
		while(num!=0) {
			f2=f1+f0;
			System.out.print(f0+" ");
			f0=f1;
			f1=f2;
			num--;
			
			
		}

	}

}
