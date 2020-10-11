public class Account {
	long acno;
	String name;
	float bal;

	Account() {
	}

	public Account(long acno, String name, float bal) {
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}

	/*--method to deposit amount*/
	public void deposit(float amt) {
		this.bal = this.bal + amt;
		System.out.println("Rs." + amt + " Credited | Balance: " + this.bal);
	}

	/*--method to withdraw amount*/
	public void withdraw(float amt) {
		if (this.bal >= amt) {
			this.bal = this.bal - amt;
			System.out.println("Rs." + amt + " Debited | Balance: " + this.bal);
		} else {
			System.out.println("ERROR: Transaction Declined | Insufficient Balance");
		}
	}

	/*-- method to get account details*/
	public void getDetails() {
		System.out.println("A/C No: " + this.acno + " | NAME: " + this.name + " | BALANCE: " + this.bal);
	}
}
