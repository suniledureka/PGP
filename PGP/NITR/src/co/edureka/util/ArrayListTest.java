package co.edureka.util;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) 
	{
		ArrayList<String> names = new ArrayList<String>();  //generics for type-safety
		System.out.println(names+" |Size="+names.size());
		
		//adding objects to collection
		names.add("Sunil");
		names.add("Anil");
		names.add("Sunil");
		names.add("Jeffery");
		names.add("Chris");
		names.add("Charles");
		names.add("Brea");
		names.add("Sunil");		
		
		System.out.println(names+" |Size="+names.size());
		
		System.out.println("Is Anil in List = "+ names.contains("Anil"));
		
		System.out.println("Index of Sunil = "+ names.indexOf("Sunil"));
		System.out.println("Last Index of Sunil = "+ names.lastIndexOf("Sunil"));
		
		names.add(1,"edureka");
		names.set(3, "Joseph"); //to replace an existing object
		System.out.println(names+" |Size="+names.size());
		
		String name = names.get(0); //to get an object from an index
		System.out.println("Person @ index 0 = "+ name);
		
		/*to remove an object from List*/
		System.out.println("removing based on index = "+names.remove(0));
		System.out.println("removing based on object = "+names.remove("Sunil"));
		
		System.out.println(names+" |Size="+names.size());
	}
}
