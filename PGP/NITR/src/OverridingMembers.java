class A1{
  int a=10, b=20;
  void display() {
	  System.out.println("In class A: "+a+" | "+b);	  
  }
}

class B1 extends A1{
  int a=11, b=22;
  
  @Override //annotation
  void display() {
	  System.out.println("In class B: "+super.a+" | "+super.b+" | "+a+" | "+this.b);
	  super.display();
  }
}

public class OverridingMembers {
	public static void main(String[] args) {
		B1 obj = new B1();
		System.out.println(obj.a+" | "+obj.b);
		obj.display();
	}
}
