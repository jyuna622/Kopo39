package L03;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo39_MyWon = 1000000;//�鸸�� 
		double MoneyEx = 1238.21; //�޷�ȯ��
		double commission = 0.003; //ȯ��������, 0.3%
		double ComPerOne = MoneyEx * commission; //1$�� ������

		int usd = (int) (kopo39_MyWon/MoneyEx); //��ü�ݾ� ������ ȯ��
		
		double totalcom = usd * ComPerOne; // �޷� x 1$�� ������
		
		System.out.printf("*******************************************************\n");
		System.out.printf("*                      ������ ���                       *\n");
		System.out.printf("�� ������ : %f�� --> ��ȭ: %d �޷�, �ܵ� : %f��\n", totalcom, usd, ComPerOne);
		System.out.printf("*******************************************************\n");
		
	}

}
