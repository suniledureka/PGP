
public class ArithmeticOperators {

	public static void main(String[] args) {
		System.out.println(10/3); //3
		System.out.println((10.0f/3)); //3.3333...
		System.out.println(10.0/3.0); //3.3333333333....
		
		System.out.println(10%3); //1
		System.out.println(-10%3); //-1
		System.out.println(10%-3); //1
		System.out.println(-10%-3); //-1
		
		//System.out.println(10/0); //java.lang.ArithmeticException
		System.out.println(10.0/0); //Infinity
		System.out.println(-10.0f/0); //Infinity
		System.out.println(0/10); //0
		System.out.println(0.0f/0); //NaN
	}
}
