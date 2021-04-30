package L06;

public class p17_1_TvRemoconX  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p17_2_TvRemoconX k39_tvremocon = new p17_2_TvRemoconX();
				
		/////////////////////////////////
		//채널
		for (int i = 0; i< 10; i++) {//0에서 10 범위에서 채널 바꾼다
			k39_tvremocon.channel_up(); //채널 올림
			System.out.printf("Channel: [%s] \n", k39_tvremocon.k39_help);
		}
		
		for (int i = 0; i< 10; i++) {//0에서 10 범위에서 채널 바꾼다
			k39_tvremocon.channel_down();//채널 내림
			System.out.printf("Channel: [%s] \n", k39_tvremocon.k39_help);
		}
		
		/////////////////////////////////
		//볼륨
		for (int i = 0; i< 5; i++) {//0에서 5 범위
			k39_tvremocon.vol_up(); //채널 올림
			System.out.printf("Volume: [%s] \n", k39_tvremocon.k39_help);
		}
		
		for (int i = 0; i< 5; i++) {//0에서 5 범위
			k39_tvremocon.vol_down();//채널 내림
			System.out.printf("Volume: [%s] \n", k39_tvremocon.k39_help);
		}
		
		
		/////////////////////////////////
		//배터리
		k39_tvremocon.k39_BatteryCheck();//배터리 체크위한 p17_2 클래스의 k39_BatteryCheck() 메소드 호출 
		System.out.printf("\n***Battery Check: [%s]***\n\n", k39_tvremocon.k39_help); //배터리 체크 출력
		}
		
	}

