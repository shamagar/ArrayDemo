//Demonstrating copying an Array
package com.lunchArrayDemo;

import java.util.Arrays;

public class LunchCopingArray 
{

	public static void main(String[] args) 
	{
		int A [] = {8,9,45,34,6,53,78,95,34,23,11,64,78,90};
		
		//Printing an Array A
		System.out.println(Arrays.toString(A));
		
		/*
		//OR Printing an Array A
		for(int i = 0; i < A.length; i++)
		{
			System.out.print(A[i]+",");
		}
		System.out.println(" ");
		
		*/
		
		/* Printing an Array A

		for(int M : A)
		{
			System.out.print(M+",");
		}
		*/
		
		System.out.println(" ");
		
		int B[] = new int[A.length];
		
		for(int i = 0; i < A.length; i++)
		{
			B[i]=A[i];
		}
		
		//Printing an Array B after copying an element
		System.out.println(Arrays.toString(B));
		
	}

}
