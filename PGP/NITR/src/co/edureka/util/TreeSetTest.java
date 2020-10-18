package co.edureka.util;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		
		System.out.println(names.add("Anil")); //true
		System.out.println(names.add("Anil")); //false
		names.add("Praveen");
		names.add("Sanjay");
		names.add("Sachin");
		names.add("Charles");
		names.add("Rahul");
		
		System.out.println(names+" | Size = "+ names.size());
		System.out.println(names.descendingSet());
		
		//names.add(null); //java.lang.NullPointerException
		System.out.println(names);
	}
}
