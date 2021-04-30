package class0324;

import java.util.Scanner;

public class P08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P08 p08 = new P08();
		Scanner scan = new Scanner(System.in);
		while(true) {
			String numb = scan.nextLine();
			p08.function(numb);
		}
	}
	
	public void function (String numb) {
		Scanner scan = new Scanner(System.in);
		String[] numbs = numb.split(" ");
		int n = scan.nextInt();
		int count = 0;
		
		try {
			int i = 0;
			while (i < numbs.length) {
					if (Double.parseDouble(numbs[i]) % n == 0) {
						System.out.print(numbs[i] + " ");
					}
						i++;
						count++;
						//System.out.print(numbs[i] + " ");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
