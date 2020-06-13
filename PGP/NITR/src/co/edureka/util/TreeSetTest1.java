package co.edureka.util;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>(new MyComparator());
		
		System.out.println(names+" |Size="+names.size());
		
		names.add("Sunil");
		names.add("Anil");
		names.add("Naveen");
		names.add("Praveen");
		names.add("Ajay");
		System.out.println(names+" |Size="+names.size());
		
		Set<String> set = names.descendingSet();
		System.out.println(set);
		
	}
}

class MyComparator implements Comparator<String>{
	@Override //annotation
	public int compare(String o1, String o2) {
		System.out.println(o1+" - "+o2);
		int n = o1.compareTo(o2);
		if(n>0)
		 return -1;
		else if(n<0)
		 return 1;
		else
		 return 0;
	}	
}
