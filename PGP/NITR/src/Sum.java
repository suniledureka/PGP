import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first no: ");
		int x = sc.nextInt();
		
		System.out.print("enter second no: ");
		int y = sc.nextInt();
		
		int s = x+y;
		
		System.out.println("Sum = " + s);
		System.out.println(x+" + "+y+" = "+s);
		
		sc.close();
	}
}
