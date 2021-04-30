package L04;

public class P05_ppt16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k39_iL;
		double k39_iD = 10/3.0;
		k39_iL = 10/3;
		
		//int와 double은 정수형연산과 실수형 연산이다.
		if(k39_iL == k39_iD)
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[%f][%f]\n", (double)k39_iL, k39_iD);//int를 double로 강변환
	
		//단지 유효숫자까지 표시된 것 뿐이지 다르다.
		if(k39_iD == 3.333333) //3.333333은 실수이기때문에 double에 포함 맞음.
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[3.333333][%f]\n", k39_iD);
		
		k39_iD = (int)k39_iD; //double을 int로 강변환
		if(k39_iL == k39_iD) //서로 값이 같을 떄를 의미
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[%f][%f]\n", (double)k39_iL, k39_iD);
	
		System.out.printf("int로 인쇄[%d][%f]\n", k39_iL, k39_iD);
		System.out.printf("double로 인쇄[%f][%f]\n", (double) k39_iL, k39_iD); //int를 double로 강변환
	
		char a = 'c'; //char 1개는 a == ‘c’로 비교가능
		
		if(a == 'b') //char a 가 'b'일때
			System.out.printf("a는 b이다\n");
		if(a == 'c') //char a 가 'c'일때
			System.out.printf("a는 c이다\n");
		if(a == 'd')//char a 가 'd'일때
			System.out.printf("a는 d이다\n");
		
		String aa = "abcd"; //abcd는 문장이니 string으로 받아줌
		if (aa.equals("abcd")) //String은 클래스함수 .equal(“ “)을 사용
			System.out.printf("aa는 abcd이다\n");
		else System.out.printf("aa는 abcd이 아니다\n");
		
		boolean bb = true; //boolean은 true, false만 판별
			
		if (!!bb) //!!는 아니고 아니다 의미
			System.out.printf("bb가 아니고 아니면 참이다\n");
		else
			System.out.printf("bb가 아니고 아니면 거짓이다\n");
		
	}

}
