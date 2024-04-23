package com.javaprograms;

public class StringOperations {

		public static String reverseConcatExtract(String s1, String s2, int length)
		{
			// String concatenation
			String concatenated = s1 + s2;
			// Reverse concatenated string 
			StringBuilder reversed = new StringBuilder(concatenated);
			reversed.reverse();
			
			// finding strart index of middle substring
			int startIndex = (reversed.length() - length)/2;
			// Extract the middle substring 
			String result = reversed.substring(startIndex, startIndex + length);
			return result;
		}
		public static void main(String[] args)
		{
			String s1 = "Syed";
			String s2 = "Baaqui";
			int length = 4;
			
			String result = reverseConcatExtract(s1, s2, length);
					System.out.println("Fial Result is: " + result);
		}
}
