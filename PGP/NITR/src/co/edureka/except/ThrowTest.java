package co.edureka.except;

public class ThrowTest {

	public static void main(String[] args) {
		int x=10,y=0,z=0;		
		
		try {
			if(y==0) {
				//ArithmeticException aex = new ArithmeticException();
				ArithmeticException aex = new ArithmeticException("cannot divide a number by 0");
				throw aex;
			}
			z = x/y;
			System.out.println("Result = "+ z);
		}
		catch(Exception ex) {
			System.out.println("Message : "+ ex.getMessage());
			System.out.println(ex.toString());
		}
		System.out.println("-- DONE --");
	}

}
