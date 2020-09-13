package co.edureka.except;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String req = "Y";
		
		while(req.equalsIgnoreCase("Y"))
		{
			System.out.print("enter voter's age: ");
			try {
				int age = sc.nextInt();
				if(age<18) {
					//create an exception object
					InvalidAgeException ex = new InvalidAgeException("age should be >= 18");
					throw ex;					
				}
				else {
					System.out.println("VOTING DONE!");
				}				
			}
			catch(Exception e) {
				System.out.println(e.toString());
			}
			System.out.print("Any one to vote [Y/N] : ");
			req=sc.next();
		}

	}

}
