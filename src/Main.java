
public class Main {

	public static void main(String[] args) {

		Vector v1 = new Vector(5, 4, 3);
		Vector v2 = new Vector(3, 2, 1);
		Vector v3 = Vector.addition(v1, v2);
		Vector v4 = Vector.scalarProduct(v1, v2);
		Vector v5 = Vector.vectorProduct(v1, v2);
		
		System.out.println(v3.toString());
		System.out.println(v4.toString());
		System.out.println(v5.toString());
		
	}

}
