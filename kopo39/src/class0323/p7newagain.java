package class0323;

import java.util.Scanner;

public class p7newagain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p7new ary2 = new p7new();
		//ary2.charArray();
		
		Scanner scan = new Scanner(System.in);
		String original = scan.nextLine();
		System.out.println(get((getwords(original))));
	}
	
	public static int[] getwords(String original) {
		char Ary;
		int[] t = new int [original.length()];
		for (int i = 0; i < original.length(); i++) {
		t[i] = (int) (original.charAt(i));
		}
		return t;
	}
	public static char[] get(int[] original) {
		int[] k = new int [original.length];
		char [] p = new char [original.length];
		for (int i = 0; i < original.length; i++) {
			k[i] = 219 - original[i];
			p[i] = (char) k[i];
		}
		return p;
	}
}