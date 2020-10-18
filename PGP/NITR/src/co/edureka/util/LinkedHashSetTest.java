package co.edureka.util;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<>();
		
		System.out.println(names.add("Anil")); //true
		System.out.println(names.add("Anil")); //false
		names.add("Praveen");
		names.add("Sanjay");
		names.add("Sachin");
		names.add("Charles");
		names.add("Rahul");
		
		System.out.println(names+" | Size = "+ names.size());
	}
}
