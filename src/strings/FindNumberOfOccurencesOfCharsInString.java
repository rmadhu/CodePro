package strings;
/* Problem from HackerRank
 * Given 2 strings - A and B, find the total of number of occurrences of 
 * each character of the source string A in the target string B
 * For instance:
 * Input: A = Hello World
 * 		  B = llld
 * Output: 4 
 * ['l' occurs 3 times + 'd' occurs 1 time so 4]
 * 
 * Input: A = Outware Mobile
 * 		  B = ome
 * Output: 5 
 * [o=2, m=1, e=2]
 */
import java.io.*;
import java.util.Scanner;
public class FindNumberOfOccurencesOfCharsInString {
    public static void main(String args[] ) throws Exception {
    	
		Scanner in = new Scanner(System.in);
		String target = in.nextLine();
		String source = in.nextLine();

		System.out.println(findOccurrences(target, source));
		in.close();
	}

	private static int findOccurrences(String target, String source) {
		// TODO Auto-generated method stub
		// remove duplicate chars from source

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < source.length(); i++) {
			String currentChar = source.substring(i, i + 1);
			if (result.indexOf(currentChar) < 0) // if not contained
				result.append(currentChar);
		}

		// to char array
		char[] chararray = result.toString().toCharArray();

		int counter = 0;
		for (int i = 0; i < chararray.length; i++) {
			for (int j = 0; j < target.length(); j++) {
				if (Character.toLowerCase(chararray[i])==Character.toLowerCase(target.charAt(j))) {
					counter++;
				}
			}
		}

		return counter;
	}
}