import java.util.Scanner;
class ReportCard 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{	
		System.out.print("enter student name: ");
		String name = sc.nextLine();

		System.out.print("enter no of subjects: ");
		int no = sc.nextInt();

		/*-- create an array to store marks*/
		int[] marks = new int[no];
		
		marksEntry(marks); //method call

		printRC(name, marks); // method call

	}//main
	
	/*--- method for marks entry */
	static void marksEntry(int[] marks)
	{
		for(int i=0;i<marks.length;i++){
			System.out.print("enter mark for Subject-"+(i+1)+": ");
			marks[i] = sc.nextInt();
		}
	} //marksEntry

	/*--- method for printing Report Card*/
	static void printRC(String name, int[] marks)
	{
		System.out.println("--------------------------------------");
		System.out.println("\tREPORT CARD");
        System.out.println("NAME: "+ name);
		System.out.println("--------------------------------------");
		System.out.println("  SUBJECT \t  MARKS");
		System.out.println("--------------------------------------");

		float total = 0;
		for(int i=0;i<marks.length;i++){
			System.out.println("Subject-"+(i+1)+"\t   "+marks[i]);
			total = total + marks[i];
		}
		System.out.println("--------------------------------------");
		float avg = total/marks.length;
		//System.out.println("TOTAL: "+(int)(total)+"\tAVERAGE: "+avg);
		System.out.printf("TOTAL: %d \t AVERAGE: %.2f \n",(int)total,avg);
		System.out.println("--------------------------------------");
	}//printRC

}
