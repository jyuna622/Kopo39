package class0324;

import java.util.Scanner;

public class temp {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		temp t = new temp();
		String[] price = {"Milk : ", "0", " Apple : ","0"," Orange : ","0"," Melon : ","0"," water : ","0"};
		
		while(true) {
			int choice = printMenu(price);
			if(choice == 1) {
				setPrice(price);
			} else if (choice == 2) {
				getTotal(price);
			} else if (choice == 3) {
				setPrice(price);
			} else {
				System.out.println("Error. Please Try again.");
			}
		}
	}
	
	public static int printMenu(String[] price) {

		System.out.print("[Price] ");
		for(int i = 0; i < price.length; i++) {
			System.out.print(price[i]);
		}System.out.println("\n");
		
		System.out.println("#.Menu");
		System.out.println("1. Set the price of items");
		System.out.println("2. Calculate charges");
		System.out.println("3.Reset prices");
		System.out.print("=>");
		
		return scan.nextInt();
	}
	
	public static void setPrice(String[] price) {
		System.out.println("Please input the prices of milk, apple, orange, melon and water in order. Seperate prices with blank.");
		System.out.print("=>");
		
		String user_prices = scan.nextLine();
		
		String t[] = user_prices.split(" ");
		
		for (int i = 0; i < t.length; i++) {
			price[i+(1+i)] = t[i];
		}
	}
	
	public static void printRet(String[] price) {
		System.out.print("[Price] ");
		for(int i = 0; i < price.length; i++) {
			System.out.print(price[i]);
		}System.out.println("\n");
	}
	
	public static void getTotal(String[] price) {
		System.out.println("#.Total charge");
		System.out.println("#. Please input the quantities of milk, apple, orange,melon and water in order. Seperate prices with blank.");
		System.out.print("=>");
		int sum = 0;
		
		//get total amount of merchandise
		String a = scan.nextLine();
		
		String t[] = a.split(" ");
		
		int[] amount = new int[t.length];
		for(int i = 0; i < t.length; i++) {
			amount[i] = Integer.parseInt(t[i]);
		}
		
		//making price array
		int[] n_price = new int[t.length];
		
		n_price[0] = Integer.parseInt(price[1]);
		n_price[1] = Integer.parseInt(price[3]);
		n_price[2] = Integer.parseInt(price[5]);
		n_price[3] = Integer.parseInt(price[7]);
		n_price[4] = Integer.parseInt(price[9]);
		
		//get prices
		for(int i = 0; i < t.length; i++) {
			sum = amount[i] * n_price[i];
		}System.out.println("Total Sharge : " + sum);
	}
}
