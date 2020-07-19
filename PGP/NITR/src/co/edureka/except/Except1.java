package co.edureka.except;

import java.util.Scanner;
public class Except1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first no: ");
		int x = sc.nextInt();
		
		System.out.print("enter second no: ");
		int y = sc.nextInt();
		
		int res = x/y;
		System.out.println(x+" / "+y +" = "+res);
		
		System.out.println("-- DONE --");
	}
}
