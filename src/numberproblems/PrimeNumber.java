package numberproblems;

import java.util.Scanner;

/*
 * Given a number tells if it's a prime number or not
 * Input any number between 1 and 5000
 * Output Prime/Not prime
 */
public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter any number between 2 and 5000:");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		if (number < 2) {
			System.out.println("Number must be between 2 and 5000");
		} else {
			System.out.println("The number " + number + " is "
					+ isPrime(number));
		}
		in.close();
	}

	private static String isPrime(int number) {
		boolean flag = true;
		String result;
		for (int i = 2; i <= number/2; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			result = "prime";
		} else {
			result = "not prime";
		}
		return result;
	}
}
