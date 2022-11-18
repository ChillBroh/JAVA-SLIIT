package Lec_5;

import java.util.Scanner;

public class invlid_id {
	public static void main(String[] args) {
		
		try {
			//getting student id
			String id = "IT234";
			if(!id.startsWith("IT")){
			throw	new userdefinedexceptions("ado kela wel");
			}
		}
		catch (userdefinedexceptions e) {
			System.out.println(e);
		}
	}
}
 