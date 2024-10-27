
//Right Rotation of an Array's Element

package com.lunchArrayDemo;

import java.util.Arrays;

public class LunchRightRotationArray 
{

	public static void main(String[] args) 
	{
		char character[] = {'A', 'B','C', 'D','E','F','G', 'Z'};
		
		System.out.println(Arrays.toString(character));//Displaying the original array
		System.out.println(" ");
		
		char tempChar = character[character.length-1];//Store the last element in tempChar variables
		
		//Counter for loop to reach each element and storing the value
		for(int i = character.length-2; i >= 0 ; i--)
		{
			character[i+1]= character[i];
			
		}
		character[0]= tempChar;
		
		System.out.println(Arrays.toString(character));//Displaying an array after Right Rotation
		//OR we can use counter for loop or For each loop to displaying an array which are given below.
		
		/*
		for(char c:character)
		{
			System.out.print(c+",");
		}
		
		System.out.println(" ");
		for(int i = 0; i < character.length;i++)
		{
			System.out.print(character[i]+",");
		}
		*/

	}

}
