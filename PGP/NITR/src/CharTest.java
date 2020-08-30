
public class CharTest {

	public static void main(String[] args) {
		char c = 'A';
		System.out.println(c);
		
		c = 65;
		System.out.println(c);
		System.out.println(Integer.toHexString(65));
		
		c = '\u0041';
		System.out.println(c);
		
		c = '\u0905';
		System.out.println(c);
		
		c = '\u0c05';
		System.out.println(c);
		
		c = '\u4eca';
		System.out.println(c);
	}
}
