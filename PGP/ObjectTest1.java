class Employee 
{
	int empno;
	String name;
	float sal;

	void changeProperties(){
       empno = 102;
	   name = "Naveen";
	   sal = 5000.5f;
	}

	void displayProperties(){
       System.out.println(empno+" | "+name+" | "+sal);
	}

} //Employee

class ObjectTest1
{
	public static void main(String[] args) 
	{
		/*--- create an Employee type object ---*/
		Employee emp = new Employee();

		System.out.println(emp.empno+" | "+ emp.name+" | "+emp.sal);

		/*--- 1. to change the state of an object - using reference --*/
		emp.empno = 101;
		emp.name = "Sunil";
		emp.sal = 2500f;
		System.out.println(emp.empno+" | "+ emp.name+" | "+emp.sal);

		/*--- 2. to change the state of an object - using method ---*/
		emp.changeProperties();
		//System.out.println(emp.empno+" | "+ emp.name+" | "+emp.sal);

		emp.displayProperties();
	}
}
