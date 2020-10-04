
public class Naturals3 
{
	public static void main(String[] args) 
	{		
		printNaturals(); //method call
	}
	
	/*---method definition to display first 10 natural numbers---*/
	static void printNaturals() {
		System.out.println("First 10 Natural Numbers are: ");
		for(int i=1;i<=10;i++) {
			if(i==10)
				System.out.println(i);
			else
				System.out.print(i+", ");
		}
	}	
}
