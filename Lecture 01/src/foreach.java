import java.util.Arrays;
import java.util.Scanner;

public class foreach {
	public static void main(String[] args)
	{
		int i; 
		
		System.out.print("Number:");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		System.out.println(count);
		
		int[] arr = new int[5]; 
		for(i = 0; i < 5; i++) {
			System.out.println("Enter values : ");
			arr[i] = scan.nextInt();
		}
		
		for(int x : arr) {
			System.out.println(x);
		}
		System.out.print(Arrays.toString(arr));
	}
}
