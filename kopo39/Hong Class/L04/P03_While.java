package L04;

public class P03_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2; // ������ 2�ܺ��� ����
		while (i <= 9) { //9�ܱ�����
			int j = 1; //1���� ���ϱ�
			while(j <=9) { //9���� ���ϱ�
				System.out.println(i + " * " + j + " = " + (i*j)); //������ ���
				j++;
			}
			i++; //j�� while loop �������ͼ� �������
		}
	}
}