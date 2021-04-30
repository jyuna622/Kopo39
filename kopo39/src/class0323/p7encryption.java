package class0323;

import java.util.Scanner;

public class p7encryption {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String original = scan.nextLine();
		int count = 0;
		
		System.out.print("given alphabet: " + "");	
		for (int i = 0; i < original.length(); i++) {
			System.out.print(original[i] + " ");
		}
		
		//using ASCII value for lower case Alphabets
		char ch;
		for (ch = 97; ch < original.length(); ch++) { 
			System.out.print("encrypted: " + charAt(original));
			ch++;
		}
		System.out.println("");
		
		//in descending orders
		 for (int i = 0; i < original.length; i++) {
			for (int j = i+1; j < original.length; j++) {
				if(original[i] < original[j]) {    
	                   count = original[i];    
	                   original[i] = original[j];    
	                   original[j] = count;    
	            }     
			}
		}
			System.out.println("");
				
			System.out.println("\noriginal in descending alphabet order: ");
			 for (int i = 0; i < original.length; i++) {     
				 System.out.print(" [" + original[i] + "] ");
					 
			 }   	 
	}
}