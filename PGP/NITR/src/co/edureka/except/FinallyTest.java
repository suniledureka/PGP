package co.edureka.except;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("enter first no: ");
			int fno = sc.nextInt();
			
			System.out.print("enter second no: ");
			int sno = sc.nextInt();
			
			int res = fno/sno;
			System.out.println(fno+" / "+sno+" = "+res);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.toString());
		}
		finally {
			System.out.println("Application Designed & Developed by");
			System.out.println("team @ edureka");
			sc.close();
		}
		System.out.println("-- DONE --");
	}
}
