abstract public class Shape 
{
	String color;
	//constructor
	Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	abstract void area();
}
