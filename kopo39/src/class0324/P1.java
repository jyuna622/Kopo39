package class0324;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	   
	    System.out.println("Please type in words: ");  
	    String str = scan.nextLine();
	    ArrayList<String> wordList = new ArrayList<String>();
	      
	    String[] words = str.split(" ");
	    for (int i=0 ; i<words.length ; i++) {
	       wordList.add(words[i]);
	    }
	    System.out.println("\nTyped in words are: ");
	    System.out.println(wordList);
	    
	    System.out.println("\nWords in descending order: ");
	    Collections.reverse(wordList);
	    System.out.println(wordList);
	      
	   }
}

		/*
		Stack<String> stack = new Stack<String>();
		
		System.out.println("Please input three names: ");
		String name = scan.nextLine();
		String[] nameSplit = name.split(" ");
		
		for (int i = 0; i < nameSplit.length; i++) {
			System.out.println(nameSplit[i]);
		}
		
		System.out.println(stack.pop());
		System.out.println(stack);
	}

}
		*/