import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Which number's multiplication table: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			int p = n * i;
			System.out.println(n+" x "+i+" = "+p);
		}//for
	}
}
