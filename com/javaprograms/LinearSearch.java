package com.javaprograms;
import java.util.*;
public class LinearSearch {
	public static void main(String args[])
	{
		int[] arr = {23,4,67,12,71,56,34,91,10};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter desired number");
		int a = sc.nextInt();
		
		// Search number given by user 
		boolean found = false;
		for(int i=0; i<arr.length; i++)
		{
			if(a == arr[i])
			{
				found = true;
				System.out.println(a + " found at index: " +i);
				break;
			}
		
		}
		if(!found)
			System.out.println(a + " Not found in the array");
	}
}
