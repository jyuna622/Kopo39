package class0325;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P07 implements Runnable {
	public static P07 main = new P07();
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Thread thread = new Thread(main);
		thread.start();
	}

	@Override
	public void run() {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date sigaksigan = new Date();
		
		System.out.println(format.format(sigaksigan)); // print run time = print sigaksigan
		
		int count = 0;
		while ( true ) {
			try {
				int gidarim = sc.nextInt(); // first wait when count is 0.
				Thread.sleep(gidarim * 1000); // 1000msec = 1s
				
				// for this line to (go to line 43)
				Date jigumsigan = new Date(); 
				String jigum = format.format(jigumsigan);				
				String heuleunsigan = format.format( sigaksigan.getTime() + ( gidarim * 1000 ) );
				
				if ( jigum.equals(heuleunsigan) ) {
					System.out.print( "time is over (" + jigum + ")" );
					break;
				} else {
					sigaksigan = jigumsigan; 
				}
				
			} catch ( Exception e ) {
				e.printStackTrace();
				System.out.println( "error" );
		}
	}

	}
}
