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
		calendar.set(Calendar.MONTH, month); //�Է��� ���� ����
		System.out.println("-------------[" + 2021+ " . " + month + "]-------------");
		System.out.println(" SUN   MON   TUE   WED   THUR   FRI   SAT");

		calendar.set(2021 ,month-1,1); //�Է¹��� ���� 1�Ϸ� ����
		                         //month�� 0�� 1���̹Ƿ� -1�� ���ش�
		  
		int end = calendar.getActualMaximum(Calendar.DATE); //�ش� �� ������ ��¥���ϴ� ��
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); //�ش� ��¥�� ����(1:�Ͽ��� �� 7:�����)
		

		for(int i=1; i<=end; i++) {
			if(i==1) {
				for(int j=1; j<dayOfWeek; j++) {
					System.out.print("      ");
				}
			}
			if(i<10) { //���ڸ����� ��� ������ �߰��ؼ� �ٸ��߱�
				System.out.print(" ");
			}
			System.out.print("  "+i+"  ");
			if(dayOfWeek%7==0) { //���ٿ� 7�Ͼ� ���
				System.out.println();
			}
			dayOfWeek++;
		}
		System.out.println("-----------------------------");
		
		
	} //main
} //CalendarInputPrintExec
