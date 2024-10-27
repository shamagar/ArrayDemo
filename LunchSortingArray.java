//Demonstrating sorting of a Array

package com.lunchArrayDemo;

public class LunchSortingArray 
{

	public static void main(String[] args) 
	{
		String lang[] = {"java","basic","pascal","smalltalk","python","ada"};
		
		java.util.Arrays.sort(lang);
		for(String s : lang)
		{
			System.out.println(s);
		}
	}

}
