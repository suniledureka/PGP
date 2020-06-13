
public class StringCreations {

	public static void main(String[] args) {
		String s1 = "edureka";
		String s2 = "edureka";
		System.out.println(s1 == s2);
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		System.out.println(s3 == s4);
		System.out.println(s3.contentEquals(s4));
		System.out.println(s3.equals(s4));
		s1.concat(" Blr");
		System.out.println(s1);
		System.out.println("---------------------");
		
		String s5 = new String("Java");
		String s6 = new String("java");
		System.out.println(s5.equals(s6));
		System.out.println(s5.contentEquals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
	}
}
