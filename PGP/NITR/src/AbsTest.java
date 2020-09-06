
public class AbsTest {

	public static void main(String[] args) {
		Shape sh = null;
		//sh = new Shape(); //cannot be instantiated
		sh = new Rectangle("Blue",4,5);
		System.out.println("Color = "+ sh.getColor());
		sh.setColor("Red");
		System.out.println("Updated Color = "+ sh.getColor());
		sh.area();
		System.out.println("-------------------------");
		
		sh = new Circle("Yellow",5.6f);
		sh.area();
	}

}
