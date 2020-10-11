/*
final class A{}
class B extends A{} //error: cannot inherit from final A
*/

class A{
	final void display(){}
}
class B extends A{
	void display(){} //display() in B cannot override display() in A - overridden method is final
}

class FinalTest 
{
	final int n = 10; //instance variable
	public static void main(String[] args) 
	{
		final int n = 20; //local variable
		System.out.println(n);
		//n = 25; //error: cannot assign a value to final variable n
		System.out.println(n);

		FinalTest obj = new FinalTest();
		System.out.println(obj.n);
		//obj.n = 20; //error: cannot assign a value to final variable n
		System.out.println(obj.n);
	}
}
