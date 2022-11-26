import java.util.Scanner;

public class lab_2_ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter len wid and h");
		int len = scan.nextInt();
		int wid =  scan.nextInt();
		int h =  scan.nextInt();
		
		
		System.out.println("volume of the cube is " + len * wid * h);
	}
}
