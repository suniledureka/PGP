package co.edureka.except;
class Sunil{
	void logic() throws InterruptedException{
		System.out.println("business logic");
	}
}

public class ThrowsTest {
	public static void main(String[] args) throws Exception {
		Sunil obj = new Sunil();
		//try {
			obj.logic();
		//}catch(Exception ex) {}
	}
}
