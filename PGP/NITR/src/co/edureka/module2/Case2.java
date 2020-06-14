/*
In a list of distinct numbers, print list of all number pairs. e.g. (x, y) and (p, q) such that x * y = p * q, where: x, y, p and q are distinct elements. 
If there are multiple answers, then print any one of them. 
You have to use Java HashMap for solving this problem.
*/
package co.edureka.module2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Case2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		dataEntry(list);
		
		boolean result = findPairs(list);
		
		if(!result)
			System.out.println("No matching pairs found!");
	}

	static void dataEntry(List<Integer> list) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter how many elements to store: ");
		int no = sc.nextInt();

		for (int i = 1; i <= no; i++) {
			System.out.print("enter element-" + i + ": ");
			int n = sc.nextInt();
			list.add(n);
		}
		sc.close();
	}
	
	static boolean findPairs(List<Integer> list) {
		HashMap<Integer,Pair> map = new HashMap<Integer,Pair>();
		
		for(int i=0;i<list.size()-1;i++) {
			for(int j=i+1;j<list.size();j++) {
				int prod = list.get(i)*list.get(j);
				if(!map.containsKey(prod)) {
					map.put(prod,new Pair(list.get(i),list.get(j)));
				}
				else {
					Pair p = map.get(prod);
					System.out.println("("+list.get(i)+","+list.get(j)+") = ("+p.first+","+p.second+")");
					return true;
				}
			}
		}
		return false;
	}
}


class Pair{
	int first, second;
	Pair(int first, int second){
		this.first = first;
		this.second = second;
	}
}
