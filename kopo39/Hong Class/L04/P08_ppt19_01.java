package L04;

public class P08_ppt19_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��¥�� �ٸ��� �غ���
		//��������2 
		
		for (int i = 1; i < 13; i++) { //1������ 12������
			System.out.printf(" %d�� ==> ", i); 
			for (int j = 1; j < 32; j++) { //�Ѵ޿� �ִ� 31���� ������ 32�̸����� ��������
				
				System.out.printf("%d, ", j);
				
				if (i == 4 || i == 6 || i == 9 || i == 7 || i == 11) { // 4, 6, 7, 9, 11�����ϋ�, 30��
					if ( j == 30) //30��
						break;//������, 
				}
				
				if (i == 2) { //2�����϶��� 28��
					if(j == 28) //28��
						break;//����
				}
			}
			System.out.printf("\n");//�� �� ����
		}
	}
}