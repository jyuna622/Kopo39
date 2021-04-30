package class0319;

import java.util.Scanner;

public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p10 main = new p10();
		main.multiTable();
	}
	
	public static void multiTable () {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 2; i <= 9; i++) {
			//for (int j = 1; j < 10; j++) {
			System.out.println(n + "X" + i + "=" + i * n + "\t");
			}
			System.out.println("\t\t");
	}
}