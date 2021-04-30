package class0324;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test test = new test();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			test.showMenu();
			int n = scan.nextInt();
			test.setPrice(n);
		}
	}
	
	public void  setPrice(int setting) {
		Scanner scan = new Scanner(System.in);
		if (setting == 1) {
			System.out.println("# Please input the prices of milk, apple, orange, melon and water in order.");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int d = scan.nextInt();
			int e = scan.nextInt();
			System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e);
		} else if (setting == 2){
			System.out.println("#Total Charge");
			System.out.println("Pleasw input the quantities of milk, apple, orange, melon and water in order.");
			int f = scan.nextInt();
			int g = scan.nextInt();
			int h = scan.nextInt();
			int i = scan.nextInt();
			int j = scan.nextInt();
			int sum = f+g+h+i+j;
			System.out.println("Toatal Charge: " + sum);
		} else if (setting == 3){
			int[] k = new int [1];
			for (int i = 0; i < 1; i++)
				k[i] = 0;
			System.out.println("Reset complete!");
		} else {
			System.out.println("Error. Please input numbers from 1 ~ 5.");
		}
	}
	
	public void showMenu(int setPrice) {
		System.out.println("#Menu");
		System.out.println("[PRICE] milk-"+ setPrice.setting((a)) + " apple-" + setPrice.setting((b)) + " orange-" + setPrice.setting((c)) + " melon-"+ setPrice.setting((d ))+ " water-" + setPrice.setting((e)));
		System.out.println("1. Set the prices pf of items");
		System.out.println("2. Calculate the charges");
		System.out.println("3. Reset the prices of items");
		System.out.println("--> ");
	}	
}

/*
public void  getPrice(int setting) {
	if (setting == 1) {
		System.out.println("1200");
	} else if (setting == 2){
		System.out.println("2400");
	} else if (setting == 3){
		System.out.println("3000");
	} else if (setting == 4){
		System.out.println("2600");
	} else if (setting == 5){
		System.out.println("800");
	} else {
		System.out.println("Error. Please input numbers from 1 ~ 5.");
	}
	
}
*/