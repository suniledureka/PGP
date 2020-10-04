
public class FloatTest {

	public static void main(String[] args) {
		//float sal = 2500.5; //Type mismatch: cannot convert from double to float
		//float sal = 2500.5f;
		//float sal = 2500.5F;
		float sal = (float)2500.5;
		System.out.println("Salary = " + sal);
		
		double d = 2500.5;
		System.out.println(d);
		
		System.out.println(Integer.toHexString(65));
	}

}
