
class Point3D{
	private int x1,x2,x3;
	
	public Point3D(int x,int y,int z) {
		this.x1 = x;
		this.x2 = y;
		this.x3 = x;
	}
	public double distance() {
		double distance = (double)Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2) + Math.pow(x3, 2));
		return distance;
	}
}
public class Tute_2_EX2 {
	public static void main(String[] args) {
		Point3D p1 = new Point3D(4, 2, 4);
		System.out.println("The distant is : "+ p1.distance());
	}
}

