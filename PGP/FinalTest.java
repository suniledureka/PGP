final class A{
	final void display(){}
}

class B extends A{
	void display(){}
}

class FinalTest 
{
	//final FinalTest(){} //error: modifier final not allowed here

	final int n = 20; // instance variable
	public static void main(String[] args) 
	{
		final int n = 10; //local variable
		System.out.println(n);
		// n = 11; //error: cannot assign a value to final variable n
		System.out.println(n);

		FinalTest obj = new FinalTest();
		System.out.println(obj.n);
		//obj.n = 25; // error: cannot assign a value to final variable n
		System.out.println(obj.n);
	}
}
