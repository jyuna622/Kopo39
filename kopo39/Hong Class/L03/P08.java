package L03;

public class P08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] item = {"������  ", "���Ͻ�  ", "�Ե�����", "����   ", "��극  "};// �迭�� ������� �Էµ�
		int[] price = {1000, 2000, 3000, 2500, 1450}; //��ǰ����(�ܰ�)
		int[] amount = {10, 2, 1, 3, 5}; //����
		double taxRate = 0.1;
		int totalSum = 0;
		
		System.out.printf("*****************************************\n");
		System.out.printf("*              ���� �� ���ڵ�               *\n");
		System.out.printf(" �� ��\t    �� ��\t\t�� ��\t      �� ��\n"); //"\t"���� tab�� �̿��Ͽ� ���� �����ϰ� ����
		for (int i = 0; i < item.length; i++) {
			int sum = price[i] * amount[i];
			totalSum = totalSum + sum;
			System.out.printf(" %.5s\t %7d\t %2d\t %9d\n", item[i], price[i], amount[i], sum); 
		}
		System.out.printf("*****************************************\n");
		System.out.printf("* ���� �ݾ� :\t %25d\n", totalSum);
		
		int total_net_price = (int) (totalSum / (1 + taxRate));
		System.out.printf("  �����ݾ� :\t %25d\n", total_net_price);
		int tax = totalSum - total_net_price;
		System.out.printf("  ��  �� :\t %25d\n", tax); //%25d�� �����Ͽ� ���� ����
	}

}
