package L03;

public class P02 {

	public static void main(String[] args) {
		//#2. �����ϱ�, �ձ��ϱ�
		
		int sum; //c�� �� �տ����� �����ؾ�������. C++,java�� �ʿ��� �� �����ص� ��. BUT ��������
		sum = 0; //����, ������ �� �ʱ�ȭ
		
		//1���� 100���� ���غ���. for statement ���
		for (int i = 1; i < 101; i++) {
		sum = sum + i;
		}
		System.out.printf("#2 : %d\n", sum);
		//����� ó���Ѵٸ� ���⼭ �� ���Ѵ����� �ؾߵ�
		System.out.printf("#2-2 : %d\n", sum/100);
		
		//�迭 ����
		
		int[] v = {1, 2, 3, 4, 5};
		int vSum;
		vSum = 0;
		
		for (int i = 0; i < 5; i++) {
		vSum = vSum + v[i];
		}
		
		System.out.printf("#2-3 : %d\n", vSum);
	}

}
