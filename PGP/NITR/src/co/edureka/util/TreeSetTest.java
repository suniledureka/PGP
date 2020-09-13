package co.edureka.util;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		System.out.println(names+" | Size="+names.size());
		
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		names.add("Praveen");
		names.add("Naveen");
		names.add("Anil");
		names.add("Charles");
		System.out.println(names+" | Size="+names.size());		
		
		//System.out.println(names.descendingSet());
		
		//names.add(null);

	}

}
