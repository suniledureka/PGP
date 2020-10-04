import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		
		int rem = n%2;
		if(rem == 0) {
			System.out.println(n+" is EVEN");
		}
		else {
			System.out.println(n+" is ODD");
		}
	}
}
