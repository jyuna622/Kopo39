package class0318;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		String[] words = str.split(" ");
			for (int i = 0; i < words.length; i++) {
				System.out.println(words[i]);
				if (words[i].equals("a") || words[i].equals("an")) {
					if(words[i+1].charAt(0) =='a'){
					words[i] = "an";
				} else {
				words[i] = "a";
				
				//a = 97, n = 110, e = 101, i = 105, o = 111, u = 117
				}
			}
		}
			System.out.println("===========================");
			for (int i = 0; i < words.length; i++){
			System.out.print(words[i] + " ");		
			}
		}
}
		/*
		 * 	Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String replaceString = str.replaceAll(" a ", " an "); // replaces all "a"s to "an"
		
		System.out.print(replaceString);
			
	}

}
		 */

