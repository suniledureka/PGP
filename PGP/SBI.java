class SBI implements Bank
{
  public void deposit(float amt){
	  System.out.println("Depositing Rs. "+amt+" @ SBI");
  }
  public void withdraw(float amt){
	  System.out.println("Debiting Rs. "+amt+" @ SBI");
  }
}
