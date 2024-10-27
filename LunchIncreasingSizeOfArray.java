//Demonstrate increasing size of Array
package com.lunchArrayDemo;

import java.util.Arrays;

public class LunchIncreasingSizeOfArray 
{

	public static void main(String[] args) 
	{
		String country[] = {"USA","Nepal","India","China","Bhutan","Brazil","Canada","Austrila"};
		
		System.out.println(Arrays.toString(country));//Printing an Array
		
		System.out.println(" ");
		
		//Creating a new array
		String newCountry[] = new String[2*country.length];
		
		for(int i = 0; i < country.length; i++)
		{
			newCountry[i] = country[i]; //Copying elements from country to newCountry
		}
		country = newCountry;//country is referring to newCountry
		newCountry = null;
		
		//Printing an Array after increasing size
		System.out.println(Arrays.toString(country));

	}

}
