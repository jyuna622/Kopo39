package class0318;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class p4  {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		int a = Calendar.MONTH;
		int b = Calendar.DAY_OF_WEEK;
		Date date = new Date();
		System.out.println("JAVA 03, Practice 06 \n \nPrint the Calendar 2021");
		System.out.println("Please type in the month : "); 
		int month = scan.nextInt();
		calendar.set(Calendar.YEAR, 2021);
		calendar.set(Calendar.MONTH, month); //입력한 월로 세팅
		System.out.println("-------------[" + 2021+ " . " + month + "]-------------");
		System.out.println(" SUN   MON   TUE   WED   THUR   FRI   SAT");

		calendar.set(2021 ,month-1,1); //입력받은 월의 1일로 세팅
		                         //month는 0이 1월이므로 -1을 해준다
		  
		int end = calendar.getActualMaximum(Calendar.DATE); //해당 월 마지막 날짜구하는 것
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); //해당 날짜의 요일(1:일요일 … 7:토요일)
		

		for(int i=1; i<=end; i++) {
			if(i==1) {
				for(int j=1; j<dayOfWeek; j++) {
					System.out.print("      ");
				}
			}
			if(i<10) { //한자릿수일 경우 공백을 추가해서 줄맞추기
				System.out.print(" ");
			}
			System.out.print("  "+i+"  ");
			if(dayOfWeek%7==0) { //한줄에 7일씩 출력
				System.out.println();
			}
			dayOfWeek++;
		}
		System.out.println("-----------------------------");
		
		
	} //main
} //CalendarInputPrintExec
