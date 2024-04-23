package com.javaprograms;
import java.util.*;
public class PrimeNumber {
	public static void main(String args[])
	{
		try
		{		Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number");
				int a = sc.nextInt();
		
				int count = 0;
		
				for(int i=1; i<=a; i++)
					if(a%i == 0)   
						count++;    // increase the count of divisor
		
				if(count == 2)
					System.out.println("Entered number is prime");
				else 
					System.out.println("Entered number is not prime");
		}
		catch(Exception e)
		{
			System.out.println("Arithmatic Exception occured");
		}
	}
}
