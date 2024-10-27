//Demonstrating the Reverse Copying an Array

package com.lunchArrayDemo;

import java.util.Arrays;

public class LunchReverseCopyingArray 
{

	public static void main(String[] args) 
	{
		char C[] = {'A','B','C','D','E','F','G','H','I','J','K'};
		
		//Printing an Array C
		System.out.println(Arrays.toString(C));
		
		char newC[] = new char[C.length];//Creating new Array with same length
	
		//For loop
		for(int i = C.length-1, j = 0; i >= 0; j++, i--)
		{
			newC[j] = C[i];
		}
		
		//Printing an Array newC
		System.out.println(Arrays.toString(newC));
		

	}

}
