
public class Naturals_3 
{
	/*method definition to display 10 Natural numbers*/
	static void printNaturals()
	{
		System.out.println("First 10 Natural Numbers are:");
		int n =1;
		while(n<11)
		{
 		  if(n==10)
 			  System.out.println(n);
 		  else
 			  System.out.print(n+", ");
 		  
		  n++;
		}		
	} //printNaturals
	
	public static void main(String[] args) 
	{
		printNaturals(); //method call
		printNaturals();
		printNaturals();
	}//main
	

}
