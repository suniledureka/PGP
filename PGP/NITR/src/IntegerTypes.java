
public class IntegerTypes {

	public static void main(String[] args) {
		byte b = 127;
		System.out.println(b);
		
		//b = 128;//Type mismatch: cannot convert from int to byte
		System.out.println(b);
		
		long pop = 8585748235L;
		System.out.println("World Population = " + pop);	
		
		int n = (int)12L; //typecasting
		System.out.println(n);
	}

}
