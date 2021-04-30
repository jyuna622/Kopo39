//L7 Practice 4
package class0324;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class P04 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		String text1 = scan.nextLine();
		String text2 = scan.nextLine();
		
		wordCount(text1, text2);
		
	}
	
	public static void wordCount(String text1, String text2) {
		HashSet<Character> Ltext = new HashSet<Character>(); // Ltext = Longer text
		HashSet<Character> Stext = new HashSet<Character>(); ;// Stext = Shorter text
		String uCaseS, uCaseL; //uCaseS = make shorter word to upper case; uCaseL = make longer word to upper case
		int l, sl, count = 0; // l = length of the word; sl = Length of a shorter word; count = counting same char
		
		//Printing length of the 1st and 2nd words
		System.out.println("1. Size of the first word: " + text1.length());
		System.out.println("2. Size of the second word: " + text2.length());

		//Sorting text
		if (text1.length() > text2.length()) {
			l = text1.length();
			sl = text2.length();
			uCaseL = text1.toUpperCase();
			uCaseS = text2.toUpperCase();
		}else {
			l = text2.length();
			sl = text1.length();
			uCaseL = text2.toUpperCase();
			uCaseS = text1.toUpperCase();
		}
		
		//put texts into hashsets
		for(int i =0; i < l; i++) {
			Ltext.add(uCaseL.charAt(i));
		}
		
		for(int i =0; i < sl; i++) {
			Stext.add(uCaseS.charAt(i));
		}
		
		ArrayList<Character> Ltxt= new ArrayList<Character>(Ltext);
		ArrayList<Character> Stxt = new ArrayList<Character>(Stext);
		
		int cnt = 0;
		for(int i = 0; i < Ltxt.size(); i ++) {
			for(int j = 0; j < Stxt.size(); j ++) {
				if(Ltxt.get(i) == Stxt.get(j)) {
					cnt++;
				}
			}
		}
		
		
		System.out.printf("3. Number of the same characters: %d", cnt); 
	
	}
}