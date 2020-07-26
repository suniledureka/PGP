package co.edureka.util;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>(new MyComparator());
		
		names.add("Anil");
		names.add("Sunil");
		names.add("Pankaj");
		names.add("Charles");
		names.add("Rahul");
		names.add("Sachin");
		
		System.out.println(names+" | Size="+names.size());
	}
}

class MyComparator implements Comparator<String>
{
	@Override
	public int compare(String o1, String o2) {
		//System.out.println(o1+" - "+o2);
		int n = o1.compareTo(o2);
		if(n>0)
			return -1;
		else if(n<0)
			return 1;
		else
			return 0;
	}
	
}
