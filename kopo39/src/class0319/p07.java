package class0319;

import java.util.Scanner;

public class p07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input a number: ");
		int n = scan.nextInt();
		System.out.print(" = " + Factorial(n));
	}	
		/*
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(Factorial(i));
		}
		*/
	
	public static int Factorial(int numb) {
		if (numb == 1) {
			System.out.print(numb);
			return 1;
		} else {
			System.out.print(numb + " X ");
			return numb * Factorial(--numb);
		}
	}
}