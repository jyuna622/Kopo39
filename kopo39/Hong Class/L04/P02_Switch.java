package L04;

public class P02_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jumin = "123456-2222777";
		
		switch (jumin.charAt(7)) {
			case '1': //case 값 1
				System.out.printf("20세기전 태어난 남자 사람\n");
			case '2': 
				System.out.printf("20세기전 태어난 여자 사람\n");
				break;
			case '3': 
				System.out.printf("20세기후 태어난 남자 사람\n");
				break;
			case '4': 
				System.out.printf("20세기후 태어난 여자 사람\n");
				break;
			default : //else와 같음
				System.out.printf("사람\n");
				break;
		}
	}

}
