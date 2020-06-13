package co.edureka.util;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		
		System.out.println(names+" |Size="+names.size());
		
		names.add("Sunil");
		names.add("Anil");
		names.add("Naveen");
		names.add("Praveen");
		names.add("Ajay");
		System.out.println(names+" |Size="+names.size());
		System.out.println(names.descendingSet()+" |Size="+names.size());
	}

}
