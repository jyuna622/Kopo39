package class0326;

import java.util.Scanner;
import java.util.Stack;

public class L1_P13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valueToConvert = scanner.nextInt();
		int N = scanner.nextInt(); // coverting to base N number 
		
		Stack<Integer> remainders = new Stack<Integer>();
		
		while (true) {
			int remainderValue= valueToConvert % N;
			remainders.add(remainderValue);
			valueToConvert = valueToConvert / N;
			if(valueToConvert < 3) {
				remainders.add(valueToConvert);
				break;
			}
		}
		
		while (true) {
			System.out.print(remainders.pop());
			if(remainders.empty() == true) {
				break;
			}
			
		}
		
	}

}