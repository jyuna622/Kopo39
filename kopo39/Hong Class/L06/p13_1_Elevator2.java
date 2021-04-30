package L06;

public class p13_1_Elevator2 {
	
	static p13_2_Elevator2 k39_elev1;
	static p13_2_Elevator2 k39_elev2;
	static p13_2_Elevator2 k39_elev3;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k39_elev1 = new p13_2_Elevator2(); //기본 엘리베이터
		k39_elev2 = new p13_2_Elevator2(20, 1, 8); //맞춤 엘리베이터1
		k39_elev3 = new p13_2_Elevator2(50, -3, 5); //맞춤 엘리베이터2
		
		for (int i = 0; i < 20; i++) {
			k39_elev1.up();
			k39_elev1.msg("1번 엘리베이터 한층씩 오르기");
			//elev2.up();
			//elev2.msg("2번 엘리베이터 한층씩 오르기");
			//elev3.up();
			//elev3.msg("3번 엘리베이터 한층씩 오르기");
		}
		for (int i = 0; i < 20; i++) {
			k39_elev1.up(2);
			k39_elev1.msg("1번 엘리베이터 2층씩 오르기");
			//elev2.up(2);
			//elev2.msg("2번 엘리베이터 2층씩 오르기");
			//elev3.up(2);
			//elev3.msg("3번 엘리베이터 2층씩 오르기");
		}
		for (int i = 0; i < 20; i++) {
			k39_elev1.up(3);
			k39_elev1.msg("1번 엘리베이터 3층씩 오르기");
			//elev2.up(3);
			//elev2.msg("2번 엘리베이터 3층씩 오르기");
			//elev3.up(3);
			//elev3.msg("3번 엘리베이터 3층씩 오르기");
		}
	}

}
