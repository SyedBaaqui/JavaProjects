package com.javaprograms;
import java.util.*;
public class RecurSumArray {
	public static int sum(int arr[])
	{
		if(arr.length == 0)
			return 0;
		int newArray[] = new int[arr.length-1]; // Creating new array
		for(int i=1; i<arr.length; i++)
			newArray[i-1] = arr[i];			// Copying elements from old to new array
		
		int sumElements = sum(newArray);    // Recursive call of the sum function with new array
		int output = arr[0] + sumElements;  
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.print("Sum of elemetns is: ");
		System.out.println(sum(arr));
	}

}
