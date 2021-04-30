package class0326;

import java.util.Scanner;

public class P1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			try {
				change();
			} catch (Exception e) {
				System.out.println("error");
				System.out.println();
			}
		}
	}

	public static void change() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		Integer[] money = { 10000, 5000, 1000, 500, 100, 50, 10 };
		int c = a - b;
		System.out.println(c);
		for (int i = 0; i < money.length; i++) {
			System.out.println(money[i] + " - " + c / money[i]);
			c = c % money[i];
		}
		System.out.println();
	}
}
