package class0319;

import java.util.Scanner;

public class P8Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert two Ns for the Permutation formula: ");
		//Permutation: P(n, r) = n! / (n-r)!
		System.out.println("P(n, r) = n! / (n-r)!");
		int n = scan.nextInt();
		System.out.println("n = " + n);
		int r = scan.nextInt();
		System.out.println("r = " + r);
		
		System.out.println(Permutation(n,r));
	}
	
	public static int Permutation (int N, int R) {
		if (R == 1) {
			return N;
		} else {
			return N * Permutation(--N, --R);
		}
	}
}