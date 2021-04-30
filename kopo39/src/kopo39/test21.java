package kopo39;

import java.util.Scanner;

public class test21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i,j;
		int n = scan.nextInt();
		
		for (i = 0; i < 5; i++) {
			System.out.print((int)(Math.random() * 20));
			for (j = 0; j <= 10; j++) {
				
			if (i <= n) 
				System.out.println(i + "-" + (n--));
			break;
			
			}
		}
		System.out.println("Number of trials : " + i);
	}
}
