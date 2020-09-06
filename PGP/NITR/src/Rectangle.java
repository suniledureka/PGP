public class Rectangle extends Shape 
{
	float length, breadth;
	
	public Rectangle(String color, float length, float breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	void area() {
		System.out.println("Area of Rectangle = "+ (this.length * this.breadth));
	}
}