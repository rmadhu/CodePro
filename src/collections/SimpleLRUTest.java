package collections;

public class SimpleLRUTest {
	public static void main(String[] args) {
		SimpleLRUCache<String, Integer> test = new SimpleLRUCache<String, Integer>(3);
		test.put("Adrian", 23);
		test.put("Debra", 21);
		test.put("Colin", 45);
		test.put("Ben", 36);
		System.out.println(test);
		System.out.println("Colin's age: "+test.get("Colin"));
		System.out.println(test);
		test.put("Laura", 18);
		System.out.println(test);
		test.put("Adrian", 23);
		System.out.println(test);
	}
}
