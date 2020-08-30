
public class Employee {
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Naveen";
		sal = 5000;
	}

	void getDetails(){
		System.out.println(empno+" | "+name+" | "+sal);
	}

	public static void main(String[] args) 
	{
		/*create an Employee object*/
		Employee emp = new Employee();
		
		/*access the state of object*/
		System.out.println(emp.empno+" | "+emp.name+" | "+emp.sal);

		//changing the state of object using reference
		emp.empno = 101;
		emp.name = "Sunil";
		emp.sal = 2500.5f;
		System.out.println(emp.empno+" | "+emp.name+" | "+emp.sal);
		emp.getDetails();
		
		//changing the state of object using method
		emp.setDetails();
		emp.getDetails();
	}


}
