class Except6 
{
	public static void main(String[] args) 
	{
		try{
			int no1 = Integer.parseInt(args[0]);
			int no2 = Integer.parseInt(args[1]);

			int res = no1/no2;

			System.out.println(no1+" / "+no2+" = " + res);
		}
		catch(Exception ex){
			System.out.println("Exception Occured!");
			System.out.println("Message: "+ ex.getMessage());
			System.out.println("toString() = "+ ex.toString()); //object type with message
			ex.printStackTrace(); //toString() + call stack- class name,method name, program name , line no
		}
		System.out.println("--- DONE ---");
	}
}
