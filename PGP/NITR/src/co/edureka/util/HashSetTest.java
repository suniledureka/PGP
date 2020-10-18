package co.edureka.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) 
	{
		HashSet<String> names = new HashSet<String>();
		
		System.out.println(names.add("Anil")); //true
		System.out.println(names.add("Anil")); //false
		names.add("Praveen");
		names.add("Sanjay");
		names.add("Sachin");
		names.add("Charles");
		names.add("Rahul");
		
		System.out.println(names+" | Size = "+ names.size());
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		names.add(null);
		System.out.println(names);
	}
}
