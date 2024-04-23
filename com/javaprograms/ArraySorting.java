package com.javaprograms;

public class ArraySorting {
	public static void BruteForceSort(int arr[])
	{
		for(int i=0; i< arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,7,1,4};

		// Sorting
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{	// Swapping of array elements
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
		BruteForceSort(arr);
	}

}
