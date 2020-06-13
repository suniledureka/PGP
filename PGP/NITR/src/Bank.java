import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Account acc = null;
		Scanner sc = new Scanner(System.in);
		while (true) // infinite loop
		{
			System.out.println("1. Create A/C");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance");
			System.out.println("5. Exit");

			System.out.print("enter an option: ");
			int opt = sc.nextInt();

			switch (opt) {
			case 1:
				if (acc == null) {
					System.out.print("enter a/c number: ");
					long acno = sc.nextLong();
					sc.nextLine();
					System.out.print("enter name: ");
					String name = sc.nextLine();
					System.out.print("enter initial deposit: ");
					float amt = sc.nextFloat();
					/*-- create account object--*/
					acc = new Account(acno, name, amt);
					System.out.println("-- A/C CREATED");
				} else {
					System.out.println("-- FYI: A/C is already created --");
				}
				break;
			case 2:
				if (acc != null) {
					System.out.print("enter amount to deposit: ");
					float amt = sc.nextFloat();
					acc.deposit(amt);
				} else {
					System.out.println("FYI : Create A/C first!");
				}
				break;
			case 3:
				if (acc != null) {
					System.out.print("enter amount to withdraw: ");
					float amt = sc.nextFloat();
					acc.withdraw(amt);
				} else {
					System.out.println("FYI : Create A/C first!");
				}
				break;
			case 4:
				 if(acc != null) {
					 acc.getBalance();;
				 }
				 else {
					 System.out.println("FYI : Create A/C first!");
				 }				
				break;
			case 5:
				System.out.println("--- BYE BYE ---");
				System.exit(0); //to terminate the application execution
				break;
			default:
				System.out.println("-- Invalid Option... Try Again --");
				break;
			}// switch
			System.out.println("==================================");
		} // while
	}

}
