package class0326;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String replaceString = str.replaceAll(" a ", " an "); // replaces all "a"s to "an"
		
		System.out.print(replaceString);
			
	}

}
