package co.edureka.except;
class Edureka{
 public void getDetails() throws InterruptedException {
	 System.out.println("logic to get the details");
 }
}

public class ThrowsTest {
	public static void main(String[] args) throws Exception{		
		Edureka edu = new Edureka();
		/*
		try {
			edu.getDetails();
		}catch(Exception ex) {}
		*/
		edu.getDetails();
	}
}
