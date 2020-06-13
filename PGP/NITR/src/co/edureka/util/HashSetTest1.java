package co.edureka.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest1 {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		//LinkedHashSet<String> names = new LinkedHashSet<>();
		System.out.println(names+" |Size="+names.size());
		
		names.add("Sunil");
		names.add("Anil");
		names.add("Naveen");
		names.add("Praveen");
		names.add("Ajay");
		System.out.println(names+" |Size="+names.size());
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.print(name+"   ");
		}
	}
}
