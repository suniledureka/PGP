class Product {
	long prod_id;
	String prod_name;
	float prod_price;
	
	
	public Product(long prod_id, String prod_name, float prod_price) {
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
	}
	
	@Override
	public String toString() {
		//System.out.println(super.toString());
		return "Product [" + prod_id + " | " + prod_name + " | " + prod_price + "]";
	}

}

public class ProductTest {
	public static void main(String[] args) {
		Product prod = new Product(100234, "Mobile", 35000f);
		System.out.println(prod); // toString()
	}

}
