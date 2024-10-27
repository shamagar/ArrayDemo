//Demonstrating Deleting an element from Array

package com.lunchArrayDemo;

import java.util.Arrays;

public class LunchDeletingElement 
{

	public static void main(String[] args) 
	{
		String name[] = new String[10];
		name[0] = "Sha";
		name[1] = "Davil";
		name[2] = "Manish";
		name[3] = "Shalla";
		name[4] = "Sangit";
		name[5] = "Hem";
		name[6] = "Khan";
		name[7] = "George";
		name[8] = "Martha";
		
		//Displaying an Array
		System.out.println(Arrays.toString(name));
		System.out.println("  ");
		
		int delIndex = 5;//Remove element of 5th index
		
		//For loop 
		for(int i = delIndex+1; i < name.length; i++ )
		{
			name[i-1]=name[i];
		}
		System.out.println(Arrays.toString(name));//Printing an Array

	}

}
