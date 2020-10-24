package co.edureka.util;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String,Float> bank = new TreeMap<String, Float>();
		
		System.out.println(bank.put("Anil",15000f)); //null
		System.out.println(bank.put("Anil",25000f)); //15000.0
		System.out.println(bank.put("Anil",12000f)); //25000.0
		bank.put("Sachin",12500f);
		bank.put("Sagar",22500f);
		bank.put("Rahul",32000f);
		
		System.out.println("No of Accounts = "+bank.size());
		System.out.println(bank);
		System.out.println();
		
		bank.put(null,25000f); // java.lang.NullPointerException
		System.out.println(bank);
	}

}
