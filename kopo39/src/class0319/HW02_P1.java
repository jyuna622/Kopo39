package class0319;

import java.util.Scanner;

public class HW02_P1 {
	
	public static void main(String[] args) {
		HW02_P1 p1 = new HW02_P1();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			p1.showMenu();
			int n = scan.nextInt();
			String temp = scan.nextLine();
			p1.getMenu(n);
			System.out.println(" ");
			
	}
}
	public void  getMenu(int menu) {
		System.out.println("get menu started");
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();	
		if (menu == 1) {
			System.out.println("Encoder");
			encoding(sentence);
		} else if (menu == 2){
			System.out.println("Decoder");
			decoding(sentence);
		} else {
			System.out.println("Error");
		}
	}
	
	public void showMenu() {
		System.out.println("#Menu");
		System.out.println("1. Encoder");
		System.out.println("2. Decoder");
		System.out.println("--> ");
	}
	
	public void encoding(String sentence) {
		//a=97 ~ z=122 / A = 65 ~ Z = 90
		int intA = (int) 'A';
		for (int i = 0; i < sentence.length(); i++) {
			int eng = (int) sentence.charAt(i);
			System.out.print((eng - intA) + " ");
		}
	}
	
	public void decoding(String sentence) {
		//a=97 ~ z=122 / A = 65 ~ Z = 90
		int intA = (int) 'A';
		String[] inputNumbers = sentence.split(" ");
		for (int i = 0; i < inputNumbers.length; i++) {
			int num = Integer.parseInt(inputNumbers[i]);
			System.out.print((char)(num + intA) + " ");
		}
	}
}
