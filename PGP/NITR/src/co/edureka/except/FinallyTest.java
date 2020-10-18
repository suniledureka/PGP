package co.edureka.except;

import java.util.Scanner;

public class FinallyTest 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("enter first no: ");
			int no1 = sc.nextInt();

			System.out.print("enter second no: ");
			int no2 = sc.nextInt();

			int res = no1 / no2;
			System.out.println(no1 + " / " + no2 + " = " + res);
		} 
		catch (ArithmeticException ex) {
			System.out.println(".... in catch block.....");
			System.out.println(ex.toString());
		}
		finally {
			System.out.println("Application designed & developed by ");
			System.out.println("team @ edureka");
			sc.close();
		}
		System.out.println("--- DONE ---");
	}
}
