package L06;

public class p17_2_TvRemoconX extends p14_2_TvRemocon {

	void k39_BatteryCheck() { //배터리량 확인을 위한 메소드 추가
		k39_help = String.format("Current Battery: %s%%", p14_2_TvRemocon.k39_battery);//이 format으로 출력됨
	}
}
