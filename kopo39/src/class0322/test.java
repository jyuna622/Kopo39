package class0322;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		test main = new test();
		Scanner scan = new Scanner(System.in);
		String form;
		
		System.out.println("Please type in a equation in this format: First Number, '*', and the Second Number");
		form = scan.nextLine();
		
		if (form.contains("*")) {
			main.multiplication(form);
		}
	}

		public void multiplication (String text) {
			double num1, num2, ans;
			
			String t[] = text.split("\\*");
			
			num1 = Double.parseDouble(t[0]);
			num2 = Double.parseDouble(t[1]);
				
			ans = num1 * num2;
			
			System.out.println(ans);
			return ;
		
	}	
}
