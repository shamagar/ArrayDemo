//Find the sum of all elements in a Array

package com.lunchArrayDemo;

import java.util.Arrays;

public class LunchSumOfArray 
{

	public static void main(String[] args) 
	{
		int A[] = {3,9,7,8,12,6,15,5,4,10};
		
		//Property of Array
		System.out.println("The lenth of Array A is " + A.length + ".");
		
		//Display the element of an Array for ONE DIMENSOINAl 
		System.out.println(Arrays.toString(A));
		
		System.out.println("  "); 
		
		//OR using for loop to display the elements of an array
		for(int i = 0; i < A.length;i++)
		{
			System.out.println(A[i]);
		}
		
		System.out.println("  ");
		
		int sum = 0;
		
		//Counter control For loop for traversing an element in an Array and adding each elements and displaying the sum.
		/*
		for(int i = 0;i < (A.length);i++)
		{
			sum = sum + A[i];
			
		}
		System.out.println("The sum of given Array A is "+ sum
				+ ".");
		*/
		
		
		//OR For each loop:x is for each elements of an Array A
		for(int x:A)
		{
			sum = sum + x;
		}
		System.out.println("The sum of given Array A is "+ sum
				+ ".");
		

	}

}
