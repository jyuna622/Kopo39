package class0319;

import java.util.Scanner;

public class p06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p06 main = new p06();
		Scanner scan = new Scanner(System.in);
		String form ;
		
		
		form = scan.nextLine();
		main.getOperator(form);
		
		if (form.contains("+")) {
			main.addition(form);
		} else if (form.contains("-")) {
			main.subtraction(form);
		} else if (form.contains("*")) {
			main.multiplication(form);
		} else if (form.contains("/")) {
			main.division(form);
		}
		scan.close();
	}
	
	public void addition (String text) {
		String a,b;
		double num1, num2, ans;
			
		a = text.substring(0,text.indexOf("+"));
		b = text.substring(text.indexOf("+"),text.length());
			
		num1 = Double.parseDouble(a);
		num2 = Double.parseDouble(b);
			
		ans = num1 + num2;
		System.out.println(ans);
		
	}
		
	public void subtraction (String text) {
		double num1, num2, ans;
		
		String t[] = text.split("-");
		
		num1 = Double.parseDouble(t[0]);
		num2 = Double.parseDouble(t[1]);
			
		ans = num1 - num2;
		
		System.out.println(ans);
	}
		
	public void multiplication (String text) {
		double num1, num2, ans;
		
		String t[] = text.split("\\*");
		
		num1 = Double.parseDouble(t[0]);
		num2 = Double.parseDouble(t[1]);
			
		ans = num1 * num2;
		
		System.out.println(ans);
		
	}

	public void division (String text) {
		double num1, num2, ans;
		
		String t[] = text.split("/");
			
		num1 = Double.parseDouble(t[0]);
		num2 = Double.parseDouble(t[1]);
			
		ans = num1 / num2;
		
		System.out.println(ans);
	}
	
	public static void getOperator (String text) {
		
		if (text.contains("*") == true) {
			System.out.println("*");
		} else if (text.contains("+") == true) {
			System.out.println("+");
		} else if (text.contains("-") == true) {
			System.out.println("-");
		} else if (text.contains("/") == true) {
			System.out.println("/");
		} else {
			System.out.println("Error! Please try again.");
		}
	}
}




/*package class0319;

public class p06 {

	public static void main(String[] args) {
		int sum, returnValue;
		sum = addOperation(5, 12);
		returnValue = Subtraction(5, 12);
		System.out.println(sum);
		System.out.println(returnValue);

	}
	public static int addOperation(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public static int Subtraction(int a, int b) {
		int returnValue = a - b;
		return returnValue;
	}
}
*/