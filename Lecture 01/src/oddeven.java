import java.util.Scanner;

public class oddeven {
	public static void main(String []args){
		int i,x, even = 0, odd = 0;
		int[] number = new int[10];
		Scanner num = new Scanner(System.in);
		//get values from keyboard
		for(i = 0 ; i < 10 ; i++ ){
			System.out.print("Enter value for number " + (i + 1) + " : ");
			number[i] = num.nextInt();
		}
		//check even and odd numbers
		for(i = 0; i < 10; i++){
			x = number[i];
			if(x % 2 == 0) 
				even++;
			else 
				odd ++;	
		}

		System.out.println("Odd numbers : " + odd);
		System.out.println("Even number : " + even);
	}
}
