package L04;

public class P06_ppt17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k39_iVal;
		
		for (int i = 0; i < 300; i++) { //0���� 299���� ����
			k39_iVal = 5 * i; 
			
			if (k39_iVal >= 0 && k39_iVal <10) //0���� 9 ����
				System.out.printf("�� %d\n", k39_iVal); // 0���� 9 ����'��'
			else if (k39_iVal >= 10 && k39_iVal <100) //10���� 99 ����
				System.out.printf("�� %d\n", k39_iVal); //10���� 99 ����'��'
			else if (k39_iVal >= 100 && k39_iVal <1000)//100���� 999 ����
				System.out.printf("�� %d\n", k39_iVal);//100���� 999 ���� '��'
			else 
				System.out.printf("õ %d\n", k39_iVal);//�׿ܴ� 'õ'
		}
	}

}
