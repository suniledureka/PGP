package co.edureka;

public class Rectangle extends Shape {
	int length, breadth;
	
	public Rectangle(String color, int length, int breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	void area() {
		System.out.println("Area of Rectangle = "+ (this.length* this.breadth));
	}
}
