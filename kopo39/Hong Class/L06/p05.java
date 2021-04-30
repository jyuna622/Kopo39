package L06;

public class p05 {

	static int k39_iStatic;//클래스내 전역 변수 static에 주의. 
	//변수는 클래스에서 전역으로 사용하는 static으로 선언 (값이 계속 유지).. 

	
	public static void k39_add(int k39_i) {//void는 리턴값 필요없음
		k39_iStatic++;//변수 값 하나씩 값 증가
		k39_i++;//변수 값 하나씩 값 증가
		System.out.printf("add메소드에서 --> iStatic = [%d] \n", k39_iStatic); //%d자리에 변수값 출력
		System.out.printf("add메소드에서 --> i = [%d] \n", k39_i);//%d자리에 변수값 출력
	}
	
	public static int k39_add2(int k39_i) { //void가 아니기 때문에 return값 줘야함
		k39_iStatic++;//변수 값 하나씩 값 증가
		k39_i++;//변수 값 하나씩 값 증가
		System.out.printf("add메소드에서 --> iStatic = [%d] \n", k39_iStatic);//%d자리에 변수값 출력
		System.out.printf("add메소드에서 --> i = [%d] \n", k39_i);//%d자리에 변수값 출력
		return k39_i; //void가 아니기 때문에 return값 줘야함. 변수를 메소드 내에 선언하여 메개변수로 전달하고 리턴받는 형태로 사용
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k39_iMain;//iMain 변수 생성
		
		k39_iMain = 1; //변수값 1로 초기화
		k39_iStatic = 1;//변수값 1로 초기화
		
		System.out.printf("********************************************\n\n");
		System.out.printf("메소드 호출전 메인에서 --> iStatic = [%d] \n", k39_iStatic); //%d자리에 변수값 출력
		System.out.printf("메소드 호출전 메인에서 --> iMain = [%d] \n\n", k39_iMain);//%d자리에 변수값 출력
		System.out.printf("********************************************\n\n");
		
		k39_add(k39_iMain);
		
		System.out.printf("********************************************\n\n");
		System.out.printf("메소드 호출후 메인에서 --> iStatic = [%d] \n", k39_iStatic); //%d자리에 변수값 출력
		System.out.printf("메소드 호출후 메인에서 --> iMain = [%d] \n\n", k39_iMain);//%d자리에 변수값 출력
		System.out.printf("********************************************\n\n");
		
		k39_iMain = k39_add2(k39_iMain);//이런식으로 값을 전달하고 받는 방법이 이해하기 쉬움.
		//전역변수로 선언후 이함수..아니 메소드 저 메소드에서 변경해 버리면 도대체 어떻게 로직이 되었는지 알아보기 어렵다. 
		
		System.out.printf("********************************************\n\n");
		System.out.printf("메소드 add2 호출후 메인에서 --> iStatic = [%d] \n", k39_iStatic); //%d자리에 변수값 출력
		System.out.printf("메소드 add2 호출후 메인에서 --> iMain = [%d] \n\n", k39_iMain);//%d자리에 변수값 출력
		System.out.printf("********************************************\n\n");
		
	}

}
