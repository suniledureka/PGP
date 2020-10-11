import java.util.Scanner;
import java.util.Arrays;
class ReportCard 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
	  System.out.print("enter student name: ");
	  String name = sc.nextLine();

      System.out.print("enter no of subjects: ");
	  int no = sc.nextInt();

	  /*--creating an int array to store marks*/
	  int[] marks = new int[no];

	  //method call for marks entry
	  marksEntry(marks);
	  //System.out.println(Arrays.toString(marks));

	  //method call for generating report card
	  printRC(name,no,marks);
	}

	//method for marks entry
	static void marksEntry(int[] marks)
	{
		for(int i=0;i<marks.length;i++)
		{
		  System.out.print("mark for subject-"+(i+1)+": ");
		  marks[i] = sc.nextInt();
		}
	}

	//method to print report card
	static void printRC(String name, int noOfSub, int[] marks)
	{
		System.out.println("----------------------------------");
		System.out.println("\tREPORT CARD");
		System.out.println("NAME: "+ name);

		System.out.println("----------------------------------");
		System.out.println("SUBJECT\t\tMARK");
		System.out.println("----------------------------------");

		int total = 0;
		for(int i=0;i<noOfSub;i++)
		{
          System.out.println("Subject-"+(i+1)+"\t "+marks[i]);
		  total += marks[i];
		}
		System.out.println("----------------------------------");
		float avg = ((float)total)/noOfSub;

		//System.out.println("TOTAL: "+total+"\t AVERAGE: "+avg);
		System.out.printf("TOTAL: %d\t AVERAGE: %.2f \n",total,avg);
		System.out.println("----------------------------------");
	}
}
