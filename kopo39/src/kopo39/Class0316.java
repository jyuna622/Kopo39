package kopo39;

import java.util.Scanner;

public class Class0316 {

	public static void main(String[] args) {
		Class0316 p5 = new Class0316();
		p5.p5Multiplication();
	}
		
	public void p5Multiplication() {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("What number do you want to multiply? \nInsert the number here : ");
		n = scanner.nextInt();
		int i = 2;
		
		while (i <= 9) {
			System.out.println(n + " x " + (i) + " = " + (n * i));
			i++;
		 
			
		//for (int i = 0; i < 10; i++){
		  // System.out.println(n + " x " + (i+1) + " = " + (n * (i+1)));
		 //}
		}
	}
}
/*
		if (n == 1) {
			System.out.println(n + " * 1 = " + (n * 1));
			System.out.println(n + " * 2 = " + (n * 2));
			System.out.println(n + " * 3 = " + (n * 3));
			System.out.println(n + " * 4 = " + (n * 4));
			System.out.println(n + " * 5 = " + (n * 5));
			System.out.println(n + " * 6 = " + (n * 6));			
			System.out.println(n + " * 7 = " + (n * 7));
			System.out.println(n + " * 8 = " + (n * 8));
			System.out.println(n + " * 9 = " + (n * 9));
		} else {
			System.out.println(n + " * 1 = " + (n * 1));
			System.out.println(n + " * 2 = " + (n * 1));
			System.out.println(n + " * 3 = " + (n * 1));
			System.out.println(n + " * 4 = " + (n * 1));
			System.out.println(n + " * 5 = " + (n * 1));
			System.out.println(n + " * 6 = " + (n * 1));			
			System.out.println(n + " * 7 = " + (n * 1));
			System.out.println(n + " * 8 = " + (n * 1));
			System.out.println(n + " * 9 = " + (n * 1));
			
		}
*/
