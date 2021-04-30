package class0323;

import java.util.Scanner;

public class p9split {

	public static void main(String[] args) {
		//main main = new main();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		splitMethod(str);
	}
	//split in method

	public static void splitMethod (String str) {
		// TODO Auto-generated method stub
			for (int i = str.indexOf(" "); i < str.length(); i++) {
				System.out.print(str.indexOf(i));
			}
			System.out.println("");
	}
}

//splitting a sentence without using split is hard