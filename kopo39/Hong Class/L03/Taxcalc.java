package L03;

public class Taxcalc {

	public static int taxcal (int val, int rate) {
		
		int ret; //���ϰ�
		
		if (((double) val * (double)rate / 100/0) == val * rate / 100)
			ret = val * rate / 100;
		else
			ret = val * rate/100 + 1; // ������ 1�� �̸� �ݾ��� ����� ������ 1�� �� ���� ��
		
		return ret; //ret���� ������
	}
	
public static void main (String[] args) {
	int val = 271; //���� ���ǰ�
	int taxrate = 3; // ���� 3�ۼ�Ʈ
	
	////////////////////
	//�츮����� ������ ������ �Һ��ڰ����� �����ϴµ�, �Ϻ����� ���������� '�Һ��ڰ�'��� �ٿ����� �򰥸���.
	//100���̶�� ���������� ��� 112���� �޾Ƽ� �ܵ��� �����.
	int tax = taxcal (val, taxrate);
	System.out.printf("************************************\n"); //\n�� ��ĭ ���
	System.out.printf("*            �ܼ� ���� ���            *\n");
	System.out.printf("���� ���ݰ��: %f\n", val * taxrate / 100.0); //�ϳ��� double���� ������ �ϸ� �Ǽ��� ǥ��.
	
	System.out.printf("��������: %d, ����: %d, �������԰���: %d\n", val, tax, val + tax);
			
	System.out.printf("************************************\n");
}
}