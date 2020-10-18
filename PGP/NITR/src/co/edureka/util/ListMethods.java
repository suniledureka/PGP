package co.edureka.util;

import java.util.ArrayList;

public class ListMethods {
	public static void main(String[] args) 
	{
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names+" | Size = "+ names.size());
		
		names.add("Sunil");
		names.add("Sunil");
		names.add("Anil");
		names.add("Praveen");
		names.add("Naveen");
		names.add("Jefferey");
		names.add("Chris");
		names.add("Charles");
		names.add("Sunil");
		
		System.out.println(names+" | Size = "+ names.size());
		names.add(1,"Brea");
		names.set(2,"Sanjay");
		System.out.println(names+" | Size = "+ names.size());
		
		System.out.println("Is \"Praveen\" in List = "+ names.contains("Praveen"));
		
		String name = names.get(0);
		System.out.println("Person @ index 0 = "+ name);
		
		System.out.println("Index of Sunil = "+ names.indexOf("Sunil"));
		System.out.println("Last Index of Sunil = "+ names.lastIndexOf("Sunil"));
		
		System.out.println(names.remove("Sunil")); //true
		System.out.println(names.remove(0)); //Brea
		System.out.println(names);
	}
}
