package co.edureka.except;
class Bank
{
	void deposit(float amt) throws InterruptedException
	{
	  System.out.println("Deposit logic...");	
	}
}

public class ThrowsTest 
{
	public static void main(String[] args) throws InterruptedException
	{
		Bank sbi = new Bank();
		//try {
			sbi.deposit(2500f);
		//}
		//catch(Exception ex) {}
	}
}
