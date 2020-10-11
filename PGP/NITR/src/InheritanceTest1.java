class A{
	int a=10,b=20;
	void displayAB() {
		System.out.println("In class A: "+a+" | "+b);
	}
}

class B extends A{
	int c=30,d=40;
	void displayCD() {
		System.out.println("In class B: "+a+" | "+b+" | "+c+" | "+d);
	}
}


public class InheritanceTest1 {
	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.a+" | "+obj.b+" | "+obj.c+" | "+obj.d);
		obj.displayCD();
		obj.displayAB();
	}
}
