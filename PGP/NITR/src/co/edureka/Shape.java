package co.edureka;

abstract public class Shape {
 String color;
 
 Shape(String color){
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
