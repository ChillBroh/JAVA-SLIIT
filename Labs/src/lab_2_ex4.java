import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class lab_2_ex4 {
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader read = new BufferedReader(isr);
		
		//BufferedReader read = new BufferedReader(new InputStreamReader(System.in)); also can use this

		
		System.out.println("Enter len wid and h");
		int len = Integer.parseInt(read.readLine());
		int wid =  Integer.parseInt(read.readLine());
		int h =  Integer.parseInt(read.readLine());
		
		
		System.out.println("volume of the cube is " + len * wid * h);
		


	}
}

