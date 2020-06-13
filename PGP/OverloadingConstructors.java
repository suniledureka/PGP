class Employee 
{
	int empno;
	String name;
	float sal;

	Employee(){}

	Employee(int empno, String name){
		this.empno = empno;
		this.name = name;
	}

	Employee(int a, String b, float c){
		this(a,b); //constructor chaining
		/*
		empno = a;
		name = b;
		*/
		sal = c;
	}
	void displayProperties(){
       System.out.println(this.empno+" | "+this.name+" | "+this.sal);
	}

}
public class OverloadingConstructors
{
	  public static void main(String[] args){
	   
	       Employee emp1 = new Employee();
	       Employee emp2 = new Employee(101,"Sunil");
	       Employee emp3 = new Employee(102,"Naveen",4500f);

	       emp1.displayProperties();
	       emp2.displayProperties();
	       emp3.displayProperties();
	  }
	}