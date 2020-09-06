class SBI implements Bank 
{
  public void deposit(float amt){
	  System.out.println("Rs."+amt+" credited @ SBI");
  }
  public void withdraw(float amt){
	  System.out.println("Rs."+amt+" debited @ SBI");
  }
}
