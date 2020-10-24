package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest 
{
	public static void main(String[] args) 
	{
		HashMap<String,Float> bank = new HashMap<String,Float>();
		
		System.out.println(bank.put("Anil",15000f)); //null
		System.out.println(bank.put("Anil",25000f)); //15000.0
		System.out.println(bank.put("Anil",12000f)); //25000.0
		bank.put("Sachin",12500f);
		bank.put("Sagar",22500f);
		bank.put("Rahul",32000f);
		
		System.out.println("No of Accounts = "+bank.size());
		System.out.println(bank);
		System.out.println();
		
		float bal = bank.get("Sachin");
		System.out.println("A/C Balance of Sachin = "+ bal);
		bal = bal + 1500.5f;
		bank.put("Sachin",bal);
		System.out.println(bank);
		System.out.println();
		
		
		System.out.print("A/C Holders =  ");
		Set<String> names = bank.keySet();
		for(String name : names) {
			System.out.print(name+" | ");
		}
		System.out.println("\n");
		
		//to get all entries (key+value) from Map
		Set<Map.Entry<String,Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String,Float>> it = entries.iterator();
		while(it.hasNext())
		{
  		  Map.Entry<String,Float> entry = it.next();	
		  String name = entry.getKey();
		  bal = entry.getValue();
		  System.out.println(name+" = "+bal);
		}
		System.out.println();
		
		bank.put(null,null);
		System.out.println(bank);
	}
}
