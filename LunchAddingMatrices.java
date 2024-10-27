//Demonstrating Adding two matrices using 2D array
package com.lunchArrayDemo;

import java.util.Arrays;

public class LunchAddingMatrices 
{

	public static void main(String[] args) 
	{
		int A[][] = {{3,5,8},{7,6,9},{4,3,5}};
		int B[][] = {{31,2,28},{6,8,19},{74,43,15}};
		
		//Printing both array before operation
		System.out.println(Arrays.deepToString(A));
		System.out.println(Arrays.deepToString(B));
		
		System.out.println(" ");//NEXT LINE
		
		//Creating new 2D array
		int C[][] = new int[3][3];
		
		//Nested For Loop to print out the elements
		System.out.println("USING COUNTER FOR EACH LOOP TO PRINT OUT THE ELEMENTS");
		for(int i = 0; i < A.length; i++)//Gives Number of rows
		{
			for(int j = 0; j < A[0].length; j++)//Gives number of columns
			{
				C[i][j] = A[i][j]+ B[i][j];
				System.out.print(C[i][j]+" ");
			}
			System.out.println(" ");//NEXT LINE
		}
		
		System.out.println(" ");
		
		//FOR EACH LOOP
		System.out.println("Using FOR EACH LOOP TO PRINT OUT THE ELEMENTS");
		for(int x[]:C)
		{
			for(int y : x)
			{
				System.out.print(y+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");//NEXT LINE
		
		//OR using Build in Class in Array
		System.out.println("Using BUILD IN CLASS IN AN ARRAY TO PRINT OUT THE ELEMENTS");
		System.out.println(Arrays.deepToString(C));
		

	}

}
