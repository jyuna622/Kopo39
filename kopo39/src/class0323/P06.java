package class0323;

import java.util.Scanner;

public class P06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String word = scan.nextLine();
		String[] array = {str};
		int count = 0;
		String[] t = str.split(word);
		System.out.println("The word [" + word +"] in the Sentence is included --> " + (t.length) + " times");
		
		//int split = str.split("\\.",0).length-1;
		
		for (int i = 0; i < t.length; i++) {
			count++;
			System.out.print(t[i] + "__");
				
		}
	}
}