class Except5
{
	public static void main(String[] args) 
	{
	   try{	
		 int x = Integer.parseInt(args[0]);
		 int y = Integer.parseInt(args[1]);

		 int res = x/y;
		 System.out.println("Result = "+res);
	   }
       catch(Exception ex){
		   System.out.println("Exception Occured!");
		   System.out.println("Message : "+ ex.getMessage());
		   System.out.println("toString() : "+ ex.toString()); //object type + message
		   ex.printStackTrace(); //toString()+ callstack
		   System.out.println("-----------------------------------");

		   if(ex instanceof NumberFormatException){
			   String msg = ex.getMessage();
			   int colon_index = msg.indexOf(":");
			   msg = msg.substring(colon_index+1);
			   System.out.println("Invalid Input : "+msg);
		   }
	   }

	   System.out.println("-- DONE --");
	}
}
