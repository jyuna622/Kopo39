package kopo39;

import java.util.Scanner;

public class filenamehurtsmyeyes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i = 0;
		int j = 0;
		
		while (i < n) {
		for (i = 0; i < n; i++) {
			for (j = 0; j < i; j++) {
					System.out.print(" * ");
			}
					System.out.println(" ");
		}
	}
}