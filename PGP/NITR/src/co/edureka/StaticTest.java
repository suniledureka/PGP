package co.edureka;

public class StaticTest {
	static {
		System.out.println("Static Block - 2");
	}
	public static void main(String[] args) {
		System.out.println("MAIN METHOD");
	}
	static {
		System.out.println("Static Block - 1");
	}
}