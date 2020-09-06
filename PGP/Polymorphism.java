class A{
	void display(){
		System.out.println("In class A");
	}
}

class B extends A{
	void display(){
		System.out.println("In class B");
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
	}
}
