package L03;

public class P09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo39_MyWon = 1000000;//�鸸�� 
		double MoneyEx = 1238.21; //�޷�ȯ��
		double commission = 0.003; //ȯ��������, 0.3%
		
		int usd = (int) (kopo39_MyWon/MoneyEx); //��ü�ݾ� ������ ȯ��
		int remain = (int) (kopo39_MyWon - usd * MoneyEx);// ������ ������ �ܵ��� �翬�� �Ҽ��������� �ݾ��� �����ؾ���. �Ǽ��� ��� �� ����ó��
		
		System.out.printf("***************************************************\n");
		System.out.printf("*                   ��������� ���                    *\n");
		System.out.printf("�� ��ȭȯ���ݾ� : %d�� --> ��ȭ: %d �޷�, �ܵ� : %d��\n", kopo39_MyWon, usd, remain);
		
		System.out.printf("***************************************************\n");
	}

}
