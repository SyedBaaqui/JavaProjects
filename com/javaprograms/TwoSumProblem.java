package com.javaprograms;
import java.util.*;
public class TwoSumProblem {

	public static int[] twoSum(int target, int[] num) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[2];
		
		for(int i=0; i<num.length; i++)
		{
			for(int j=i+1; j<num.length; j++)
			{
				if(num[i]+num[j] == target);
				{
					arr[0] = i;
					arr[1] = j;
					return arr;
				}
			}
		}
		return new int[0];
	}


	public static void main(String[] args)
	{
		int[] num = {9,3,5,7};
		int target = 12;
		int[] arr = twoSum(target, num);
		if(arr.length == 2)
		{
			System.out.println("Indices:" + arr[0] + ", " + arr[1]);
			System.out.println("Numbers:" + num[arr[0]] + ", " + num[arr[1]]);
		} 
		else {
			System.out.println("No solution found");
		}	
	}
}
