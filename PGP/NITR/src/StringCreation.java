
public class StringCreation {

	public static void main(String[] args) {
		String s1 = "edureka";
		String s2 = "edureka";
		System.out.println(s1==s2); //true
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		System.out.println(s3==s4); //false
		
		System.out.println(s3.equals(s4)); //true
		System.out.println(s3.contentEquals(s4)); //true
		System.out.println(s3.equalsIgnoreCase(s4)); //true
		
		s1.concat("blr");
		System.out.println(s1);
		
		String s5=s1.concat("blr");
		System.out.println(s5);
	}
}
