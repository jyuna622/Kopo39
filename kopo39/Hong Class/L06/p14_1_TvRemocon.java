package L06;

public class p14_1_TvRemocon {

	static p14_2_TvRemocon k39_Remote1;
	static p14_2_TvRemocon k39_Remote2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k39_Remote1 = new p14_2_TvRemocon();//인스턴스를 생성하여 객체를 연결
		k39_Remote2 = new p14_2_TvRemocon(20, 0, 20, 0, 10, 7); //맞춤 리모콘
		
		
		for(int k39_i = 0; k39_i < 10; k39_i++) { //채널은 10개까지
			k39_Remote2.channel_up(); //채널 클래스를 찍어낸 k39_Remote객체 (얘는 인스턴스를 가지고있음)의 up()메소드
			k39_Remote2.ch_msg("리모콘#2 채널 1씩 올리기");
		}
		
		for (int k39_i = 0; k39_i < 10; k39_i++) {//채널은 10개까지
			k39_Remote2.channel_up(2); //채널 클래스를 찍어낸 k39_Remote객체 (얘는 인스턴스를 가지고있음)의 up()메소드
			k39_Remote2.ch_msg("리모콘#2 채널 2씩 올리기");
		}
		
		for(int k39_i = 0; k39_i < 6; k39_i++) {//볼륨은 5개까지
			k39_Remote2.vol_up(); //채널 클래스를 찍어낸 k39_Remote객체 (얘는 인스턴스를 가지고있음)의 up()메소드
			k39_Remote2.vol_msg("리모콘#2 볼륨 1씩 올리기");
		}
		
		for (int k39_i = 0; k39_i < 6; k39_i++) {//볼륨은 5개까지
			k39_Remote2.vol_up(2); //채널 클래스를 찍어낸 k39_Remote객체 (얘는 인스턴스를 가지고있음)의 up()메소드
			k39_Remote2.vol_msg("리모콘#2 볼륨 2씩 올리기");
		}
		
	}

}
