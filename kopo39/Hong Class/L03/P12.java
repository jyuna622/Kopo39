package L03;

public class P12 {

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
		
		if (totalcom != (double) ((int)totalcom)){ //totlacom�� totalcom�� ���̰��� ������ 
			i_totalcom = (int) totalcom + 1; //totalcom�� +1����
		} else {
			i_totalcom = (int) totalcom;
		} 
		
		System.out.printf("*********************************************************************\n");
		System.out.printf("*                         (��Ȯ��) ������ ����ȯ��                         *\n");
		
		System.out.printf("�� ������ : %d�� --> ��ȭ: %d �޷�, �޷��� ������ : %f��\n", i_totalcom, usd, ComPerOne);
		
		int remain = (int) (MyWon - usd * MoneyEx - i_totalcom);
		System.out.printf("�� ��ȭ�S���ݾ� : %d�� --> ��ȭ: %d �޷�, ������â��: %d��, �ܵ� : %d��\n", MyWon, usd, i_totalcom, remain);
		
		System.out.printf("*********************************************************************\n");
		
	}

}