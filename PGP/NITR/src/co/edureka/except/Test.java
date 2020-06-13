package co.edureka.except;

public class Test {

	public static void main(String[] args) {
		System.out.println("No of cmd args = "+ args.length);
		String s = "625";
		System.out.println(s+25); //62525
		
		int n = Integer.parseInt(s);
		System.out.println(n+25); //650
		
		//s="A";
		//n = Integer.parseInt(s);
	}
}
