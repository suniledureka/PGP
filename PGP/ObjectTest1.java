class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Naveen";
		sal = 5000f;
	}
	void displayDetails(){
		System.out.println(empno+" | "+name+" | "+sal);
	}
}

/*---------------------ObjectTest1 class ---------------*/
class ObjectTest1
{
	public static void main(String[] args) 
	{
		//creating an instance of Employee
		Employee emp = new Employee();

		System.out.println(emp.empno+" | "+emp.name+" | "+emp.sal);

		//to change the state of object using reference
		emp.empno = 101;
		emp.name = "Sunil";
		emp.sal = 2500f;

		emp.displayDetails();
		
		//changing state of object using method
		emp.setDetails();
		emp.displayDetails();
	}
}
