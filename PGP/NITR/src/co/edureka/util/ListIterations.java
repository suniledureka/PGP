package co.edureka.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		for(int i=90; i<=96;i++) {
			marks.add(i);
		}
		System.out.println(marks);
		
		iterate1(marks); //method call
		Thread.sleep(1500);
		
		iterate2(marks);
		Thread.sleep(1500);

		iterate3(marks);
		Thread.sleep(1500);		

		iterate4(marks);
		Thread.sleep(1500);		
		
		iterate5(marks);
		Thread.sleep(1500);
		
		System.out.println("==================================");
		System.out.println(marks);
		
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext()) {
			Integer x = it.next();
			System.out.print(x+"   ");
			it.remove();
			Thread.sleep(1000);			
		}
		System.out.println();
		
		System.out.println(marks);
	}//main
	
	static void iterate1(List<Integer> data)
	{
		System.out.println("<<<1.iteration using for loop & get() - only for java.util.List");
		for(int i=0;i<data.size();i++) {
			Integer n = data.get(i);
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}//iterate1
	
	
	static void iterate2(List<Integer> data)
	{
	  System.out.println("<<<2.iteration using enhanced for loop");
	  for(Integer n : data) {
		  System.out.print(n+"   ");
	  }
	  System.out.println("\n");	  
	}//iterate2
	
	static void iterate3(List<Integer> data)
	{
	  System.out.println("<<<3.iteration using java.util.Iterator");
	  Iterator<Integer> it = data.iterator();
	  while(it.hasNext())
	  {
		Integer n = it.next();
		System.out.print(n+"   ");
	  }
	  System.out.println("\n");
	}//iterate3
	
	static void iterate4(List<Integer> data)
	{
	  System.out.println("<<<4.iteration using java.util.ListIterator- only for java.util.List");
	  ListIterator<Integer> lit = data.listIterator();
	  while(lit.hasNext())
	  {
		Integer n = lit.next();
		System.out.print(n+"   ");
	  }
	  System.out.println();
	  while(lit.hasPrevious())
	  {
		Integer n = lit.previous();
		System.out.print(n+"   ");
	  }
	  System.out.println("\n");
	}//iterate4
	
	
	static void iterate5(List<Integer> data)
	{
	 System.out.println("<<<5.iteration using java.util.Enumeration");
	 Enumeration<Integer> en = Collections.enumeration(data);
	 while(en.hasMoreElements())
	 {
		Integer n = en.nextElement();
		System.out.print(n+"   ");
	 }
	 System.out.println("\n");
	} //iterate5
	
}
