package L04;

public class P02_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jumin = "123456-2222777";
		
		switch (jumin.charAt(7)) {
			case '1': //case �� 1
				System.out.printf("20������ �¾ ���� ���\n");
			case '2': 
				System.out.printf("20������ �¾ ���� ���\n");
				break;
			case '3': 
				System.out.printf("20������ �¾ ���� ���\n");
				break;
			case '4': 
				System.out.printf("20������ �¾ ���� ���\n");
				break;
			default : //else�� ����
				System.out.printf("���\n");
				break;
		}
	}

}
