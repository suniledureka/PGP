import java.util.Scanner;

public class Doubts2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		
		System.out.print("Sum of digits of "+ n +" = ");
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			sum += rem;
			n = n/10;
		}
		System.out.println(sum);
		sc.close();
	}
}
