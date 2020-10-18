import java.util.Scanner;
class BankTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Which Bank [1.SBI|2.ICICI]: ");
		int opt = sc.nextInt();

		Bank bank = null;

		if(opt == 1)
			bank = new SBI();
		else if(opt == 2)
			bank = new ICICI();
		else{
			System.out.println("Invalid Bank...");
			System.exit(0);
		}

		bank.deposit(2500f);
		bank.withdraw(2500f);
		System.out.println();
				
		System.out.println(bank.n);
		System.out.println(Bank.n);
		System.out.println(SBI.n);
		System.out.println(ICICI.n);

		Bank.n = 10; //error: cannot assign a value to final variable n
	}
}
