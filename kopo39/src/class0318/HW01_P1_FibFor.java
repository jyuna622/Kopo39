package class0318;

import java.util.Scanner;

public class HW01_P1_FibFor {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1;
	    System.out.println("Input a number: ");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();	  
		System.out.print("Fibonacci Series: ");
		System.out.print(num1+" "+num2);
		scan.close();
		
		for (int i = 2; i < count; i++) {
			int num3 = num2 + num1;
	    	num1 = num2;
	    	num2 = num3;
			System.out.print(" " + num3);
		}
	}	   
}