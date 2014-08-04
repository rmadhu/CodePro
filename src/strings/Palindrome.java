package strings;

import java.util.Scanner;

/*
 * Given a string, check if it's a palindrome or not
 * Palindrome: abba, pop, wow i.e. something that reads the same from front and back
 */
public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		checkPalindrome(str);
		in.close();

	}

	private static void checkPalindrome(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}

		if (str.equalsIgnoreCase(reverse)) {
			System.out.println("The string you've entered is a Palindrome");
		} else {
			System.out.println("The string you've entered is not a Palindrome");
		}
	}
}
