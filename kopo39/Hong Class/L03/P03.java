package L03;

public class P03 {

	public static void main(String[] args) {	
		int k39_ii;	
		//#3.������ ���� (����)
		
		k39_ii = 1000 / 3;   //333.333333...���� ������ ����.
		System.out.printf("#3-1 : %d\n", k39_ii);
		
		k39_ii = 1000 % 3;   //�������� ����Ҷ� --> % ���.
		System.out.printf("#3-2 : %d\n", k39_ii);
		
		//������ �������� ����
		
		for (int i = 0; i < 20; i++) { //i�� ���� ����
			System.out.printf("#3-3 : %d\n", i); //i�� ���
			
			if (((i + 1) % 5) == 0) { //�������� 0�ΰ��� 5������ �ִ�. �� 1�� ���ߴ��� �����غ���
				System.out.printf("\n");
			}
		}		
	}
}
