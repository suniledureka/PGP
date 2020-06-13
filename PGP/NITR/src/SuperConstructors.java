class AA{
	AA(int n){
		System.out.println("class AA constructor");
	}
}

class BB extends AA{
	BB(){
		//super();
		super(10);
		System.out.println("class BB constructor");
	}
}

public class SuperConstructors {

	public static void main(String[] args) {
		BB obj = new BB();
	}
}
