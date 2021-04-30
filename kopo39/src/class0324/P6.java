package class0324;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input numbers: ");
		String num = scan.nextLine();
		
		String[] arrayNum = num.split(" ");
		
		try {
			String strToChoose = scan.nextLine();
			Stack<String> stack = new Stack<String>();
			Collections.addAll(stack, arrayNum);
			System.out.println(stack);
			
			for (int i = 0 ; i < arrayNum.length; i++) {
				stack.add(arrayNum[i]);
			}
			Iterator<String> iterator = stack.iterator();
			int count = 0;
			while(iterator.hasNext()) {
				count ++;
				if (iterator.next().equals(strToChoose + "")) {
					System.out.println(count);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("error!" + e);
		}
	}
}