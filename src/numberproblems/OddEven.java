package numberproblems;

import java.util.Scanner;

/*
 * Java program to find if a number is odd or even
 * Input number
 * Output Odd/Even
 */
public class OddEven {

	public static void main(String args[]) {
		System.out.println("Enter any integer:");
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		int number = Integer.parseInt(line);
		System.out.println(oddOrEven(number));
		System.out.println(isOdd(number));
		in.close();
	}

	// Using % operator
	private static String oddOrEven(int number) {
		String result;
		result = number % 2 != 0 ? "Odd" : "Even";
		return result;
	}

	// Using & operator
	private static String isOdd(int number) {
		String result;
		result = ((number & 1) == 0) ? "Even" : "Odd";
		return result;
	}

}
