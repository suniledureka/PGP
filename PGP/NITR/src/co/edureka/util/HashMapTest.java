package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,Float> bank = new HashMap<String,Float>();
		
		System.out.println(bank.put("Sunil",15000f)); //null
		System.out.println(bank.put("Sunil",11500.50f)); //15000.0
		bank.put("Anil",25500.50f);
		bank.put("Rahul",45500f);
		bank.put("Sachin",5500.50f);
		bank.put("SUNIL",10000f);
		System.out.println(bank);
		System.out.println("---------------------------------");
		
		float bal = bank.get("Sunil");
		System.out.println("A/C Balance of Sunil = "+ bal);
		bal = bal +1500.5f;
		bank.put("Sunil",bal);
		System.out.println(bank);
		System.out.println("---------------------------------");
		
		System.out.print("A/C HOLDERS  :  ");
		Set<String> names = bank.keySet();
		for(String name : names) {
			System.out.print(name+"   ");
		}
		System.out.println();
		for(String name : names) {
			System.out.println(name+" : "+bank.get(name));
		}
		System.out.println("---------------------------------");
		
		Set<Map.Entry<String,Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String,Float>> it = entries.iterator();
		while(it.hasNext())
		{
			Map.Entry<String,Float> entry = it.next();
			String ac_name = entry.getKey();
			Float ac_bal = entry.getValue();
			System.out.println(ac_name+" = "+ac_bal);
		}
	}
}
