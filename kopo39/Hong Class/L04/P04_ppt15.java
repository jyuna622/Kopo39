package L04;

public class P04_ppt15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k39_a, k39_b;
		
		k39_a = 0;  //��Ƽ���� initiate
		while (true) { //while true ���� ����
			
			k39_b = 0; //initiate
			while(true) {
			System.out.printf("*"); // �� ���
			
			if(k39_a == k39_b) break; //���� ���� ���� ���� ��, break
			k39_b++;
		}
		//k39_b �������� ������
		System.out.printf("\n"); //�� �ٲٱ�
		k39_a++;
		if(k39_a == 30) break; //k39_a�� 30�� �� break.
		}

	}
}