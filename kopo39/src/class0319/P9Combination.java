package class0319;

import java.util.Scanner;

public class P9Combination {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert two Numbers for the Combination formula: ");
		//Combination: C(n, r) = n! / (r!(n-r)!)
		System.out.println("P(n, r) = n! / (r!(n-r)!)");
		int n = scan.nextInt();
		//System.out.print("n = " + n);
		int r = scan.nextInt();
		//System.out.print("r = " + r);
		int rr = (n-r);
		//System.out.print("n-r = " + rr);
		System.out.println("The combination for " + n + " and " + r + " is = " 
		+ FactorialN(n)/FactorialR(r)/FactorialRR(rr));
	}
	
	public static int FactorialN(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number * FactorialN(--number);
		}
	}
	
	public static int FactorialR (int R) {
		if (R == 1) {
			return 1;
		} else {
			return R * FactorialR(--R);
		}
	}
		
	public static int FactorialRR (int RR) {
		if (RR == 1) {
			return 1;
		} else {
			return RR * FactorialRR(--RR);
		}
	}
}