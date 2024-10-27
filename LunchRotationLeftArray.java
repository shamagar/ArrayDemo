//Left Rotation an Array

package com.lunchArrayDemo;

import java.util.Arrays;

public class LunchRotationLeftArray 
{

	public static void main(String[] args) 
	{
		int A [] = {5,9,6,10,12,7,3,5,4,2};
		System.out.println(Arrays.toString(A));
		System.out.println(" ");
		
		int temp = A[0];
		
		for(int i = 1; i < A.length; i++)
		{
			A[i-1]=A[i];
		}
		A[A.length-1]=temp;
		
		System.out.println(Arrays.toString(A));//Displaying Array Element
		
		/*
		//OR Displaying an elements
		for(int B:A)
		{
			System.out.print(B+",");
		}
		
		System.out.println(" ");
		
		//OR 
		for(int i = 0; i < A.length;i++)
		{
			System.out.print(A[i]+",");
		}
		*/

	}

}
