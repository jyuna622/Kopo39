package class0326;

import java.util.Scanner;

public class P1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = a/3;
		int c =  b/3;
		
		System.out.print(c % 3);
		System.out.print(b % 3);
		System.out.print(a % 3);
	}

}
