package L04;

public class P03_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //��Ƽ���� initiate����
		int i = 0; //��Ƽ���� initiate����
		
		while (true) { //while�� true�ϋ��� ���ѷ���
			if (sum > 100) //100�̸�
				break; //break���� ����Ǹ� �Ʒ� �κ��� ������� �ʰ� while���� ������ ���
				i++; 
			sum += i;
		//break����: sum �� 100�� ������ �����. ==> �׷��� i = 14���� ����
		}
		
		System.out.println("i = " + i);
		System.out.println("sum =" + sum);
	}
}