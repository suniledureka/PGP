
public class JaggedArrays {

	public static void main(String[] args) {
		int[][] n = new int[4][];
		
		n[0] = new int[10];
		n[1] = new int[3];
		n[2] = new int[7];
		n[3] = new int[4];
		
		System.out.println("Size of Array = "+ n.length);
		
		for(int i=0;i<n.length;i++) {
			System.out.println("Size of n["+i+"] = "+ n[i].length);
		}
		
	}

}
