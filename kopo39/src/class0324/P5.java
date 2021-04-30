package class0324;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a number: ");
		String num = scan.nextLine();
		String strToChoose = scan.nextLine();
		String[] arrayNum = num.split(" ");
		
		
		try {
			Queue<String> number = new LinkedList<String>();
			Collections.addAll(number, arrayNum);
			System.out.println(number);
		
			
			for (int i = 0 ; i < arrayNum.length; i++) {
				number.offer(arrayNum[i]);
			}
			
			int count = 0;
			for (int a = 0 ; a < arrayNum.length; a++) {
				if ((number.poll()).equals(strToChoose)) {
					System.out.println(count++);
					break;
				}
				/*} else {
					count++;
				}*/
				count++;
			}
		} catch (Exception e) {
			System.out.println("ERROR!");
		//if (count > arrayNum.length) {
			//System.out.println("ERROR!!!");
		}
		}
}