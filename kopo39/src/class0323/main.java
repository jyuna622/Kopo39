package class0323;

import java.util.Scanner;

public class main implements Intertest {

	public static void main(String[] args) {
		main m = new main();
		Scanner scan = new Scanner(System.in);
		System.out.println("First number : ");
		double num1 = scan.nextDouble();
		System.out.println("Second number : ");
		double num2 = scan.nextDouble();
		
		m.calAddition(num1, num2);
		m.calSubtraction(num1, num2);
		m.calMultiplication(num1, num2);
		m.calDivision(num1, num2);
		
		String form = scan.nextLine();
		
		if (form.contains("+")) {
			main.calAddition(form);
		} else if (form.contains("-")) {
			main.calSubtraction(form);
		} else if (form.contains("*")) {
			main.calMultiplication(form);
		} else if (form.contains("/")) {
			main.calDivision(form);
		}
		scan.close();
	}
		
		

			
	public void calMultiplication (String text) {
		double num1, num2;
		double mul = num1 * num2;
		
		String t[] = text.split("\\*");
		
		num1 = Double.parseDouble(t[0]);
		num2 = Double.parseDouble(t[1]);
			
		mul = num1 * num2;		
		System.out.println(mul);
			
		}
		
	public void calAddition (String text) {
		String a,b;
		double num1, num2, ans;
			
		a = text.substring(0,text.indexOf("+"));
		b = text.substring(text.indexOf("+"),text.length());
			
		num1 = Double.parseDouble(a);
		num2 = Double.parseDouble(b);
			
		ans = num1 + num2;
		System.out.println(ans);
		
	}
		
	public void calSubtraction (String text) {
		double num1, num2, ans;
		
		String t[] = text.split("-");
		
		num1 = Double.parseDouble(t[0]);
		num2 = Double.parseDouble(t[1]);
			
		ans = num1 - num2;
		
		System.out.println(ans);
	}
	
	public void calDivision (String text) {
		double num1, num2, ans;
		
		String t[] = text.split("/");
			
		num1 = Double.parseDouble(t[0]);
		num2 = Double.parseDouble(t[1]);
			
		ans = num1 / num2;
		
		System.out.println(ans);
}




	@Override
	public double calAddition(double num1, double num2) {
		// TODO Auto-generated method stub
		double mul = num1 * num2;
		
		String t[] = text.split("\\*");
		
		num1 = Double.parseDouble(t[0]);
		num2 = Double.parseDouble(t[1]);
			
		mul = num1 * num2;		
		System.out.println(mul);
		return mul;
	}




	@Override
	public double calSubtraction(double num1, double num2) {
		// TODO Auto-generated method stub
		double ans;
		
		String t[] = text.split("-");
		
		num1 = Double.parseDouble(t[0]);
		num2 = Double.parseDouble(t[1]);
			
		ans = num1 - num2;
		
		System.out.println(ans);
		return ans;
	}




	@Override
	public double calMultiplication(double num1, double num2) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public double calDivision(double num1, double num2) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public char getOperator(String form) {
		// TODO Auto-generated method stub
		return 0;
	}
}

}
