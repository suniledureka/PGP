import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		Account acc = null;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Create Account");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Balance");
			System.out.println("5.Exit");

			System.out.print("enter an option: ");
			int opt = sc.nextInt();

			switch (opt) {
			case 1:
				if (acc == null) {
					System.out.print("enter account no: ");
					long acno = sc.nextLong();
					sc.nextLine();

					System.out.print("enter name: ");
					String name = sc.nextLine();

					System.out.print("enter initial deposit: ");
					float amt = sc.nextFloat();

					// create account object
					acc = new Account(acno, name, amt);
					System.out.println("ACCOUNT OPENED");
				} else {
					System.out.println("Account is already created!");
				}
				break;
			case 2:
				if (acc != null) {
					System.out.print("enter amount to deposit: ");
					float amt = sc.nextFloat();
					acc.deposit(amt);
				} else {
					System.out.println("CREATE ACCOUNT FIRST!");
				}
				break;
			case 3:
				if (acc != null) {
					System.out.print("enter amount to withdraw: ");
					float amt = sc.nextFloat();
					acc.withdraw(amt);
				} else {
					System.out.println("CREATE ACCOUNT FIRST!");
				}
				break;
			case 4:
				if(acc != null) {
					acc.getDetails();
				}
				else {
					System.out.println("CREATE ACCOUNT FIRST!");
				}				
				break;
			case 5:
				System.out.println("** BYE BYE **");
				System.exit(0); // to terminate application
				break;
			default:
				System.out.println("Invalid Option... Try Again!!");
				break;
			}// switch
			System.out.println("===================================");
		} // while
	}
}
