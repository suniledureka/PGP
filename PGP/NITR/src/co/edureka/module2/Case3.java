package co.edureka.module2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Subordinate{
	String name;
	int age;
	Subordinate(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Manager{
	String name;
	ArrayList<Subordinate> subs = new ArrayList<>();
	
	Manager(String name){
		this.name = name;
	}
}

public class Case3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the no of Managers: ");
		int m = sc.nextInt();
		System.out.print("enter the no of Subordinates: ");
		int s = sc.nextInt();
		
		Manager[] managers = new Manager[m];
		for(int i=0;i<managers.length;i++) {
			System.out.print("enter name of manager-"+(i+1)+": ");
			String name = sc.next();
			Manager mgr = new Manager(name);
			managers[i] = mgr;
		}
		System.out.println("-------------------------");
		Subordinate[] subordinates = new Subordinate[s];
		for(int i=0;i<subordinates.length;i++) {
			System.out.println("enter Manager Name, Name & age");
			String mname = sc.next();
			String sname = sc.next();
			int age = sc.nextInt();
			Subordinate subo = new Subordinate(sname,age);
			subordinates[i] = subo;
			
			for(int j=0;j<managers.length;j++) {
				if(managers[j].name.equalsIgnoreCase(mname)) {
					managers[j].subs.add(subo);
				}
			}
		}
		
		
		for(int i=0;i<managers.length;i++) {
			System.out.println("-------------------------");
			System.out.println("Manager Name : "+ managers[i].name);
			List<Subordinate> subos = managers[i].subs;
			for(int j=0;j<subos.size();j++) {
				System.out.println("Subordinate-"+(j+1)+": "+subos.get(j).name+" | "+subos.get(j).age);
			}
			
		}
		sc.close();
	}
}


