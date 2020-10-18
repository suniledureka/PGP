package co.edureka.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {
	
	public static void main(String[] args) throws Exception
	{
		ArrayList<Integer> data = new ArrayList<>();
		//storing data into List
		for(int i=11;i<=16;i++) {
			data.add(i);
		}
		System.out.println(data);
		
		iterate1(data);
		Thread.sleep(1500);
		
		iterate2(data);
		Thread.sleep(1500);
		
		iterate3(data);
		Thread.sleep(1500);
		
		iterate4(data);
		Thread.sleep(1500);
		
		iterate5(data);
	}
	
	static void iterate1(List<Integer> list) {
		System.out.println("1.List iteration using a for loop with get() - only for List");;
		for(int i=0;i<list.size();i++) {
			Integer n = list.get(i);
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}
	
	static void iterate2(List<Integer> list) {
		System.out.println("2.List iteration using enhanced for loop");
		for(Integer n : list) {
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}
	
	static void iterate3(List<Integer> list) {
		System.out.println("3.List iteration using java.util.Iterator");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}
	
	static void iterate4(List<Integer> list) {
		System.out.println("4.List iteration using java.util.ListIterator - only for List");
		ListIterator<Integer> lit = list.listIterator();
		while(lit.hasNext()) {
			Integer n = lit.next();
			System.out.print(n+"   ");
		}
		System.out.println("");
		
		while(lit.hasPrevious()) {
			Integer n = lit.previous();
			System.out.print(n+"   ");
		}
		System.out.println("\n");		
	}	
	
	
	static void iterate5(List<Integer> data) {
		System.out.println("5.List iteration using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(data);
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}
}
