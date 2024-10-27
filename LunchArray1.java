//1D Array getting imputs from the user
package com.lunchArrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class LunchArray1 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		//Declearing the an array
		int marks[] = new int[10];
		
		//Storing the marks of stds in an Array
		for(int i = 0; i < marks.length; i++ )
		{
			System.out.println("Enter the mark of student "+i);
			marks[i] = scan.nextInt();
		}
		
		System.out.println(" ");
		
		//Printing the stored marks
		System.out.println("Printing using counter for loop");
		for(int i = 0; i < marks.length; i++)
		{
			System.out.print(marks[i]+" ");
		}
		
		/*
		 * 
		System.out.println(" ");
		
		//Using For each Loop
		System.out.println("Printing using  for each loop");
		for(int x : marks)
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		//Using build class in an Array
		System.out.println("Printing using  build in class");
		System.out.println(Arrays.toString(marks));
		
		*/
	}

}
