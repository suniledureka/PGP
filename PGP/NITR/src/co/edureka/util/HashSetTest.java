package co.edureka.util;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) throws InterruptedException {
		HashSet<String> names = new HashSet<>();
		
		System.out.println(names.add("Anil")); //true
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		names.add("Pankaj");
		names.add("Charles");
		names.add("Rahul");
		names.add("Sachin");
		
		System.out.println(names+" | Size="+names.size());		
		
		for(String name : names) {
			System.out.print(name+" | ");
			Thread.sleep(1000);
		}
	}
}
