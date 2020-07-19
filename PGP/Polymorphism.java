class A{
	void display(){
		System.out.println("Inside class A");
	}
}

class B extends A{
	@Override
	void display(){
		System.out.println("Inside class B");
	}
}

class Polymorphism 
{
	public static void main(String[] args) 
	{		
		//A obj = new A();
		//B obj = new B();
		A obj = new B();
		obj.display();
		System.out.println(obj);

		System.out.println(obj instanceof B);
		System.out.println(obj instanceof A);
		System.out.println(obj instanceof java.lang.Object);
	}
}
