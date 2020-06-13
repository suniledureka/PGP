class Employee 
{
	int empno;
	String name;
	float sal;

	Employee(){
	   System.out.println("*****");	
       empno = 102;
	   name = "Naveen";
	   sal = 5000.5f;
	}


	void displayProperties(){
       System.out.println(empno+" | "+name+" | "+sal);
	}

}
public class ConstructorTest
{
	  public static void main(String[] args){
	   
	       Employee emp1 = new Employee();
	       Employee emp2 = new Employee();
	       Employee emp3 = new Employee();

	       emp1.displayProperties();
	       emp2.displayProperties();
	       emp3.displayProperties();
	  }
	}