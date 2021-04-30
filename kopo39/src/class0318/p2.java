package class0318;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String output = "";
		int temp;
		for (int i = 0; i < a.length(); i++) {
			temp = (int)a.charAt(i);
			
			if (temp>=65 && temp <= 90) {
				output += (char)(temp+32);
			} else if (temp >+ 97 && temp <= 122){
				output += (char)(temp -32);
			} else {
				output += (char)temp;				
			}
		}
		System.out.println(output);
	}
}
