package co.edureka.util;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String, Float> bank = new TreeMap<>();
		System.out.println(bank.put("Sunil", 25000.50f)); //null
		System.out.println(bank.put("Sunil", 11500.50f)); //25000.5
		System.out.println(bank.put("Anil", 25000.50f)); //null
		bank.put("Rahul",45000f);
		bank.put("Sachin",Float.valueOf(48500f));
		bank.put("Sanjay",74500f);
		
		System.out.println(bank);
		System.out.println("--------------------------------");
		
		bank.put(null, 25000f);
		System.out.println(bank);
	}

}
