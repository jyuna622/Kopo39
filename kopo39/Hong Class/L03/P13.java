package L03;

import java.text.DecimalFormat;

public class P13 { 

	public static void main(String[] args) {
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
		//������ �ø�ó���ϱ�
		if (totalcom != (double) ((int)totalcom)) {
			i_totalcom = (int) totalcom + 1;
		} else {
			i_totalcom = (int) totalcom;
		} 
		
		DecimalFormat df = new DecimalFormat ( " # # #, # # #, # # #, # # #");
		//DecimalFormat��� Ŭ���� import�ϱ�
		
		System.out.printf("*************************************************************\n");
		System.out.printf("*                        �޸����, ��¥ ����                      *\n");
		
		System.out.printf("�� ������: %s�� ==> ��ȭ: %s�޷�, �޷��� ������: %f��\n", 
				df.format(i_totalcom), 
				df.format (usd), 
				ComPerOne);
		
		int remain = (int) (MyWon - usd * MoneyEx - i_totalcom);
		System.out.printf("�� ��ȭȯ���ݾ�: %s�� --> ��ȭ: %s�޷�, ������ â��: %s�� �ܵ�: %s��\n",
				df.format(MyWon), df.format(usd), df.format(i_totalcom), df.format(remain));
		
	}
}
