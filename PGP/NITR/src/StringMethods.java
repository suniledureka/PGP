
public class StringMethods {

	public static void main(String[] args) 
	{
		String str = "edureka";
		System.out.println("Size = "+ str.length());
		
		System.out.println("Character @ index 0 = "+ str.charAt(0));
		System.out.println("Index of \"e\" = "+ str.indexOf("e"));
		System.out.println("Last Index of \"e\" = "+ str.lastIndexOf("e"));
		System.out.println(str.replace('e','*'));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str);
		
		str = "edureka limited bangalore karnataka India";
		String[] words = str.split(" ");
		System.out.println("No of words = "+ words.length);
		for(String word : words) {
			System.out.println(word);
		}
	}
}
