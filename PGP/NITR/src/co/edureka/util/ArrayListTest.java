package co.edureka.util;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		System.out.println(names+" | Size="+names.size());
		
		names.add("Anil");
		names.add("Sanjay");
		names.add("Praveen");
		names.add("Pankaj");
		names.add("Sujith");
		names.add("Rahul");
		names.add("Anil");
		System.out.println(names+" | Size="+names.size());
		
		names.add(1,"Sunil");
		System.out.println(names+" | Size="+names.size());
		
		names.set(2, "Sachin");
		System.out.println(names+" | Size="+names.size());
		
		System.out.println(names.contains("Sunil"));
		
		System.out.println(names.get(0));
		
		System.out.println("Index of Anil = "+ names.indexOf("Anil"));
		System.out.println("Last Index of Anil = "+ names.lastIndexOf("Anil"));
		
		System.out.println(names.remove("Anil")); //true
		System.out.println(names.remove(0)); //Sunil
		
		System.out.println(names+" | Size="+names.size());
	}
}