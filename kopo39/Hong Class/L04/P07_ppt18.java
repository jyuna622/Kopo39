package L04;

public class P07_ppt18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��������1
		//1���� 31�̰�, 2���� 28��, ... , 12���� 31�̴�.
		
		for (int i = 1; i < 13; i++) { //1������ 12������
			System.out.printf(" %d�� ==> ", i); 
			for (int j = 1; j < 32; j++) { //�Ѵ޿� �ִ� 31���� ������ 32�̸����� ��������
				System.out.printf("%d, ", j);
				
				if(i == 1 && j == 31) break; //1�� = 31�ϱ���
				if(i == 2 && j == 28) break; //2���� ����!! 28�ϱ���
				if(i == 3 && j == 31) break; //3�� = 31�ϱ���
				if(i == 4 && j == 30) break; //4�� = 30�ϱ���
				if(i == 5 && j == 31) break; //5�� = 31�ϱ���
				if(i == 6 && j == 30) break; //6�� = 30�ϱ���
				if(i == 7 && j == 31) break; //7�� = 31�ϱ���
				if(i == 8 && j == 31) break; //8�� ����!! = �ٽ� 31�ϱ���
				if(i == 9 && j == 30) break; //9�� = 30�ϱ���
				if(i == 10 && j == 31) break; //10�� = 31�ϱ���
				if(i == 11 && j == 30) break; //11�� = 30�ϱ���
				if(i == 12 && j == 31) break; //12�� = 31�ϱ���
			}
			System.out.printf("\n"); //�� �� ����
		}
	}
}
