package arrays;

import java.util.Scanner;

/* Problem from HackerRank
 * Find the missing no. in an Arithmetic Progression
 * Input: Given a number N as Input and then N numbers followed (where 3<=N<=2500). 
 * These N numbers are part of an Arithmetic Progression (of size N+1) 
 * from which one number is removed. 
 * find that missing number.
 * For instance: 
5
1 3 5 9 11  
The output is 7
 */
public class MissingNumberInArithmeticProgression {

	public static void main(String args[]) {

		System.out.println("Enter number of elements n where 3<=n<=2500:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		in.nextLine(); // to ignore rest of the above line esp "end of line"

		System.out.println("Enter elements separated by a space:");
		String strarray[];

		String elements = in.nextLine();
		strarray = elements.split(" ");

		int intarray[] = new int[strarray.length];
		for (int i = 0; i < intarray.length; i++) {
			intarray[i] = Integer.parseInt(strarray[i]);
		}

		in.close();

		System.out.println("Missing number is:"+findMissingNumber(intarray, num));
	}

	private static int findMissingNumber(int[] intarray, int num) {
		// TODO Auto-generated method stub
		/* find difference = min(leftdiff, rightdiff) 
		 * OR
		 * difference = last element - 1st element / no. of elements
		 */
				
		int length = intarray.length;
		// test cases
		/*
		int leftdiff = intarray[1] - intarray[0];
		int rightdiff = intarray[length - 1] - intarray[length - 2];
		int diff = (leftdiff > rightdiff) ? rightdiff : leftdiff;*/
		
		int diff = (intarray[length-1]-intarray[0])/num;
		int missing=0;
		
		System.out.println("Difference:"+diff);

		for (int i = 0; i < length; i++) {
			if (intarray[i + 1] != intarray[i] + diff) {
				missing = intarray[i] + diff;
				break;
			}

		}
		return missing;
	}
}
