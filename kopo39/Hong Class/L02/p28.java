package L02;

public class p28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float k39_f = 9.1234567f; //float�� �Ǽ��� - 4����Ʈ
		double k39_d = 9.1234567; //double�� �Ǽ��� - 8����Ʈ
		double k39_d2 = (double) k39_f;//float�� ����� ����ȯ
		
		System.out.printf("f = %20.18f\n", k39_f);//f = 9.123456954956055000
		System.out.printf("d = %20.18f\n", k39_d);//9.1234567���� 20�ڸ������� 0���� ����
		System.out.printf("d2 = %20.18f\n", k39_d2);//f�� ���� ����
	}

}
