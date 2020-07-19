package co.edureka.except;

public class Except2 {

	public static void main(String[] args) {
		String data = "625";
		System.out.println(data+25); //62525
		
		int n = Integer.parseInt(data);
		System.out.println(n); //625
		System.out.println(n+25); //650
		
		data = "A";
		n = Integer.parseInt(data); //java.lang.NumberFormatException
		System.out.println(n);
	}
}
