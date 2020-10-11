
public class ShapeTest {

	public static void main(String[] args) {
		Shape shape=null;
		//shape = new Shape(); //Cannot instantiate the type Shape
		
		shape = new Rectangle("Blue",5,6);
		System.out.println("Color = "+ shape.getColor());
		shape.setColor("Red");
		System.out.println("Changed Color = "+ shape.getColor());
		shape.area(); //calls area() of Rectangle
		System.out.println("------------------------------------");
		
		shape = new Circle("Yellow",12.6f);
		if(shape instanceof Circle) {
			System.out.println("AREA OF CIRCLE:");
			shape.area(); //calls area() of Circle
		}
	}

}
