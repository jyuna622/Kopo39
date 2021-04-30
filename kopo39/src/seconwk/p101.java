package seconwk;

import java.util.Scanner;

public class p101 {

	public static void p1new (String[] args) {
		Scanner scan = new Scanner(System.in);
		p1new q = new p1new (1, 2, 3, 4);
		
		while (true) {
			q.showPrice();
			int a = scan.nextInt();
			q.showPrice(a);
		}
		
	}
}
