package co.edureka.extra;

import java.util.HashMap;
import java.util.Scanner;
class Pair
{
	int fno,sno;
	Pair(int fno,int sno)
	{
		this.fno = fno;
		this.sno = sno;
	}
}

public class Case3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("How many numbers to be stored: ");
		int no = sc.nextInt();
		
		int[] arr = new int[no];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("enter element-"+(i+1)+": ");
			arr[i]= sc.nextInt();
		}
		
		HashMap<Integer,Pair> map = new HashMap<>();
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++) {
				int prod = arr[i]*arr[j];
				if(!map.containsKey(prod)) {
					map.put(prod,new Pair(arr[i],arr[j]));
				}
				else {
					Pair pair = map.get(prod);
					System.out.println("("+arr[i]+","+arr[j]+") and ("+pair.fno+","+pair.sno+")");
					return;
				}
			}
		}
		System.out.println("NO PAIRS FOUND");
		sc.close();
	}
}
