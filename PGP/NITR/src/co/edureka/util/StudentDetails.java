package co.edureka.util;

import java.util.TreeSet;

class Student implements Comparable<Student>{
  int sid;
  String name;
  
  Student(int sid, String name){
	  this.sid = sid;
	  this.name = name;  
  }
  
  @Override
	public String toString() {	
		return "Student["+this.sid+" | "+this.name+"]";
	}

@Override
public int compareTo(Student o) {
	if(this.sid>o.sid)
	 return -1;
	else if(this.sid<o.sid)
     return 1;
	else
	 return 0;
}
}


public class StudentDetails {
	public static void main(String[] args) {
		//ArrayList<Student> students = new ArrayList<>();
		
		TreeSet<Student> students = new TreeSet<>();
		
		Student st1 = new Student(101,"Sunil Joseph");
		Student st2 = new Student(102,"Sanjay");
		Student st3 = new Student(103,"Anirudh");
		
		students.add(st1);
		students.add(st2);
		students.add(st3);
		
		System.out.println(students);
	}
}
