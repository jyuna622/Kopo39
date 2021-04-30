package class0319;

import java.util.Scanner;

public class p04 {

	public static void main(String[] args) {
		p04 p04 = new p04();
		Scanner scan = new Scanner(System.in);
		String form;
		form = scan.nextLine();
		//String a = val.substring(0, val.indexOf("+"));
		//String b = scan.next();
		//System.out.println();
		
		p04.addition(form);
		p04.subtraction(form);
		p04.multiplication(form);
		p04.division(form);
	}
	
	public static void addition (String text) {
		if (text.contains("+")) {
			double num1, num2, sum;
			String a = text.substring(0, text.indexOf("+"));
			String b = text.substring(text.indexOf("+"), text.length());
			
			num1 = Double.parseDouble(a);
			num2 = Double.parseDouble(b);
			
			sum = num1 + num2;
			System.out.println(sum);
		}
	}		
	public static void subtraction (String text) {
		if (text.contains("-")) {
			double num1, num2, sub;
			String a = text.substring(0, text.indexOf("-"));
			String b = text.substring(text.indexOf("-"), text.length());
			
			num1 = Double.parseDouble(a);
			num2 = Double.parseDouble(b);
			
			sub = num1 - num2;
			System.out.println(sub);
		}
	}		
	public static void multiplication (String text) {
		if (text.contains("*")) {
			double num1, num2, mul;
			String a = text.substring(0, text.indexOf("*"));
			String b = text.substring(text.indexOf("*"), text.length());
			
			num1 = Double.parseDouble(a);
			num2 = Double.parseDouble(b);
			
			mul = num1 * num2;
			System.out.println(mul);
		}
	}		
	public static void division (String text) {
		if (text.contains("/")) {
			double num1, num2, div;
			String a = text.substring(0, text.indexOf("/"));
			String b = text.substring(text.indexOf("/"), text.length());
			
			num1 = Double.parseDouble(a);
			num2 = Double.parseDouble(b);
			
			div = num1 / num2;
			System.out.println(div);
		}
	}
}
