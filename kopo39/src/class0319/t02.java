package class0319;

import java.util.Scanner;

public class t02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("Please type in the first number: ");
		double a = scan.nextInt();
		System.out.println("Please type in the second number: ");
		double b = scan.nextInt();
		System.out.println("Please type in the third number: ");
		double c = scan.nextInt();
		System.out.println("Please type in the fourth number: ");
		double d = scan.nextInt();
		int aa = scan.nextInt();
		
		
		int sum, avr, min, max;
		switch(aa) {
		case 1:
			sum = ((int)(a + b + c + d));
			System.out.println("Summation : " + sum );
			break;
		case 2:
			avr = ((int)(a + b + c + d)/4);
			System.out.println("Average : " + avr );
			break;
		case 3:
			min = (int)Math.min(a, b);
			System.out.println("Minimum : " + min);
			break;
		case 4:
			max = (int) (Math.max(a, b));
			System.out.println("Maximum : " + max );
			break;
			}
		System.out.println();
		}
	}
}
