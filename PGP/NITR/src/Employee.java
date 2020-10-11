public class Employee 
{
	int empno;
	String name;
	float sal;

	public Employee(int empno, String name, float sal) {
		this.empno = empno;
		this.name = name;
		this.sal = sal;
	}

	@Override //annotation
	public String toString() {
		return "Employee [" + empno + " | " + name + " | " + sal + "]";
	}

	public static void main(String[] args) {
		Employee emp = new Employee(101, "Chris", 2500f);
		System.out.println(emp); // toString()
	}
}
