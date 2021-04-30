package L06;

public class p16_1_Elevator3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	p16_2_Elevator3 k39_elev3; //p16_2 클래스 호출하여 elev3으로 재정의
	
	k39_elev3 = new p16_2_Elevator3();  //p16_2 클래스 호출하여 elev3으로 재정의
	System.out.println("엘리베이터 준공 완료");
	
	for (int i = 0; i < 10; i++) { //0에서 10 범위
		k39_elev3.up(); //엘리베이터 올라가는거
		System.out.printf("MSG: Elevator3 [%s] \n", k39_elev3.k39_help); //String.format("%d층입니다.")출력
	}
	
	for (int i = 0; i < 10; i++) { //0에서 10 범위
		k39_elev3.down();//엘리베이터 내려가는거
		System.out.printf("MSG: Elevator3 [%s] \n", k39_elev3.k39_help);//String.format("%d층입니다.")출력
	}
	
	k39_elev3.k39_Repair();//p16_2 클래스의 repair메소드 호출
	System.out.printf("\nMSG: Elevator3 [%s] \n", k39_elev3.k39_help);//String.format("수리중입니다.")출력
		
	}

}
