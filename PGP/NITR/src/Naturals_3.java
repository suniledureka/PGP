
public class Naturals_3 {

	public static void main(String[] args) {		
		printNaturals();
		System.out.println("\n-----------------------");
		printNaturals();
	} //main
	
	static void printNaturals()
	{
		System.out.println("First 10 Natural Numbers are:");
		
		int n = 1;
		
		while(n < 11)
		{			
			System.out.print((n==10)?n:n+", ");			
			n = n+1;
		}
	}//printNaturals	 

}
