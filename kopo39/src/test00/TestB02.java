package test00;

import java.util.Scanner;

public class TestB02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i,j;
		int r = (int) (Math.random() * 8);
		String ast = "*";
		
		for (i = 0; i < 5; i++) {
			System.out.print(r);
			for (j = 0; j <= 10; j++) {
				if (i == 2 || i == 4) {
					System.out.print("*" + (ast) * r);
				} else {
					System.out.print(" *");
				}
				System.out.println("");
				}		
		}
	}
}

