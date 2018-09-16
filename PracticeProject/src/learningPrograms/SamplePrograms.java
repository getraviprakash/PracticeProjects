package learningPrograms;

import java.util.Scanner;

public class SamplePrograms {

	public static void main(String[] args) {
		reverseNumber();
	}

public static void reverseNumber() {
	int num, sum=0;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number you want to reverse.");
	num = s.nextInt();
	System.out.println("Number entered is: "+num);
	while(num>0) {
		sum = (sum*10)+(num%10);
		num = num/10;
	}
	System.out.println("New no. is:"+sum);
	
}
}
