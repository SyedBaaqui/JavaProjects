package com.javaprograms;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter desired element");
		int n = sc.nextInt();
		
		int result = fibonacci(n);         
		System.out.println("The " + n + "th fibonacci number is " +result);
	}
	public static int fibonacci(int n)
	{
		if(n<= 1)
			return n;
		else 
			return fibonacci(n-1) + fibonacci(n-2);
	}
}
