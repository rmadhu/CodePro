package collections;

//Hashmap example

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, String> books = new HashMap<String, String>();

		// Add elements
		books.put("One hundred years of solitude", "Garcia Gabriel Marquez");
		books.put("The space between us", "Thrity Umrigar");
		books.put("Unaccustomed Earth", "Jhumpa Lahiri");
		books.put("Rebecca", "Daphne du Maurier");
		books.put("Interpreter of Maladies", "Jhumpa Lahiri");
		books.put("Cutting for Stone", "Abraham Verghese");

		// Display elements
		Iterator<String> i = books.keySet().iterator();
		System.out.println("A few favorites:");
		while (i.hasNext()) {
			String result = (String) i.next();
			System.out.println("Title: " + result + " *** Author: "
					+ books.get(result));
		}
	}

}
