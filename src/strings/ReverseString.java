package strings;

import java.util.Scanner;

/*
 * Write a program to reverse a given string
 */
public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner in = new Scanner(System.in);
		String original = in.nextLine();
		System.out.println("Reverse of the String is:"
				+ reverseString(original));
		in.close();
	}

	private static String reverseString(String original) {
		String reverse = "";
		
	/*	// Using a Stringbuffer
		StringBuffer rev = new StringBuffer(original);
		return rev.reverse();*/

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		return reverse;
	}
}
