package seconwk;

import java.util.Scanner;

import class0319.p01;

public class p1 {

	public static final String Apple = "1,000";
	public static final String Strawberry = "4,980";
	public static final String Grape = "8,970";
	public static final String Watermelon = "6,530";
		
	public static void main(String[] args) {
		p1 p1 = new p1();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			p1.showPrice();
			int n = scan.nextInt();
			p1.getPrice(n);
		}
	}

	public void  getPrice(int menu) {
		if (menu == 1) {
			System.out.println("1,000");
		} else if (menu == 2){
			System.out.println("4,980");
		} else if (menu == 3){
			System.out.println("8,970");
		} else if (menu == 4){
			System.out.println("6,530");
		} else {
			System.out.println("Error");
		}
	}
	
	public void showPrice() {
		System.out.println("#Price");
		System.out.println("1. Apple");
		System.out.println("2. Strawberry");
		System.out.println("3. Grape");
		System.out.println("4. Watermelon");
		System.out.print("--> ");
	}	
}

