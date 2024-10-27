//Finding Maximum Element from an Array

package com.lunchArrayDemo;

import java.util.Arrays;

public class LunchMaxElementFromArray 
{

	public static void main(String[] args) 
	{
		double M[] = {3.5,6.7,9.0,56.8,47.8,2.6,67.0,37.9};
		
		//Display the element of the array
		System.out.println(Arrays.toString(M));
		
		//Finding length of an Array
		System.out.println("Length of given an array M[] is "+M.length);
		
		//Finding the max element
		double max = M[0];
		
		for(int i = 0; i < M.length;i++)
		{
			if(M[i] > max)
			{
				max = M[i];
			}
		}
		System.out.println("The maximum element of a given an array M[] is "+max);
		

	}

}
