package L04;

import java.util.Scanner;

public class P01_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt(); //������ �Է� ����
		
		if (score >= 90)  {// ������ 90�� �̻��� ��
			System.out.println("A����Դϴ�");
		} else if (score >= 80 && score < 90){ // 80 �̻� 90�̸�
			System.out.println("B����Դϴ�");
		} else if (score >= 70 && score < 80){ // 70 �̻� 80�̸�
			System.out.println("C����Դϴ�");
		} else { // �� ���� ��� = 0
			System.out.println("F����Դϴ�");
		}
	}
}
