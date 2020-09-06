class ICICI implements Bank 
{
  public void deposit(float amt){
	  System.out.println("Rs."+amt+" credited @ ICICI");
  }
  public void withdraw(float amt){
	  System.out.println("Rs."+amt+" debited @ ICICI");
  }
}
