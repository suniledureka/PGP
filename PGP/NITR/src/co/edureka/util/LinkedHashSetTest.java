package co.edureka.util;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<>();
		System.out.println(names+" | Size="+names.size());
		
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		names.add("Praveen");
		names.add("Naveen");
		names.add("Anil");
		names.add("Charles");
		System.out.println(names+" | Size="+names.size());
		names.add(null);
		System.out.println(names);
	}

}
