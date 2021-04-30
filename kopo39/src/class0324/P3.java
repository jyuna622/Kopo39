package class0324;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1;
	    System.out.println("Input a number: ");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();	  
		System.out.print("Fibonacci Series: ");
		int i = 1;
	    // Iterate till counter is N
	    try {
		while (i <= count) {
	    // Print the number
	    	System.out.print(num1 + " ");
	    	int num3 = num2 + num1;
	    	num1 = num2;
	    	num2 = num3;
	    	i++;
		}
		} catch (NumberFormatException e) {
			System.out.println("Error!");
			
		}	   
    }
}