package co.edureka.extra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers to be stored: ");
		int no = sc.nextInt();
		
		for(int i=1;i<=no;i++) {
			System.out.print("enter element-"+i+" : ");
			list.add(sc.nextInt());
		}
		System.out.println(list);
		System.out.println("-----------------------------------------");
		
		Iterator<Integer> it = list.iterator();
		int i=0;
		int sum =0;
		while(it.hasNext())
		{		 
		  int data = it.next();
		  if(i%2 == 0)
			  sum += data;
		  i++;
		}
		System.out.println("Sum of elements in even indices = "+ sum);
		sc.close();
	}

}
