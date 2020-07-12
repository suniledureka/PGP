
public class Naturals_4 {

	public static void main(String[] args) {		
		printNaturals(20); //method call
		System.out.println("-----------------------------------------");
		printNaturals(15);
	} //main
	
	//method definition
	static void printNaturals(int num)
	{
		System.out.println("First "+num+" Natural Numbers are:");
		
		int n = 1;
		
		while(n <= num)
		{			
			if(n == num)
				System.out.println(n);
			else
				System.out.print(n+", ");
			
			n = n+1;
		}
	}//printNaturals	 

}
