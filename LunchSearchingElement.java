//Searching an Element and printing the index of the given key(element)
//Searching can be done if there is no Duplicate elements in an Array.
//Applying a Linear Search
package com.lunchArrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class LunchSearchingElement 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int A[] = {3,9,7,8,12,6,15,5,4,10};
		System.out.println(Arrays.toString(A));//It will display the element of an Array A
		System.out.println(" ");
		
		int key;
		System.out.println("Want to know the index of given number?");
		System.out.println("Choose the number and enter");
		key = scan.nextInt();
		
		
		//int key = 15;
		
		for(int i = 0; i < A.length; i ++)
		{
			if(A[i] == key)
			{
				System.out.println("Index of the given key is "+ i);
				
				System.exit(0);//It will stop checking when it matches the given key OR enter value
			}
		}
		System.out.println("Not Found.");
		
	}

}
