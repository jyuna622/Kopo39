package seconwk;

import java.util.Scanner;

public class p10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String temp = scan.next();
		
		for (int i = temp.length() -1; i >= 0; i--) {
			System.out.print(temp.charAt(i));
		}		
	}
}