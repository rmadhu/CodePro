package collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

//LinkedHashMap example
public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<String, String> lhm1 = new LinkedHashMap<String, String>();
		// Add elements
		lhm1.put("Arizona", "Phoenix");
		lhm1.put("Colorado", "Denver");
		lhm1.put("Georgia", "Atlanta");
		lhm1.put("Idaho", "Boise");
		lhm1.put("Arizona", "Phoenix"); // duplicate <same key, same value> - no
										// change
		lhm1.put("Arizona", "Tempe"); // <same key, diff value> - Phoenix gets
										// overwritten

		LinkedHashMap<String, Integer> lhm2 = new LinkedHashMap<String, Integer>(
				10, 0.75f, true);
		lhm2.put("Kellie", 23);
		lhm2.put("Tom", 45);
		lhm2.put("Paul", 12);

		// Display elements using iterator
		Iterator<String> i = lhm1.keySet().iterator();
		while (i.hasNext()) {
			String state = i.next();
			System.out.println("The capital of " + state + " state is "
					+ lhm1.get(state));
		}
		System.out.println("------------x------------");
		// Display the second LHM (because it has access order set) using
		// entrySet not Iterator
		for (Entry<String, Integer> result : lhm2.entrySet()) {
			System.out.println(result.getKey() + ":" + result.getValue());
		}
		System.out.println("------------x------------");
		System.out.println(lhm2);
		System.out.println("------------x------------");
		System.out.println(lhm1);

	}
}
