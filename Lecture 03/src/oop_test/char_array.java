package oop_test;

public class char_array {
	 char myCharArray[];
		

		public void CharArray(char[] myCharArray) {
			this.myCharArray = myCharArray;
		}
		
		public void swapFirstAndLast(){
			char m = myCharArray[0];
			myCharArray[0] = myCharArray[myCharArray.length - 1];
			myCharArray[myCharArray.length - 1] = m ;
		}
		
		  void DisplayArray() {
			
			for (int i = 0 ; i < myCharArray.length ; i++){
				
				System.out.print(myCharArray[i] + " ");
			}
			System.out.println();
		}
		
		  void DisplayString() {
			System.out.println(String.valueOf(myCharArray));
		}
	}

	

		
