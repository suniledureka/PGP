import java.util.Scanner;
class BankTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Bank b = null;
		System.out.print("Which Bank? [1. SBI , 2.ICICI]: ");
		int opt = sc.nextInt();

		if(opt==1){
			b = new SBI();
		}
		else if(opt==2){
			b = new ICICI();
		}
		else{
			System.out.println("Invalid Option..");
			return;
		}

		b.deposit(2500f);
	}
}
