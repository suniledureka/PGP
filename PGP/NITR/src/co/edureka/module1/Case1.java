package co.edureka.module1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Case1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();		

		dataEntry(list);

		System.out.println(list);

		int sum = 0;
		Iterator<Integer> it = list.iterator();
		int index = 0;
		while (it.hasNext()) {
			int data = it.next();
			if (index % 2 == 0) {
				sum = sum + data;
			}
			index++;
		}

		System.out.println("Sum of Even Elements in List = " + sum);
	}// main

	static void dataEntry(List<Integer> list) {
		System.out.print("How many elements to be stored: ");
		int no = sc.nextInt();
		
		for (int i = 1; i <=no ; i++) {
			System.out.print("Enter element-" + i + ": ");
			list.add(sc.nextInt());
		}
	}

}
