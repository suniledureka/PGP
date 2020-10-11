
public class Circle extends Shape {
	float radius;
	
	public Circle(String color, float radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public void area() {		
		System.out.println("Area of Circle = "+(Math.PI * Math.pow(radius, 2)));
	}
}
