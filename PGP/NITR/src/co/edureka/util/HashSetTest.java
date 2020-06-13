package co.edureka.util;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> courses = new HashSet<>();
		/*
		System.out.println(courses.add("Java"));
		System.out.println(courses.add("Java"));
		*/
		
		String req="Y";
		while(req.equalsIgnoreCase("Y"))
		{
			System.out.print("enter course name: ");
			String cname = sc.next();
			boolean status = courses.add(cname);
			if(!status) {
				System.out.println(cname+" is already in list");
			}
			System.out.print("want to add more courses Y/N]: ");
			req = sc.next();
		}
		System.out.println(courses+" |Size = "+courses.size());
		sc.close();
	}
}
