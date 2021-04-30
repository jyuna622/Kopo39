package seconwk;

import java.util.Scanner;

public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p12.getNearest();
	}
	
	public static void getNearest() {	
		Scanner scan = new Scanner(System.in);
		String temp = scan.nextLine();
		String[] numbersStr = temp.split(" ");
		double goal = scan.nextDouble();
		
		double[] numbers = new double[numbersStr.length];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Double.parseDouble(numbersStr[i]);
		}
		
		double nearest = 0;
		double min = Integer.MAX_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			double a = Math.abs((numbers[i] - goal));
			if (min > a && a != 0) {
				min = a;
				nearest = numbers[i];
			}
		}
		System.out.print(nearest);			
	}
}