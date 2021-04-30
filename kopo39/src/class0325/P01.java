package class0325;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P01 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		P01 thread = new P01 ();
		thread.start();
	}
	
	public static String getCurrentTime() {
		SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		return dateAndTime;	
	}
	
	public void run() {
		while (true) {
		try {
			for (int i = 1; i <= 100; i++) {
				System.out.println(getCurrentTime());
				System.out.println(i);
			
				Thread.sleep(1000);
			}
			break;
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		}
	}
}
