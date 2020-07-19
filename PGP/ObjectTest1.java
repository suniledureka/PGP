class Employee 
{
	int empno;
	String name;
	float sal;

	void setDetails(){
		name = "Praveen";
		sal = 5000.5f;
	}

	void displayDetails(){
		System.out.println(empno+ " | "+ name+" | "+sal);
	}
}//Employee

class ObjectTest1
{
	public static void main(String[] args) 
	{
		/*create an object of Employee*/
		Employee emp = new Employee();

		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		/*-- change the state of object using reference--*/
		emp.empno = 101;
		emp.name = "Sunil";
		emp.sal = 2500f;
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);
		
		emp.displayDetails();

		/*-- change the state of object using a method--*/
		emp.setDetails();
		emp.displayDetails();
	}
}
