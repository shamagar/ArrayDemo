//Demonstrating inserting an Element in a Array

package com.lunchArrayDemo;

import java.util.Arrays;

public class LunchInseartingElementInArray 
{

	public static void main(String[] args) 
	{
		//Declaring Array size
		int A[] = new int[10];
		A[0] = 5;
		A[1] = 9;
		A[2] = 7;
		A[3] = 15;
		A[4] = 89;
		A[5] = 47;
		A[6] = 51;
		
		System.out.println(Arrays.toString(A));//Displaying the 
		System.out.println("*****************");
		
		int keyElement = 23;//23 value need to insert in index 2
		int index = 2;
		
		//For loop for traversing an Array
		for(int i = 7; i >= index; i--)
		{
			A[i]=A[i-1];
		}
		A[index] = keyElement;
		
		//Displaying an Array after inserting an element
		System.out.println(Arrays.toString(A));
				

	}

}
