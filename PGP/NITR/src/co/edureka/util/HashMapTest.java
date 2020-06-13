package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,Float> bank = new HashMap<String,Float>();
		//LinkedHashMap<String,Float> bank = new LinkedHashMap<String,Float>();
		
		
		System.out.println(bank.put("Sunil",25000f)); //null
		System.out.println(bank.put("Sunil",15100f)); //25000.5
		bank.put("Anil",45000f);
		bank.put("Sanjay",45000f);
		bank.put("Rahul",55000f);
		bank.put("Sachin",65000f);
		
		System.out.println(bank);
		
		/*-- get value of a key ---*/
		Float bal = bank.get("Sunil");
		System.out.println("Balance Amount of Sunil = "+ bal);
		
		bal = bal + 1500.5f;
		bank.put("Sunil",bal);
		System.out.println(bank);
		
		/*--to get the keys ---*/
		System.out.print("A/C Holders: ");
		Set<String> names = bank.keySet();
		for(String name : names) {
			System.out.print(name+" | ");
		}
		System.out.println();
		
		System.out.println("---------------------");
		
		/*--- to get key-value pairs ---*/		
		Set<Map.Entry<String,Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String,Float>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String,Float> entry = it.next();
			String name = entry.getKey();
			Float val = entry.getValue();
			System.out.println(name+" : "+val);
		}
		
		bank.put(null,null);
		System.out.println(bank);
	}
}
