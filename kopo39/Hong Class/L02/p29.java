package L02;

public class p29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k39_i = 91234567; //8�ڸ��� 10����
		float k39_f = (float)k39_i;//int�� float�� ����ȯ
		int k39_i2 = (int) k39_f;//float�� �ٽ� int�� ����ȯ
		
		double k39_d = (double) k39_i;//int�� �ٽ� double�� ����ȯ
		int k39_i3 = (int)k39_d; //double�� �ٽ� int�� ����ȯ
		
		float k39_f2 = 1.666f;//f2�� �ʱ�ȭ
		int k39_i4 = (int)k39_f2;//float�� int�� ����ȯ
		
		System.out.printf("i = %d\n", k39_i);//i�� �״�� ���
		System.out.printf("f = %f i2 = %d\n", k39_f, k39_i2);//float�⶧���� f = 91234568.000000
		System.out.printf("d = %f i3 = %d\n", k39_d, k39_i3);//�ٽ� ����� ����ȯ�ؼ� d = 91234567.000000 
		System.out.printf("(int) %f = %d\n", k39_f2, k39_i4);//�ٽ� ������ ����ȯ (�Ҽ��� ���� ����)		
		
	}

}
