package L02;

public class p17 { //클래스선언

	public static void main(String[] args) {  //메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		int k39_year = 0; //year라는 숫자형 변수를 정의하고 0으로 초기화
		int k39_age = 14; //age라는 숫자형 변수를 정의하고 14으로 초기화
		
		System.out.println("결과1 : " + k39_year); //year변수를 화면에 출력
		System.out.println("결과2 : " + k39_age); //age변수를 화면에 출력
		
		k39_year = k39_age + 2000; //변수 age의 값에 2000을 더해서 변수 year에 저장
		k39_age = k39_age + 1; //변수 age에 저장된 값을 1 증가시킨다. 
		
		System.out.println("결과3 : " + k39_year); //다시 year변수를 화면에 출력
		System.out.println("결과4 : " + k39_age); //다시 age변수를 화면에 출력
		
	}

}
