package co.edureka;

public class ShapeTest {

	public static void main(String[] args) {
		Shape s = null;
		//s = new Shape(); //an Abstract class cannot be instantiated
		
		s = new Circle("Red",2.5f);
		s.area();
		System.out.println();
		
		s = new Rectangle("Blue",12,6);
		s.area();
		System.out.println();
		
		System.out.println("Color = "+ s.getColor());
		s.setColor("Yellow");
		System.out.println("New Color = "+ s.getColor());
	}

}
