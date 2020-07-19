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

	void displayDetails(){
		System.out.println(empno+ " | "+ name+" | "+sal);
	}
} //Employee

class OverloadingConstructors 
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
        Employee emp2 = new Employee(101,"Sunil");
        Employee emp3 = new Employee(102,"Naveen",2500f);

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
	}
}
