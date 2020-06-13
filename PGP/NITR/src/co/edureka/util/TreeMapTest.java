package co.edureka.util;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String,Float> bank = new TreeMap<>();
		System.out.println(bank.put("Sunil",25000f)); //null
		System.out.println(bank.put("Sunil",15100f)); //25000.5
		bank.put("Anil",45000f);
		bank.put("Sanjay",45000f);
		bank.put("Rahul",55000f);
		bank.put("Sachin",65000f);
		
		System.out.println(bank);
		
		//bank.put("Arun",null);
		bank.put(null,25000f);
		System.out.println(bank);
	}
}
