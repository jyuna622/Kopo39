package class0324;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		P2 p2 = new P2();
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			
			p2.ExcHandling(n);
		}
	}

	public void ExcHandling (int n) {
		Scanner scan = new Scanner(System.in);
		int[] temp = new int[n];
		String temp1 = scan.nextLine();
		String[] temp2 = temp1.split(" ");
		ArrayList<Integer> Array = new ArrayList<Integer>();
		try {
			for (int i = 0; i < temp2.length; i++) {
				temp[i] = Integer.parseInt(temp2[i]);
				Array.add(temp[i]);
			}
			Collections.sort(Array);
			for (int i = 0; i < Array.size(); i++) {
				System.out.print(Array.get(i) + " ");
			}
			System.out.println();
			
		} catch(Exception e) {
			System.out.println("error");
		}
	}
}


		/*
		System.out.println("Please type in your numbers: ");  
	    String str = scan.nextLine();
	    ArrayList<String> wordList = new ArrayList<String>();

	}

}
*/