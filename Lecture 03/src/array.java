import java.util.Arrays;

public class array {
	public static void main(String[] args) {
		int[] Array = {10,20,30,40,50};
		System.out.println(Arrays.toString(Array));
		
		int[][] arr = {{10,20,30},{10,20,30}};
		System.out.println(Arrays.deepToString(arr));
		
		//way of implementing arrays
		
		int[][] multi = new int[5][5];
		int[] multi2 [] = new int[5][5];
		int multi3 [][]= new int [5][5];
		int multi4 [][] = new int[][] {{10,20,30},{5,10,15}};//cannot add [2][3] when array is initialised
		System.out.println(Arrays.toString(multi4));
		System.out.println(Arrays.deepToString(multi4));
		 
	
	}
}
