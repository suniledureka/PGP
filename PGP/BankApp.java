import java.util.Scanner;

class BankApp 
{
	public static void main(String[] args) 
	{
		Bank bank = null;
		Scanner sc = new Scanner(System.in);

		System.out.print("Operation with which Bank [1.SBI | 2. ICICI]: ");
		int opt = sc.nextInt();

		if(opt == 1)
			bank = new SBI();
		else if(opt == 2)
			bank = new ICICI();
		else{
			System.out.println("Invalid Option Selected...");
			System.exit(0);//to terminate the application
		}

		bank.deposit(2500);
		bank.withdraw(1000);
		
		System.out.println(bank.n);
		System.out.println(Bank.n);
		System.out.println(SBI.n);
		System.out.println(ICICI.n);

		//bank.n=12; //error: cannot assign a value to final variable n
		System.out.println(bank);
	}
}
