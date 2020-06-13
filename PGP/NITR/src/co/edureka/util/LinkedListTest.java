package co.edureka.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		System.out.println(list+" |Size = "+list.size());
		
		list.add("HTML");
		list.add("CSS");
		list.add("Java Script");
		list.add("jQuery");
		list.add("Bootstrap");
		
		System.out.println(list+" |Size = "+list.size());
		
		list.addFirst("Web Technologies");
		list.addLast("Angular");
		list.add(1,"React JS");
		System.out.println(list+" |Size = "+list.size());
		
		
		List<Integer> marksList = Arrays.asList(98,85,74,86);
		System.out.println(marksList);
	}
}
