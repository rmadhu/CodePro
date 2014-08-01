package numberproblems;
/*
 * Given 3 numbers find the largest
 */
import java.util.Scanner;

public class LargestOf3 {

	public static void main(String[] args) {
		System.out.println("Enter 3 numbers:");
		Scanner in = new Scanner(System.in);
		int x, y, z;
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		System.out.println("The largest number is " + findLargest(x, y, z));
		in.close();
	}

	private static int findLargest(int x, int y, int z) {
		int largest = 0;
		if (x >= y && x >= z) {
			largest = x;
		} else if (y >= x && y >= z) {
			largest = y;
		} else if (z >= y && z >= x) {
			largest = z;
		}
		return largest;
	}
}
