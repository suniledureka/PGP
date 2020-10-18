package co.edureka.except;

import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("enter first no: ");
			int no1 = sc.nextInt();

			System.out.print("enter second no: ");
			int no2 = sc.nextInt();
			
			if(no2 == 0) {
				//throw new ArithmeticException();
				throw new ArithmeticException("cannot divide a number by zero!");
			}
			
			int res = no1 / no2;
			System.out.println(no1 + " / " + no2 + " = " + res);			
		}
		catch(Exception ex) {
			System.out.println("Message: "+ ex.getMessage());
			System.out.println(ex.toString());
		}
	}

}
