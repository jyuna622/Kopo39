package test00;

import java.util.HashSet;

public class TestA07 {
	
	public static void main(String[] args) {
		HashSet<Integer> num = new HashSet<Integer>();
		
		int i = 0;
		while (true) {
			int num1 = (int) ((Math.random()* 10) + 1);
			int num2 = (int) ((Math.random()* 10) + 1);
			for (int j = 2; j <= 10; j++) {
				int num3 = num2 + num1;
		    	num1 = num2;
		    	num2 = num3;
			i++;
	
			System.out.println("#" + i + "-" + num1 + "(" + num3 + ")");
		
			}
		}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			num.add(num3);
			
			if (num.size() == 10) {
				System.out.println("Count: " + i);
				break;
			}
		}
	}
}
