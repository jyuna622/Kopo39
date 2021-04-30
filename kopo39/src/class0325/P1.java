package class0325;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P1 {

	public static void main(String[] args) {
		P1 thread = new P1();
		thread.start();
		SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM--dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		return;
			
		}
		
	public void run() {
			int count = 1;
			while (true) {
				if (count == 5) {
					break;
				}
				try {
					System.out.println(main() + "-" + count);
					Thread.sleep(1000);
					count++;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
/*
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		time = new Date();
		dateAndTime = format.format(time);
		System.out.println(dateAndTime);
		System.out.println("End");
	}

}
