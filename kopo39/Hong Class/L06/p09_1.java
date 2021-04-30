package L06;

public class p09_1 {

		int k39_ChannelUp = 10;//채널 10채널까지
		int k39_ChannelDown = 1;//채널 10아래까지
		int k39_VolUp = 5;//볼륨 5까지
		int k39_VolDown = 0;//볼륨 0까지
		int k39_chrn = 0;//현재 채널
		int k39_volrn = 0;//현재 볼륨
		String k39_help;//help이라는 스트링 변수 생성
		
		void channel_up() {//채널이 올라감
			if(k39_chrn == k39_ChannelUp) { //채널이, 최상위 채널이라면 
				k39_help = "마지막 채널입니다.";//마지막 채널이라는 String 인쇄
			} else {
				k39_chrn++; //최상채널이 아닐때 한 층씩 올라감
				k39_help = String.format("%d 채널입니다.", k39_chrn); //#채널입니다 format으로 채널 출력 
			}
		}
		
		void channel_down() {//채널이 내려감
			if (k39_chrn == k39_ChannelDown) {////채널이, 최하위 채널이라면
				k39_help = "처음 채널입니다.";//처음 층이라는 String 인쇄
			} else {
				k39_chrn--;//최하채널이 아닐 때 한 층씩 올라감
				k39_help = String.format("%d 채널입니다.", k39_chrn);//#채널입니다 format으로 채널 출력 
			}
		}
		
		void vol_up() {//볼륨이 올라감
			if(k39_volrn == k39_VolUp) { //볼륨이, 최상위라면 
				k39_help = "볼륨크기 최대 입니다.";//마지막 소리라는 String 인쇄
			} else {
				k39_volrn++; //최상볼륨이이 아닐때 하나씩 올라감
				k39_help = String.format("소리 %d 입니다.", k39_volrn); //#볼륨입니다 format으로 볼륨 출력 
			}
		}
		
		void vol_down() {//볼륨이 내려감
			if (k39_volrn == k39_VolDown) {//볼륨이, 최하위볼륨이라면 
				k39_help = "제일 작은 볼륨크기 입니다.";//처음 층이라는 String 인쇄
			} else {
				k39_volrn--;//최하볼륨이 아닐 때 하나씩 올라감
				k39_help = String.format("소리 %d 입니다.", k39_volrn);//#볼륨입니다 format으로 볼륨 출력 
			}
		}
}
