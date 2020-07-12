
public class IntegerTypeTest {
	
	public static void main(String[] args) {
		//byte b = 128; //Type mismatch: cannot convert from int to byte
		byte b = 28;
		System.out.println(b);
		
		//b = (byte)128; //typecasting
		b = (byte)300;
		System.out.println(b);
		
		long pop = 9845874876L;
		System.out.println("World Population = " + pop);		
		
		int n = (int)12L;
		System.out.println(n);
	}
}
