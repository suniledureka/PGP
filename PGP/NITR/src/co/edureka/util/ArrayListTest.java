package co.edureka.util;

import java.util.ArrayList;

public class ArrayListTest 
{
	public static void main(String[] args) throws Exception
	{
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names + "|Size = "+ names.size());
		
		names.add("Anil");
		names.add("Sunil");
		names.add("Sunil");
		names.add("Charles");
		names.add("Sanjay");
		names.add("Sunil");
		System.out.println(names + "|Size = "+ names.size());
		
		names.add(1,"Pankaj");
		System.out.println(names + "|Size = "+ names.size());
		
		names.set(2,"Sachin");
		System.out.println(names + "|Size = "+ names.size());
		
		System.out.println("Is Sachin in List = "+ names.contains("Sachin"));
		
		System.out.println("Index of Sunil = "+ names.indexOf("Sunil"));
		
		System.out.println("Last Index of Sunil = "+ names.lastIndexOf("Sunil"));
		
		System.out.println("Person @ index 0 = "+ names.get(0));
		
		System.out.println(names.remove("Sunil")); //true
		System.out.println(names.remove(5)); //Sunil
		System.out.println(names + "|Size = "+ names.size());
	}
}
