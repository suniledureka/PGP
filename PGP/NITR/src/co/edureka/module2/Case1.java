/*
 Write a Java program to insert the input values into an ArrayList & 
 print the sum of elements (integers) present at even index of the ArrayList. 
 You have to use an iterator to read all the elements of the list. 
*/

package co.edureka.module2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {		
		ArrayList<Integer> list = new ArrayList<>();
		
		dataEntry(list);
		
		System.out.println(list);
		
		int sum = findSum(list);
		
		System.out.println("Sum of Elements in the even indices =  "+ sum);		
	} //main
	
	static void dataEntry(List<Integer> list) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter how many elements to store: ");
		int no = sc.nextInt();
		
		for(int i=1;i<=no;i++) {
			System.out.print("enter element-"+i+": ");
			int n = sc.nextInt();
			list.add(n);
		}
		sc.close();
	}
	
	static int findSum(List<Integer> list) {
		int sum=0,index=0;
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int n = it.next();
			if((index%2) == 0) {
				sum += n;		
			}
			
			index++;
		}
		return sum;
	}
}
