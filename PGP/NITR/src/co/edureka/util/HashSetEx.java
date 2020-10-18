package co.edureka.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetEx {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);		
		HashSet<String> courses = new HashSet<>();
		
		String req = "Y";
		while(req.equalsIgnoreCase("Y"))
		{
		  System.out.print("enter course name: ");
		  String cname = sc.nextLine();
		  boolean status = courses.add(cname);
		  if(!status)
			  System.out.println("\""+cname+"\" is in the list");
		  
		  System.out.print("more course to add [Y/N] : ");
		  req= sc.nextLine();
		}
		
		System.out.println("-----------------------------------");
		System.out.println("Available Courses @ Edureka:");
		Iterator<String> it = courses.iterator();
		int sno =1;
		while(it.hasNext()) {
			System.out.println(sno++ +". "+it.next());			
		}
		
		sc.close();
	}
}
