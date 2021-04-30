package kopo39;

import java.util.Scanner;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String text = scan.nextLine(); 		
		
		if(sentence.toLowerCase().contains(text.toLowerCase())) {
			System.out.println(text + " is included in the input string");
		} else {
			System.out.println(text + " is not included in the input string");
		}
	}
}