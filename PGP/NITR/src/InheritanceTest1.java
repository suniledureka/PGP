class A{
	int a=10, b=20;
	void displayAB() {
		System.out.println("In class A : "+a+" | "+b);
	}
}

class B extends A{
	int c=30,d=40;
	void displayC() {
		System.out.println("In class B : "+ a+" | "+b+" | "+c+" | "+d);
	}
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		B obj = new B();
		obj.displayAB();	
		obj.displayC();
	}

}
