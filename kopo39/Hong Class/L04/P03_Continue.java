package L04;

public class P03_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) {
			if ( i % 3 == 0) //3���� �������� ������ ���� 0�� ��
				continue;
				//������ true�� �Ǿ� continue���� ����Ǹ� �ݺ����� ������ �̵��Ѵ�.
				//break������ �޸� �ݺ��� ��ü�� ����� �ʴ´�.
			System.out.println(i);
		}
	}
}
