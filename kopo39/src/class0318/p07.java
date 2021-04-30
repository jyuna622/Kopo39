package class0318;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class p07 {

	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		System.out.println("Please input the first date: ");
		int a = scan.nextInt();
		System.out.println("Please input the second date: " );
		int b = scan.nextInt();
		calendar.getActualMaximum(a);
		calendar.getActualMaximum(b);
	*/
		String date1 = "2020-02-03";
	    String date2 = "2020-02-12";
	    try { 
	        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
	        // date1, date2 �� ��¥�� parse()�� ���� Date������ ��ȯ.
	      
	        Date FirstDate = format.parse(date1);
	        Date SecondDate = format.parse(date2);
	        
	        // Date�� ��ȯ�� �� ��¥�� ����� �� �� ���ϰ����� long type ������ �ʱ�ȭ �ϰ� �ִ�.
	        // ������ -950400000. long type ���� return �ȴ�.
	        long calDate = FirstDate.getTime() - SecondDate.getTime(); 
	        
	        // Date.getTime() �� �ش糯¥�� ��������1970�� 00:00:00 ���� �� �ʰ� �귶������ ��ȯ���ش�. 
	        // ���� 24*60*60*1000(�� �ð����� ���� ������) �� �����ָ� �ϼ��� ���´�.
	        long calDateDays = calDate / ( 24*60*60*1000); 
	 
	        calDateDays = Math.abs(calDateDays);
	        
	        System.out.println("�� ��¥�� ��¥ ����: "+calDateDays);
	        }
	        catch(ParseException e)
	        {
	            // ���� ó��
        }
	}
}    