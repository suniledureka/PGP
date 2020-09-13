package co.edureka.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		System.out.println(names+" | Size="+names.size());
		
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		names.add("Praveen");
		names.add("Naveen");
		names.add("Anil");
		names.add("Charles");
		System.out.println(names+" | Size="+names.size());
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		names.add(null);
		System.out.println(names);
	}
}
