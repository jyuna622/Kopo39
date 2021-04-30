package test00;

import java.util.Scanner;

public class TestB01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n,m,mm;
		n = scan.nextInt();
		m = scan.nextInt();
		mm = scan.nextInt();
		
		if (n % m == 0 && n % mm == 0) { 
			System.out.printf("Divisible by %d and %d!", m, mm);
		} else {
			System.out.printf("Not divisible by %d and %d!", m, mm);
		}
	}

}
