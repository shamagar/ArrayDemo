//Finding second largest age(element) from an array
package com.lunchArrayDemo;

public class LunchSecondMaxElement 
{

	public static void main(String[] args) 
	{
		
		int age[] = {34,30,12,89,46,74,73,79,43,21,63,72,72,91,50};
		
		int max1, max2;
		max1 = max2 = age[0];//Initialize for both max1 and max2 
		
		//Counter for loop to reach each element
		for(int i = 0; i < age.length; i++)
		{
			if(age[i] > max1)
			{
				max2 = max1;
				max1 = age[i];
				
			}
			else if(age[i] > max2)
			{
				max2 = age[i];
			}
		}
		
		//Displaying the result
		System.out.println("Second largest age is "+max2);
		

	}

}
