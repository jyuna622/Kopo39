package L04;

public class P03_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for �� : �ݺ��� ī��Ʈ ������ ������ ����� 
		//while �� : �� ��
		//do-while���� while���� �������� ��{}�� �ּ��� �ѹ��� ����� ���� �����Ѵ�.
		
		/*int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + i;
		}
		System.out.printf("sum %d\n", sum); //Sysout.printf("��� ����",����� ����)
		*/
		
		//for ���չ�
		for (int i = 1; i < 10; i++) { // 1���� 9�ܱ��� - (a X b)���� a�� �ش�
			System.out.printf("**********************\n", i);
			System.out.printf("    ������ %d �� \n", i);
			System.out.printf("**********************\n", i);
			for (int j = 1; j <10; j++) { // 1���� 9���� ���ϴ� ��  - (a X b)���� b�� �ش�
				System.out.printf(" %d * %d = %d \n", i, j, i*j);
			}
		}
	}
}
