package L04;

public class ppt24_space {
	
	public static void main(String[] args) {
		//���� ����
		for(int i = 0; i < 10; i++) { //i�� 0��Ÿ 10�̸�
			for(int j = 0; j < i; j++)  //j�� 0���� i�ǰ� �̸�
				System.out.printf(" "); // ���� ����Ʈ
				System.out.printf(" %d\n", i); //���ϴ� �� ĭ ��ŭ ��ũ(��ĭ)�� ���
		}
	}
}
