public class Account 
{
 long acno;
 String name;
 float bal;
 
 /*constructor*/
 Account(long acno, String name, float bal){
	 this.acno = acno;
	 this.name = name;
	 this.bal = bal;
 }
 
 void deposit(float amt) {
	 this.bal = this.bal + amt;
	 System.out.println("Rs. "+amt+" Credited | Balance: "+this.bal);
 }
 
 void withdraw(float amt) {
	 if(this.bal >= amt) {
		 this.bal = this.bal - amt;
		 System.out.println("Rs. "+amt+" Debited | Balance: "+ this.bal);
	 }
	 else {
		 System.out.println("ERROR: Insufficient Balance!");
	 }
 }
 
 void getDetails() {
	 System.out.println("A/C No: "+this.acno+" | NAME: "+this.name+" | BALANCE: "+this.bal);
 }
}
