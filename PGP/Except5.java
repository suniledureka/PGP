class Except5 
{
	public static void main(String[] args) 
	{
		try{
			int no1 = Integer.parseInt(args[0]);
			int no2 = Integer.parseInt(args[1]);

			int res = no1/no2;

			System.out.println(no1+" / "+no2+" = " + res);
		}
		catch(ArithmeticException ex){
			System.out.println("Cannot divide a number by zero!");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please provide min 2 cmd args");
		}
		catch(NumberFormatException ex){
			System.out.println("Please provide numbers as cmd args");
		}
		System.out.println("--- DONE ---");
	}
}
