package L03;

public class P06_taxcal {

public static int taxcal (int val, int rate) { //���ο��� �� ������ ���ݰ��
		int k39ret;
		
		if (((double) val * (double)rate / 100/0) == val * rate / 100)
			k39ret = val * rate / 100;
		else
			k39ret = val * rate/100 + 1; // ������ 1�� �̸� �ݾ��� ����� ������ 1�� �� ���� ��
		return k39ret; //ret���� ������
	}
	
public static void main (String[] args) {
	
	int taxrate = 10; // ���� 10�ۼ�Ʈ
	int aftertaxprice = 1234; // ���ο��� �������� �Һ��ڰ� 1234���� �Ǹ��ϱ����
	int val = (int) (aftertaxprice / 1.1); //���� ���ǰ�
			
	int tax = taxcal (val, taxrate);
	System.out.printf("************************************\n"); //\n�� ��ĭ ���
	System.out.printf("*            �ܼ� ���� ���            *\n");
	System.out.printf("���� ���ݰ��: %f\n", val * taxrate / 100.0); //�ϳ��� double���� ������ �ϸ� �Ǽ��� ǥ��.
	
	System.out.printf("��������: %d, ����: %d, �������԰���: %d\n", val, tax, val + tax);
			
	System.out.printf("************************************\n");
}
}
