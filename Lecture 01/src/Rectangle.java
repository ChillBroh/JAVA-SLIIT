import java.util.Scanner;

public class Rectangle{
	public static void main (String []args){
		Scanner rec = new Scanner(System.in);
		System.out.print("Enter height for the Rectangle : ");
		int h = rec.nextInt();
		System.out.print("Enter width for the Rectangle : ");
		int w =  rec.nextInt();
		int peri = 2 * (h + w);
		System.out.println("Perimeter of the Rectangle is " + peri);
	}
}