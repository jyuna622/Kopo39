package class0324;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class NewP05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] nums = input.split(" ");
		try {
			int output = scanner.nextInt();
			Queue<String> list = new LinkedList<String>();
			Collections.addAll(list, nums);
			System.out.println(list);
			
			Iterator<String> iterator = list.iterator();
			int count = 0;
			while(iterator.hasNext()) {
				count++;
				if (iterator.next().equals(output + "")) {
					System.out.println(count);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}