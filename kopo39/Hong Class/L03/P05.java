package L03;

public class P05 {

	public static void main(String[] args) {
		//#5. �Ҽ��� �ڸ��� �ݿø�/����ó��
		int Val_k39 = 14/5; // ���� 2.8�̴�. �Ҽ��� ���� ������ 2, �ݿø��ϸ� 3��.
		System.out.printf("# 5-1 : %d\n", Val_k39); //�׳� �����ϰ� ������ ������.
		
		// ������ �Ǽ�(real number)�� (float, double ���·� ����ȯ) ����� �� �� 0.5�� ���Ѵ���, ������ ����ȯ�� �ϸ� �ݿø�ó���� ��.
		
		double valK39F;
		
		valK39F = 14/5;
		System.out.printf("# 5-2 : %f\n", valK39F);
		
		//�Ѱ��ص� �Ǽ������� ǥ�ø� �ؾ� ����� �Ǽ��� ���´�
		valK39F = 14.0/5;
		System.out.printf("# 5-3 : %f\n", valK39F);
		
		//�Ǽ��� ��꿡�� 0.5 ���غ���
		valK39F = (14.0)/5 + 0.5;
		System.out.printf("# 5-4 : %f\n", valK39F);
		
		//�Ǽ��� ����� �ϰ� ������ ����ȯ�ϱ�
		Val_k39 = (int) ((14.0)/5 + 0.5);
		System.out.printf("# 5-5 : %d\n", Val_k39);
	}

}
