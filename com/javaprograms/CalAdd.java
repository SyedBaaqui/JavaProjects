package com.javaprograms;
//import java.util.*;
public class CalAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try 
		{
			int a, b, sum;
			a= Integer.parseInt(args[0]);
			b= Integer.parseInt(args[1]);
		
			sum= a+b;
				System.out.println("Addition of numbers:" + sum );
		}
	catch(Exception e) {
		System.out.println("Exception Occurred");
	}
	}

}
