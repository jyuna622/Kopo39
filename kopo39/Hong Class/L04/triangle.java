package L04;

public abstract class triangle {

	public static void main(String[] args) {
		// TODO Auto-gek39_nerated method stub
		//�Ƕ�̵� ���
		int k39_n, k39_m;
		k39_m=20; //m�� 20 ���� ��
		k39_n=1; //n�� 1 ���� ��
		
		while(true) { //while, true�ϋ��� ���ѷ��� �ݺ����
			for(int i = 0; i < k39_m; i++) //20�ϋ�����
				System.out.printf(" "); //���� ���
			for(int i = 0; i < k39_n; i++) // 1�ϋ�����
				System.out.printf("*"); //�����
			
			System.out.printf("\n");
			// ����� �߽����� ����� �� ĭ �پ��� �ְ�, ���� �� ���� �þ��.

			
			k39_m = k39_m-1; // ����
			k39_n = k39_n+2; // �ٴ��� ��
			
			if (k39_m < 0) //m�� ���� 0�̸��ϋ� break 
				break;
		}
	}

}
