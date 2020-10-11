class A2 {
	A2(int n){		
		System.out.println("A2 constructor");
	}
}

class B2 extends A2{
	B2(){
		super(10);
		System.out.println("B2 constructor");
	}
}


public class SuperConstructors {

	public static void main(String[] args) {
		B2 obj = new B2();
	}
}
