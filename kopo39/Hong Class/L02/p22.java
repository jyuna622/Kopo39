package L02;

import java.util.Scanner; //scanner import해주기

public class p22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k39_scan = new Scanner(System.in); //scanner로 입력받고 import해주기
		
		System.out.println("두자리 정수를 하나 입력해주세요.>"); 
		
		String k39_input = k39_scan.nextLine();//다음 라인을 스캔함
		int k39_num = Integer.parseInt(k39_input); //입력받은 문자열을 숫자로 변환하여 num변수에 저장
		
		System.out.println("입력내용 : " + k39_input);//스캔한 라인을 출력해줌
		System.out.printf("num = %d %n", k39_num);//스캔받은 내용을 %d 자리에 출력. %n 은 \n과 같지만 실무에서는 관습적으로 \n을 많이 사용한다.


	}

}
