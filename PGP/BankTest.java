import java.util.Scanner;
class BankTest 
{
	public static void main(String[] args) 
	{
		Bank bank = null;
		Scanner sc = new Scanner(System.in);

		System.out.print("Which Bank: [1.SBI/ 2.ICICI]: ");
		int opt = sc.nextInt();

		if(opt == 1)
			bank = new SBI();
		else if(opt == 2)
			bank = new ICICI();
		else{
			System.out.println("Invalid Option");
			System.exit(0);
		}

		bank.deposit(2500);
		bank.withdraw(1000);
	}
}
