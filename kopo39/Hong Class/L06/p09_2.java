package L06;

public class p09_2 {

	private static int k39_inVal; //변수는 클래스에서 전역으로 사용하는 static으로 선언 (값이 계속 유지)..
	
	public static void k39_up() {
		k39_inVal++;//inVal 값이 하나씩 증가
		System.out.printf("난 그냥 메소드 [%d]\n\n", k39_inVal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		k39_inVal = 0; //자기내부 변수사용 
		p09_1 k39_Remote; //클래스를 받아 객체를 만듬
		
		k39_Remote = new p09_1(); //인스턴스를 생성하여 객체를 연결
		
		k39_up();//현재 소스 내 메소드
		
		for(int k39_i = 0; k39_i < 10; k39_i++) { //채널은 10개까지
			k39_Remote.channel_up(); //채널 클래스를 찍어낸 k39_Remote객체 (얘는 인스턴스를 가지고있음)의 up()메소드
			System.out.printf("MSG [%s]\n", k39_Remote.k39_help); //정해준 format으로 string help 출력됨
		}
		
		for (int k39_i = 0; k39_i < 10; k39_i++) {//채널은 10개까지
			k39_Remote.channel_down();//채널 클래스를 찍어낸 k39_Remote객체 (얘는 인스턴스를 가지고있음)의 up()메소드
			System.out.printf("MSG [%s]\n", k39_Remote.k39_help);//정해준 format으로 string help 출력됨
		}
		
		for(int k39_i = 0; k39_i < 6; k39_i++) {//볼륨은 5개까지
			k39_Remote.vol_up(); //채널 클래스를 찍어낸 k39_Remote객체 (얘는 인스턴스를 가지고있음)의 up()메소드
			System.out.printf("MSG [%s]\n", k39_Remote.k39_help);//정해준 format으로 string help 출력됨
		}
		
		for (int k39_i = 0; k39_i < 6; k39_i++) {//볼륨은 5개까지
			k39_Remote.vol_down();//채널 클래스를 찍어낸 k39_Remote객체 (얘는 인스턴스를 가지고있음)의 up()메소드
			System.out.printf("MSG [%s]\n", k39_Remote.k39_help);//정해준 format으로 string help 출력됨
		}
		
	}

}
