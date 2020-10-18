package co.edureka.except;

public class Except2 {

	public static void main(String[] args) 
	{
		String n1 = "625";
		System.out.println(n1+25); //62525
		
		int n2 = Integer.parseInt(n1);
		System.out.println(n2+25); //650
		
		n1 = "A";
		n2 = Integer.parseInt(n1); //java.lang.NumberFormatException
	}
}
