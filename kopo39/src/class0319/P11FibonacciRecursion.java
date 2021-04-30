package class0319;

import java.util.Scanner;

public class P11FibonacciRecursion {

	public static void main(String[] args) {
		int num1 = 0; //first number
		int num2 = 1; //next number
		System.out.println("How many numbers you want in Fibonacci? \nInput a Number: ");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();	
		System.out.print("Fibonacci Series: ");
		
		for (int i = 0; i < count; i++) {
		System.out.print(fibonacciRecursion(i) + " ");
		}
	 
	}
		//Fibonacci using recursion
	public static int fibonacciRecursion (int n) {
		if (n == 0) {
			return 0;
		} else if (n ==1 || n == 2) {
			return 1;
		} else {
		}
			return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
		
	}
}
	/*	
	while (i <= count) {
	    // Print the number
	    	System.out.print(num1 + " ");
	    	int num3 = num2 + num1;
	    	num1 = num2;
	    	num2 = num3;
	    	i++;
		}			
	*/