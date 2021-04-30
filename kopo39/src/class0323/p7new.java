package class0323;

import java.util.Scanner;

public class p7new {

	public static void main (String[] args) {		
		p7new ary2 = new p7new();
		ary2.charArray();
	}
		
	public char[] charArray() {
		Scanner scan = new Scanner(System.in);
		String original = scan.nextLine();
		char[] Ary = new char[original.length()];
		
		for (int i = 0; i < original.length(); i++) {
			Ary[i] = original.charAt(i);
		}
		return Ary;
	}

	private char[] Ary2 (char [] original) {
		
		int[] intAry = new int[original.length];
		char[] charAry2 = new char[original.length];
		
		for (int i = 0; i < original.length; i++) {
			intAry[i] = original[i];
			
			if()
			
			System.out.println(intAry[i]);
		
		}
		return charAry2;
	}
}
