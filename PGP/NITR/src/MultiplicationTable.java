import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Which number's multiplication table? ");
		int n = sc.nextInt();		
		
		mTable(n); //method call
		System.out.println();

		sc.close();
	}//main
	
	/*method for printing multiplication table of a number*/	
	static void mTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			int p = n * i;
			System.out.println(n+" x "+i+" = "+p);
		}				
	}
}
