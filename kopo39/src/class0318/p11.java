package class0318;

import java.util.Scanner;

public class p11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("#Menu");
			System.out.println("1. Coke = 1200 won");
			System.out.println("2. Milk = 1250 won");
			System.out.println("3. Water = 900 won");
			System.out.println("Please type in your number from the Menu: ");
			int cc = scanner.nextInt();
			double a, b, c;
		
			switch(cc) {
			case 1: // Coke
				a = 1200;
				System.out.println("1200 won");
			
				break;
			case 2:
				b = 1250;
				System.out.println("1250 won");
			
				break;
			case 3:
				c = 900;
				System.out.println("900 won");
				
				break;
				
			}
			System.out.println();
		}
	}
}
