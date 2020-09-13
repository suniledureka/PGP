package co.edureka.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {

	public static void main(String[] args) throws Exception{
		List<Integer> marks = new ArrayList<>();
		for(int i=90;i<=96;i++) {
			marks.add(i);
		}
		System.out.println(marks);
		
		iteration1(marks);
		Thread.sleep(1500);//1500ms
		
		iteration2(marks);
		Thread.sleep(1500);
		
		iteration3(marks);
		Thread.sleep(1500);
		
		iteration4(marks);
		Thread.sleep(1500);
		
		iteration5(marks);		
	}//main
	
	static void iteration1(List<Integer> data) {
		System.out.println("1.List Iteration using for loop and get() - only for java.util.List");
		for(int i=0;i<data.size();i++) {
			Integer n = data.get(i);
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}
	
	
	static void iteration2(List<Integer> data) {
		System.out.println("2.List Iteration using an enhanced for loop");
		for(Integer n : data) {
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}
	
	static void iteration3(List<Integer> data) {
		System.out.println("3.List Iteration using java.util.Iterator");
		Iterator<Integer> it = data.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}
	
	static void iteration4(List<Integer> data) {
		System.out.println("4.List Iteration using java.util.ListIterator - only for java.util.List");
		ListIterator<Integer> lit = data.listIterator();
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
	
	
	static void iteration5(List<Integer> data) {
		System.out.println("5.List Iteration using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(data);
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n+"   ");
		}
		System.out.println();
	}
}
