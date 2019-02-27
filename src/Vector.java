
public class Vector {

	private double x;
	private double y;
	private double z;

	public Vector(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	static Vector addition(Vector first, Vector second) {

		Vector third = new Vector();
		third.setX(first.getX() + second.getX());
		third.setY(first.getY() + second.getY());
		third.setZ(first.getZ() + second.getZ());

		return third;

	}

	static Vector scalarProduct(Vector first, Vector second) {

		Vector third = new Vector();
		third.setX(first.getX() * second.getX());
		third.setY(first.getY() * second.getY());
		third.setZ(first.getZ() * second.getZ());

		return third;

	}

	static Vector vectorProduct(Vector first, Vector second) {

		Vector vec = new Vector();
		vec.setX(first.getY() * second.getZ() - first.getZ() * second.getY());
		vec.setY(first.getZ() * second.getX() - first.getX() * second.getZ());
		vec.setZ(first.getX() * second.getY() - first.getY() * second.getX());

		return vec;
	}

	@Override
	public String toString() {
		return "Vector [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
