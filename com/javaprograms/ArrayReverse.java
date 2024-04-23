package com.javaprograms;
import java.util.*;
public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array elements");
		int a = sc.nextInt();
		
		int[] arr = new int[a];             // Defining size of array
		
		for(int i=0; i<arr.length; i++)
				arr[i] = sc.nextInt();        // Entering Array Elements from User input
		
		System.out.println("Reversed Array is: ");
		for(int i=arr.length-1; i>=0; i--)  // Traversing array from last to first index(Reverse order)
			System.out.print(arr[i] + " ");
	}

}
