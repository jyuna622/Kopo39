package class0325;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class test {

	public static void main(String[] args) {
		test test = new test();
		while (true) {
			int n = 10;
			test.Random(n);
		}
	}
	
	public void Random (int n) {
		int[] temp = new int[n];
		HashSet numb = new HashSet<Integer>();
		ArrayList<Integer> Array = new ArrayList<Integer>();
		Iterator<Integer> iterator = numb.iterator(); 
		for (int i = 0; i <= temp.length; i++) {
			if (temp.length > 0) {
			numb.add((int) (Math.random() * i) + 0);
			Array.add(temp[i]);
			
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			System.out.println("#" + numb);
		}
		
		}
		System.out.println("Total number of trials: ");
	}
}