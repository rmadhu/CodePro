package numberproblems;

import java.util.Scanner;

// Given a number compute it's reverse e.g. 24-> 42, 256 -> 652 

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number to be reversed:");
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		System.out.println("Reverse of the given number is:"
				+ reverseNumber(num));
		in.close();
	}

	private static String reverseNumber(String num) {
		StringBuffer rev = new StringBuffer(num);
		return rev.reverse().toString();
	}
}
