package L03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MyWon = 1000000; 
		double MoneyEx = 1238.21; //�޷�ȯ��
		double commission = 0.003; //ȯ��������, 0.3%
		double ComPerOne = MoneyEx * commission; //1$�� ������
		//int usd = (int) (MyWon/MoneyEx); //��ü�ݾ� ������ ȯ��
		//int remain = (int) (MyWon - usd * MoneyEx);// ������ ������ �ܵ��� �翬�� �Ҽ��������� �ݾ��� �����ؾ���. �Ǽ��� ��� �� ����ó��
		int usd = (int) (MyWon/(MoneyEx + ComPerOne)); // ȯ���޷�	
		double totalcom = usd * ComPerOne; // �� ������
		
		//������ �ø�ó���ϱ�
		int i_totalcom;
		
		if (totalcom != (double) ((int)totalcom)) { //totlacom�� totalcom�� ���� ���� ������ 
			i_totalcom = (int) totalcom + 1; //totalcom�� +1����
		} else {
			i_totalcom = (int) totalcom;
		} 
		
		DecimalFormat df = new DecimalFormat ( " # # #, # # #, # # #, # # #"); //decimal format �����ֱ�
		//DecimalFormat��� Ŭ���� import�ϱ�
		
		System.out.printf("*************************************************************\n");
		System.out.printf("*                        �޸����, ��¥ ����                      *\n");
		
		System.out.printf("�� ������: %s�� --> ��ȭ: %s�޷�, �޷��� ������: %f��\n", df.format(i_totalcom), df.format (usd), ComPerOne);
		
		int remain = (int) (MyWon - usd * MoneyEx - i_totalcom);
		System.out.printf("�� ��ȭȯ���ݾ�: %s�� --> ��ȭ: %s�޷�, ������ â��: %s�� �ܵ�: %s��\n",
				df.format(MyWon), df.format(usd), df.format(i_totalcom), df.format(remain));
		
		
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY/MM/dd HH:mm:ss");
		System.out.printf("\n���� ���� �ð�: %s\n", sdt.format(calt.getTime()));
		
		System.out.printf("*************************************************************\n");
	}
}
