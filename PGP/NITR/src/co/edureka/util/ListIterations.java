package co.edureka.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> items = new ArrayList<Integer>();
		for(int i=11;i<=16;i++) {
			items.add(i); //boxing takes places
		}
		System.out.println(items);
		
		iterate1(items);
		Thread.sleep(2000);
		
		iterate2(items);
		Thread.sleep(2000);
		
		iterate3(items);
		Thread.sleep(2000);
		
		iterate4(items);
		Thread.sleep(2000);
		
		iterate5(items);
	}
	
	static void iterate1(List<Integer> items) {
		System.out.println(">>>List iteration using for loop with get method - only for java.util.List");
		for(int i=0;i<items.size();i++) {
			Integer n = items.get(i);
			System.out.print(n+"   ");
		}
		System.out.println();
	}
	
	static void iterate2(List<Integer> items) {
		System.out.println(">>>List iteration using enhanced for loop");
		for(Integer n : items) {
			System.out.print(n+"   ");
		}
		System.out.println();
	}
	
	static void iterate3(List<Integer> items) {
		System.out.println(">>>List iteration using java.util.Iterator");
		Iterator<Integer> it = items.iterator();
		while(it.hasNext())	
		{
			Integer n = it.next();
			System.out.print(n+"   ");
		}
		System.out.println();
	}
	
	static void iterate4(List<Integer> items) {
		System.out.println(">>>List iteration using java.util.ListIterator - only for java.util.List");
		ListIterator<Integer> it = items.listIterator();
		while(it.hasNext())	
		{
			Integer n = it.next();
			System.out.print(n+"   ");
		}
		System.out.println();
		while(it.hasPrevious()) {
			Integer n = it.previous();
			System.out.print(n+"   ");
		}
		System.out.println();
	}
	
	static void iterate5(List<Integer> items) {
		System.out.println(">>>List iteration using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(items);
		while(en.hasMoreElements())	
		{
			Integer n = en.nextElement();
			System.out.print(n+"   ");
		}
		System.out.println();
	}	
}
