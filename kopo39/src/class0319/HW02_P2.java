package class0319;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HW02_P2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		HW02_P2 p2 = new HW02_P2();
		
		while (true) {
			Scanner scan = new Scanner(System.in);
			String time1 = scan.nextLine();
			String time2 = scan.nextLine();
			p2.calSeconds(time1, time2);
		}
	}
	
	public void calSeconds(String time1, String time2) throws ParseException {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
		//Calendar calendar = Calendar.getInstance();
		//calendar.setTimeInMillis (System.currentTimeMillis());
		Date date1 = new Date();
		Date date2 = new Date();
		date1 = formatter.parse(time1);
		date2 = formatter.parse(time2);
		
		long difference = date2.getTime() - date1.getTime();
		long diffinSeconds = difference/1000;
		
		System.out.println(diffinSeconds + "s");
	}
}
		
/*
		SimpleDateFormat formatter= new SimpleDateFormat("HHmmss");
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis (System.currentTimeMillis());
				
		Date date1 = new Date(System.currentTimeMillis());
		String time1 = formatter.format(date1);
		Date date2 = new Date(System.currentTimeMillis());
		String time2 = formatter.format(date2);
		//long difference = date2.getTime() - date1.getTime(); 
		
		int timecalculator = String.parseInt(time2) - String.parseInt(time1);
		System.out.println(timecalculator + "s");
		
	*/	
		
/*
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis ( System.currentTimeMillis());
		SimpleDateFormat formatter= new SimpleDateFormat("HH:mm:ss");
		
		Date date1 = new Date(System.currentTimeMillis());
		String time1 = formatter.format(date1);
		int Int1 = Integer.parseInt(time1);
		System.out.println(Int1);
		
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date date2 = new Date(System.currentTimeMillis());
		String time2 = formatter.format(date2);
		int Int2 = Integer.parseInt(time2);
		System.out.println(Int2);
		System.out.println(Int2 - Int1);
	}
}
*/
