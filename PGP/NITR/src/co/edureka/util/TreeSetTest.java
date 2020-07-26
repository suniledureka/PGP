package co.edureka.util;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) throws InterruptedException {
		TreeSet<String> names = new TreeSet<>();
		
		System.out.println(names.add("Anil")); //true
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		names.add("Pankaj");
		names.add("Charles");
		names.add("Rahul");
		names.add("Sachin");
		
		System.out.println(names+" | Size="+names.size());		
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
			Thread.sleep(1000);
		}
	}

}
