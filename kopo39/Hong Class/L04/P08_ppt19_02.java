package L04;

public class P08_ppt19_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��¥�� �ٸ��� �غ���
		//��������3
		for (int i = 1; i < 13; i++) { //1������ 12������
			System.out.printf(" %d�� ==> ", i); 
			for (int j = 1; j < 32; j++) { //�Ѵ޿� �ִ� 31���� ������ 32�̸����� ��������
				
				System.out.printf("%d, ", j);
				
				if ((i == 4 || i == 6 || i == 9 || i == 7 || i == 11) && (j == 30)) // 4, 6, 7, 9, 11�����ϋ�, 30��
					break;
				if (i == 2 && j ==28) //2���޿� 28��////����
					break;
			}
			System.out.printf("\n");//�� �� ����
		}
	}
}