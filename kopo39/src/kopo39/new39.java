package kopo39;

import java.util.Scanner;

public class new39 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		int b = 1;
		int LCM;
		
		System.out.println("Please enter the first number: ");
		int n1 = scan.nextInt();
		
		System.out.println("Please enter the second number: ");
		int n2 = scan.nextInt();
		
		int tempn1 = n1, tempn2 = n2;
		if (n1 < n2) {
			n1 = tempn2;
			n2 = tempn1;
			while (b > 0) {
				b = n1 % n2; 
				n1 = n2;
				n2 = b;
				//n1 = 10, n2 = 8, n1 % n2 = 2 --> tempn1 = 8, tempn2 = 2
			}
			LCM = tempn1 * tempn2 / n1; // LCM Formula
			System.out.println("The Least Common Multiple of first and second number are:  " + LCM);
		}
	}
}
		
		
		
		
		
		
		/*
		 * Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		System.out.println("The factors of " + a + "are :");
		
		for (int i = 1; i <+ a; i++) {
			if (a % i == 0){
				System.out.printf(" %d", i);
			}
		}
	}
}
	
		 */
/*
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i, j, p = 0;
		
		for (i = 2; i <= n; i ++) {
			for (j = 2; j <= i; j ++) {
				if (i % j == 0) {
				p++;			
				}
			}	
			if (p == 1) {
				System.out.println(i + "");
			}
			p = 0;
			}		
	}		
}
*/