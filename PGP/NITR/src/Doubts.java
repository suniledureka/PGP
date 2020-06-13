import java.util.Arrays;
import java.util.Scanner;

public class Doubts {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter how many subjects:");
		int no = sc.nextInt();
		
		String[] subjects = new String[no];
		int[] marks = new int[no];
		
		/*subject names entry*/
		for(int i=0;i<no;i++) {
			System.out.print("Subject Name-"+(i+1)+": ");
			subjects[i] = sc.next();
		}
		
		//System.out.println(Arrays.toString(subjects));
		/*marks entry*/
		for(int i=0;i<no;i++) {
			System.out.print("Mark for "+subjects[i]+": ");
			marks[i] = sc.nextInt();
		}		
		
		for(int i=0;i<no;i++) {
			System.out.println(subjects[i]+" = "+marks[i]);			
		}		
		sc.close();
		
		
		int n=4;
		System.out.println((++n));
	}

}
