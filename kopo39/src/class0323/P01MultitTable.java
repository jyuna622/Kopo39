package class0323;

import java.util.ArrayList;
import java.util.Scanner;

public class P01MultitTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		//int n = scan.nextInt();
		String[][] MultiTable = new String[10][10];
		//ArrayList<String>  = new ArrayList<String>();
		
		for (int i = 2; i < MultiTable.length; i++) {
			for (int j = 2; j < MultiTable.length; j++) { 
				System.out.println(i + " X " + j + " = " + (i * j));	
		}
		
			System.out.println();
		}

	}
}
