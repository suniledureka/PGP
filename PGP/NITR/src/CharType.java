
public class CharType {

	public static void main(String[] args) {
		char c = 'A';
		System.out.println(c);
		
		c = 65;
		System.out.println(c);
		
		System.out.println("Hexadecimal Value of 65 = "+ Integer.toHexString(65));
		
		c = '\u0041'; //unicode
		System.out.println(c);	
		
		c = '\u0905';
		System.out.println(c);
		
		c = '\u4eca';
		System.out.println(c);
		System.out.println(Integer.toBinaryString(100));
	}
}
