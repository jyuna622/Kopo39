package L04;

public class ppt26 {
	
	public static void main(String[] args) {
		//sin �Լ� �׷���
		//360�� : 2pi = 1��: x
		//Sin�Լ��� -1~1���� ���´�
		//���ȭ�Ͽ� +1�� ���ϸ� 0~2���� ���´�.
		double k39_fsin;
		for(int i = 0; i < 360; i ++) { //i�ǹ����� 360�� �̸�����
			
			k39_fsin = Math.sin(i * 3.141592 / 180); //sin�Լ� �̿�, i�� * ���̰� / 180��
			
			System.out.printf("%d sin ==> %f\n", i, k39_fsin);
		}
		
		for(int i = 0; i < 360; i ++) { //360������ �׷�����
			k39_fsin = Math.sin(i * 3.141592 / 180); //sin�Լ� �̿�, i�� * ���̰� / 180��
			
			int k39_ispace = (int)((1.0 - k39_fsin) * 50); //���⿡ 50�� ���ϸ� 0~100���� ǥ���� �� �ִ�.
			for(int k39_j = 0; k39_j < k39_ispace; k39_j++) System.out.printf(" "); 
			System.out.printf("*[%f][%d]\n", k39_fsin, k39_ispace);//�� ����ŭ ��� �� ���� ���ϳ� ����
		}
	}
}
