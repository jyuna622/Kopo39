package L04;

public class P05_ppt16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k39_iL;
		double k39_iD = 10/3.0;
		k39_iL = 10/3;
		
		//int�� double�� ����������� �Ǽ��� �����̴�.
		if(k39_iL == k39_iD)
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[%f][%f]\n", (double)k39_iL, k39_iD);//int�� double�� ����ȯ
	
		//���� ��ȿ���ڱ��� ǥ�õ� �� ������ �ٸ���.
		if(k39_iD == 3.333333) //3.333333�� �Ǽ��̱⶧���� double�� ���� ����.
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[3.333333][%f]\n", k39_iD);
		
		k39_iD = (int)k39_iD; //double�� int�� ����ȯ
		if(k39_iL == k39_iD) //���� ���� ���� ���� �ǹ�
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[%f][%f]\n", (double)k39_iL, k39_iD);
	
		System.out.printf("int�� �μ�[%d][%f]\n", k39_iL, k39_iD);
		System.out.printf("double�� �μ�[%f][%f]\n", (double) k39_iL, k39_iD); //int�� double�� ����ȯ
	
		char a = 'c'; //char 1���� a == ��c���� �񱳰���
		
		if(a == 'b') //char a �� 'b'�϶�
			System.out.printf("a�� b�̴�\n");
		if(a == 'c') //char a �� 'c'�϶�
			System.out.printf("a�� c�̴�\n");
		if(a == 'd')//char a �� 'd'�϶�
			System.out.printf("a�� d�̴�\n");
		
		String aa = "abcd"; //abcd�� �����̴� string���� �޾���
		if (aa.equals("abcd")) //String�� Ŭ�����Լ� .equal(�� ��)�� ���
			System.out.printf("aa�� abcd�̴�\n");
		else System.out.printf("aa�� abcd�� �ƴϴ�\n");
		
		boolean bb = true; //boolean�� true, false�� �Ǻ�
			
		if (!!bb) //!!�� �ƴϰ� �ƴϴ� �ǹ�
			System.out.printf("bb�� �ƴϰ� �ƴϸ� ���̴�\n");
		else
			System.out.printf("bb�� �ƴϰ� �ƴϸ� �����̴�\n");
		
	}

}
