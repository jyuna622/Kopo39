package class0318;

import java.util.Scanner;

public class p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String temp = scan.nextLine();

			if (temp.contains("*") == true) {
				String temp1 = temp.substring(0, temp.indexOf("*"));
				String temp2 = temp.substring(temp.indexOf("*") + 1);
				double dtemp1 = Double.parseDouble(temp1);
				double dtemp2 = Double.parseDouble(temp2);
				System.out.println(dtemp1 * dtemp2);
				
			} else if (temp.contains("+") == true) {
				String temp1 = temp.substring(0, temp.indexOf("+"));
				String temp2 = temp.substring(temp.indexOf("+") + 1);
				double dtemp1 = Double.parseDouble(temp1);
				double dtemp2 = Double.parseDouble(temp2);
				System.out.println(dtemp1 + dtemp2);
				
			} else if (temp.contains("-") == true) {
				String temp1 = temp.substring(0, temp.indexOf("-"));
				String temp2 = temp.substring(temp.indexOf("-") + 1);
				double dtemp1 = Double.parseDouble(temp1);
				double dtemp2 = Double.parseDouble(temp2);
				System.out.println(dtemp1 - dtemp2);
				
			} else if (temp.contains("/") == true) {
				String temp1 = temp.substring(0, temp.indexOf("/"));
				String temp2 = temp.substring(temp.indexOf("/") + 1);
				double dtemp1 = Double.parseDouble(temp1);
				double dtemp2 = Double.parseDouble(temp2);
				System.out.println(dtemp1 / dtemp2);
			} else {
				System.out.println("Error! Please try again.");
			}
			System.out.println();
	}
}
		
		/*
		String temp = "abcdefghijk";
		String temp1 = temp.substring(3, temp.indexof("+")); //3부터 7까지 자름 --> 3 4 5 6
		System.out.println(temp1);
		temp.indexof("+")+1
		String temp2 = temp.substring(6); //6 7 8 9 10
		System.out.println(temp2);
		String temp3 = temp.substring(temp.indexOf("h"));
		System.out.println(temp3);
		String temp4 = temp.substring(temp.indexOf("b"),  temp.indexOf("g"));
	}

}
*/