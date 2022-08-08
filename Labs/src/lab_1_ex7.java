import java.util.Scanner;

public class lab_1_ex7 {
	 public static void main(String[] args) {
		int n1,n2, sum;
		double average;
		
		Scanner obj = new Scanner(System.in);
		n1 = obj.nextInt();
		n2 = obj.nextInt();
		
		sum = n1 + n2;
		average = sum / 2.0;
		
		System.out.println("Sum is : "+ sum);
		System.out.println("Average is : " + average);
		
		
	}
}
