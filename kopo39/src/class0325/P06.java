package class0325;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P06 implements Runnable {
	
	public static Scanner scan = new Scanner(System.in);
	public static P06 p06 = new P06();
	
	public static void main(String[] args) {
		Thread thread = new Thread(p06);
		thread.start();
	}
	
	@Override
	public void run() {
		SimpleDateFormat format = new SimpleDateFormat ("HH:mm:ss");
		Date starttime = new Date();
		String dateAndTime = format.format(starttime);
		System.out.println(dateAndTime);
		
		int cnt = 1;
		while (true) {
			try {
				int n = scan.nextInt();	
				Thread.sleep(n * 1000);
				
				Date newTime = new Date();
				String now = format.format(newTime);
				String afterTime = format.format(starttime.getTime() + (n * 1000)); 
				System.out.println("TIME IS OVER " + now);	
				break;
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println( "error" );
			}
	}
}
}
