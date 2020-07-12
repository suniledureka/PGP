
public class Naturals_2 {

	public static void main(String[] args) {
		System.out.println("First 10 Natural Numbers are:");
		
		int n = 1;
		
		while(n < 11)
		{			
			if(n == 10) {
				System.out.println(n);
			}
			else {
				System.out.print(n+", ");
			}
			
			//System.out.print((n==10)?n:n+", ");
			
			n = n+1;
		}
	}
}
