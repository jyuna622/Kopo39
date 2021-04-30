package kopo39;

import java.util.Scanner;

public class test0318 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i,j;
		
		
		for (i = 0; i < 5; i++) {
			System.out.print((int)(Math.random() * 8));
			for (j = 0; j <= 10; j++) {
			System.out.print("*");
			}
			System.out.println("");
			}					
	}
}

