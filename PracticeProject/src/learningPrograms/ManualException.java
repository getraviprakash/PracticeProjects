package learningPrograms;

import java.util.Scanner;

public class ManualException {

	public static void main(String args[]){ 
	     System.out.println("Welcome to the Registration process!!Enter you age:");
	     Scanner s = new Scanner(System.in);
	     int age = s.nextInt();
	     checkEligibility(age); 
	     System.out.println("Have a nice day.."); 
	     byte b = 120;
	     b += 10;
	     System.out.println(b);
	     System.out.println(age++);
	     System.out.println(++age);
	     
	 }
	
	static void checkEligibility(int ages) {
		if(ages<=10) {
			throw new ArithmeticException("Students having age less than 10 not eligible.");
		}
		else
			System.out.println("Registration is successful.");
	}
	
}


