package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) throws InterruptedException {
		HashMap<String, Float> bank = new HashMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 25000.50f)); //null
		System.out.println(bank.put("Sunil", 11500.50f)); //25000.5
		System.out.println(bank.put("Anil", 25000.50f)); //null
		bank.put("Rahul",45000f);
		bank.put("Sachin",Float.valueOf(48500f));
		bank.put("Sanjay",74500f);
		
		System.out.println(bank);
		System.out.println("----------------------------");
		
		float bal = bank.get("Sunil");
		System.out.println("A/C Balance of Sunil = "+ bal);
		bal = bal + 1500.5f;
		bank.put("Sunil", bal);
		System.out.println(bank);
		System.out.println("----------------------------");
		
		Set<String> names = bank.keySet();
		System.out.print("A/C Holders :   ");
		for(String name : names) {
			System.out.print(name+" | ");
		}
		System.out.println();
		System.out.println("----------------------------");
		
		Set<Map.Entry<String, Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String, Float>> it = entries.iterator();
		while(it.hasNext())
		{
		 Map.Entry<String, Float> entry = it.next();
		 String name = entry.getKey();
		 bal = entry.getValue();
		 
		 System.out.println(name+" : "+bal);
		 Thread.sleep(1000);
		}
		System.out.println("--------------------------------");
		
		bank.put(null,null);
		System.out.println(bank);
	}
}
