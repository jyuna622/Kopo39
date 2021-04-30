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
	        // date1, date2 두 날짜를 parse()를 통해 Date형으로 변환.
	      
	        Date FirstDate = format.parse(date1);
	        Date SecondDate = format.parse(date2);
	        
	        // Date로 변환된 두 날짜를 계산한 뒤 그 리턴값으로 long type 변수를 초기화 하고 있다.
	        // 연산결과 -950400000. long type 으로 return 된다.
	        long calDate = FirstDate.getTime() - SecondDate.getTime(); 
	        
	        // Date.getTime() 은 해당날짜를 기준으로1970년 00:00:00 부터 몇 초가 흘렀는지를 반환해준다. 
	        // 이제 24*60*60*1000(각 시간값에 따른 차이점) 을 나눠주면 일수가 나온다.
	        long calDateDays = calDate / ( 24*60*60*1000); 
	 
	        calDateDays = Math.abs(calDateDays);
	        
	        System.out.println("두 날짜의 날짜 차이: "+calDateDays);
	        }
	        catch(ParseException e)
	        {
	            // 예외 처리
        }
	}
}    