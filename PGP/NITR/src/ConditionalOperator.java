
public class ConditionalOperator {

	public static void main(String[] args) {
		int x=100,y=20,lar;
		/*
		lar =(x>y)?x:y;
		*/
		if(x>y) {
			lar = x;
		}
		else {
			lar = y;
		}
		System.out.println("Largest = "+ lar);
	}
}
