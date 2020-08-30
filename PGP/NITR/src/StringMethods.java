
public class StringMethods {

	public static void main(String[] args) throws Exception {
		String str = "edureka";
		System.out.println("Size = "+ str.length());
		System.out.println("Character @ index 0 = "+ str.charAt(0));
		System.out.println("Index of \"e\" = "+ str.indexOf("e"));
		System.out.println("Index of \"dur\" = "+ str.indexOf("dur"));
		System.out.println("Index of \"xa\" = "+ str.indexOf("xa"));//-1
		System.out.println("Last Index of \"e\" = "+ str.lastIndexOf("e"));
		System.out.println(str.replace('e','*'));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+"   ");
			Thread.sleep(2000);
		}
	}
}
