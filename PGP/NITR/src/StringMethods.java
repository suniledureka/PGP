
public class StringMethods {

	public static void main(String[] args) {
		String str = "edureka";
		System.out.println("Size = "+ str.length());
		
		System.out.println("character @ index 0 = "+ str.charAt(0));
		System.out.println("index of e = "+ str.indexOf("e"));
		System.out.println("last index of e = "+ str.lastIndexOf("e"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.replace('e', '*'));
	}
}
