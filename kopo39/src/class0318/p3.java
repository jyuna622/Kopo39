package class0318;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		/* �����ڵ� �ѱ��� 0xAC00 ���κ��� �ʼ� 19��, �߻�21��, ����28���� �̷���� 
		 * �̵��� ������ 11,172���� ���ڸ� ���´�.
		�ʼ� = ((X - 0xAC00) / 28) / 21
		�߼� = ((X - 0xAC00) / 28) % 21
		���� = (X - 0xAC00) % 28
		�� = 0x1100
		�� = 0x1101
		�� = 0x1102 
		...	
		�� = 0x1112 �̷������� ���� (18�� �ƴ϶� 12�� ������ 16������ ����ϱ⶧��)
		*/
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine(); //"�ȳ��ϼ���";
		String[] CHO = {"��","��","��","��","��","��","��","��","��", "��","��","��","��","��","��","��","��","��","��"};
		String[] JOONG = {"��","��","��","��","��","��","��","��","��","��", "��","��","��","��","��","��","��","��","��","��","��"};
		String[] JONG = {"","��","��","��","��","��","��","��","��","��","��","��", "��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
		
		
		for(int i = 0; i < text.length(); i++) { 
			char uniVal = text.charAt(i); // �ѱ��� ��츸 �����ؾ� �ϱ� ������ 0xAC00���� �Ʒ��� ������ �����Ѵ� 
				if(uniVal >= 0xAC00) { 
				uniVal = (char)(uniVal - 0xAC00); 
			
				char cho = (char)(uniVal/28/21); 
				char joong = (char) ((uniVal)/28%21); 
				char jong = (char) (uniVal % 28); // ������ ù��°�� ä���̱� ������ 
				System.out.print(CHO[cho] + JOONG[joong] + JONG[jong]); 
			
				} else { 
					System.out.println(); 
			}
		}
	} 			
}



		
