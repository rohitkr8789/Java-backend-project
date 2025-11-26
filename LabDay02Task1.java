package com.stream.lab_task;

import java.util.Arrays;

public class LabDay02Task1 {

	public static void main(String[] args) {
		//1 ---------------------------------------------------------------------
		System.out.println("1) remove Negative Number.");
		Integer [] nums= {-10,-5,0,5,10,15,-20};
		
		Object[] numbers = Arrays.stream(nums).filter(num -> num>0).toArray();
	
		System.out.println("Positive Numbers: "+Arrays.toString(numbers));
		
		//2 ---------------------------------------------------------------------
		System.out.println("\n2) print name which contains 'a' letter");
		
		String [] names = {"Rahul","Raj","Arnav","Scott","Smith"};
		
		Object[] anames = Arrays.stream(names)
		      .filter(name-> name.contains("a"))
		                  .toArray();
		
		System.out.println("Names Containing 'A' or 'a': "+Arrays.toString(anames));
		
		//3 ---------------------------------------------------------------------
		System.out.println("\n3) Prime Number");
		
		Integer [] num1 = {2,3,4,5,6,7,8,9,10,11};
		
		Object[] prime = Arrays.stream(num1).filter(LabDay02Task1::isPrime)
						.toArray();
		
		System.out.println("Prime Numbers: "+Arrays.toString(prime));
		
		//4 ---------------------------------------------------------------------
		System.out.println("\n4) Name of the Length must greater than 3");
		
		String [] words = {"Raj","Rohit","Smirti","Richa","Sky"};
		
		Object[] name1 = Arrays.stream(words).filter(name -> name.length()>3).toArray();
		
		System.out.println("Output: "+Arrays.toString(name1));
		
		//5 ---------------------------------------------------------------------
		System.out.println("\n5) Unique Elements.");
		
		Integer[] num2= {1,2,3,4,5,2,3,6,7,8,4};
		
		Object[] array = Arrays.stream(num2).distinct().toArray();
		
		System.out.println("Unique Numbers: "+Arrays.toString(array));
		
		//6 ---------------------------------------------------------------------
		System.out.println("\n6) Palindrome words");
		
		String []word = {"madam","hello","racecar","java","level","world"};
		
		Object[] palimdrome = Arrays.stream(word)
		.filter(s ->s.equals(new StringBuilder(s).reverse().toString())).toArray();
	    
		System.out.println("Palimdrome Name is: "+Arrays.toString(palimdrome));
		
		//7 ---------------------------------------------------------------------
		System.out.println("\n7) Number with String.");
		
		Integer [] num3= {10,20,30,40,50};
		
		Object[] stringNum = Arrays.stream(num3).map(num -> "Number "+num).toArray();
		
		System.out.println(Arrays.toString(stringNum));
		
		//8 ---------------------------------------------------------------------
		System.out.println("\n8) Convert into toUpperCase.");
		
		 String[] name2 = {"Virat", "Sanju", "Rohit", "Bumrah"};
		
		Object[] toUpperName = Arrays.stream(name2).map(name -> name.toUpperCase()).toArray();
		
		System.out.println("Output: "+Arrays.toString(toUpperName));
		
		//9 ---------------------------------------------------------------------
		System.out.println("\n9) Convert True to Yes");
		
		Boolean[] flags = {true, false, true, false, true};
    //note when need to produce to value then you ternary either yes or no.
		Object[] yesNo = Arrays.stream(flags).map(b -> b? "Yes":"No").toArray();
		
		System.out.println("Yes/No Values: "+Arrays.toString(yesNo));
		
		//10 ---------------------------------------------------------------------
		System.out.println("\n10) Fetch first letter");
		
		String []name3 = {"James", "Aryan", "Vibha", "Aniket"};
		
		Object[] firstLetter = Arrays.stream(name3).map(name-> name.charAt(0)).toArray();
		
		System.out.println("First Letters: "+Arrays.toString(firstLetter));
		
	}
	
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for(int i=2; i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}	
		return true;
	}

}
