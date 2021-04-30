package class0318;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("#Current Converter");
			System.out.println("1. Celsius --> Fahrenheit");
			System.out.println("2. Fahrenheit --> Celsius");
			System.out.println("Please type in your number from the Temperature Converter: ");
			int cc = scan.nextInt();
			
			switch(cc) {
			case 1: // Celsius --> Fahrenheit

				double a = scan.nextDouble();
				double inFahrenheit = (a * 9/5) + 32;
				System.out.println(inFahrenheit);
			
				break;
			case 2: //Fahrenheit --> Celsius
				double b = scan.nextDouble();
				double inCelsius = (b - 32) * 5/9;
				System.out.println(inCelsius);
			
				break;
			}
			System.out.println();
		}
	}
}