package class0323;

import java.util.Scanner;

public class P08_Decryption {

	public static void main(String[] args) {	
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
			k[i] = 122 - original[i] + 97;
			p[i] = (char) k[i];
		}
		return p;
	}
}
//a = 97, z = 122