package class0326;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test extends Thread{

	public static void main(String[] args) throws InterruptedException {
		Test thread = new Test();
		thread.start();
		
	}
	
	public void run() {
		
		double a = (Math.random() * 20.0 + 1.0);
		System.out.println(a);
		double sum = a;
		a = sum;
		int count = 1;
		
		double avg = sum / count;
		
		while (count <= 10) {
			count++;
			if (count == 10) {
				break;
		}			
			try {
				System.out.println("count - " + count + a + ", Sum - " + sum + ", Avg - " + avg);
				Thread.sleep(500);
				count++;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}