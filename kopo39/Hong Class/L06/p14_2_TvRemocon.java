package L06;

public class p14_2_TvRemocon {

	private int k39_ChannelUp;//채널 10채널까지
	private int k39_ChannelDown;//채널 10아래까지
	private int k39_VolUp;//볼륨 5까지
	private int k39_VolDown;//볼륨 0까지
	private int k39_chrn;//현재 채널
	private int k39_volrn;//현재 볼륨
	public String k39_help;//help이라는 스트링 변수 생성
	static int k39_battery;//건전지
	
	p14_2_TvRemocon(){
		k39_ChannelUp = 10;//채널 10채널까지
		k39_ChannelDown = 1;//채널 10아래까지
		k39_VolUp = 5;//볼륨 5까지
		k39_VolDown = 0;//볼륨 0까지
		k39_chrn = 0;//현재 채널
		k39_volrn = 0;//현재 볼륨
		k39_battery = 100;//건전지
		k39_help = "리모콘 기본 설정 완료";
	}
	//볼륨&채널 최대/최소를 주어서 클래스 생성할 수 있도록 해줌 
	p14_2_TvRemocon(int maxVol, int minVol, int maxCh, int minCh, int vol, int ch){
		k39_ChannelUp = maxCh;//최대 채널
		k39_ChannelDown = minCh;//최소 채널
		k39_VolUp = maxVol;//최대 볼륨
		k39_VolDown = minVol;//최소 볼륨
		k39_chrn = ch;//현재 채널
		k39_volrn = vol;//현재 볼륨
		k39_help = "리모콘 맞춤 설정 완료";//help이라는 스트링 변수 생성
	}
	
	void channel_up() {//채널이 올라감
		if(k39_chrn == k39_ChannelUp) { //채널이, 최상위 채널이라면 
			k39_help = "마지막 채널입니다.";//마지막 채널이라는 String 인쇄
		} else {
			k39_chrn++; //최상채널이 아닐때 한 층씩 올라감
			k39_battery--;
			k39_help = String.format("%d 채널입니다.", k39_chrn); //#채널입니다 format으로 채널 출력 
		}
	}
	void channel_down() {//채널이 내려감
		if (k39_chrn == k39_ChannelDown) {////채널이, 최하위 채널이라면
			k39_help = "처음 채널입니다.";//처음 층이라는 String 인쇄
		} else {
			k39_chrn--;//최하채널이 아닐 때 한 층씩 올라감
			k39_battery--;
			k39_help = String.format("%d 채널입니다.", k39_chrn);//#채널입니다 format으로 채널 출력 
		}
	}
	//처음 몇 채널인지 지정한다면 그만큼 올라가도록 해봤다
	void channel_up (int k39_u) {
		for (int i = 0; i < k39_u; i++)//0에서 u까지의 범위 설정
			this.channel_up();//this를 쓰면 명확해짐
	}
	//처음 몇층인지 지정한다면 그만큼 내려가도록 해봤다
	void channel_down (int k39_u) {
		for (int i = 0; i < k39_u; i++)//0에서 u까지의 범위 설정
			channel_down();//this를 안써봄
	}
	
	void vol_up() {//볼륨이 올라감
		if(k39_volrn == k39_VolUp) { //볼륨이, 최상위라면 
			k39_help = "볼륨크기 최대 입니다.";//마지막 소리라는 String 인쇄
		} else {
			k39_volrn++; //최상볼륨이이 아닐때 하나씩 올라감
			k39_battery--;
			k39_help = String.format("소리 %d 입니다.", k39_volrn); //#볼륨입니다 format으로 볼륨 출력 
		}
	}
	
	void vol_down() {//볼륨이 내려감
		if (k39_volrn == k39_VolDown) {//볼륨이, 최하위볼륨이라면 
			k39_help = "볼륨크기 최소 입니다.";//처음 층이라는 String 인쇄
		} else {
			k39_volrn--;//최하볼륨이 아닐 때 하나씩 올라감
			k39_battery--;
			k39_help = String.format("소리 %d 입니다.", k39_volrn);//#볼륨입니다 format으로 볼륨 출력 
		}
	}
	
	//처음 몇층인지 지정한다면 그만큼 올라가도록 해봤다
	void vol_up (int k39_u) {
		for (int i = 0; i < k39_u; i++)//0에서 u까지의 범위 설정
			this.vol_up();//this를 쓰면 명확해짐
	}
	//처음 몇층인지 지정한다면 그만큼 내려가도록 해봤다
	void vol_down (int k39_u) {
		for (int i = 0; i < k39_u; i++)//0에서 u까지의 범위 설정
			vol_down();//this를 안써봄
	}
	
	
	void ch_msg (String k39_id) {
		System.out.printf("%s --> [%s] 최대채널 [%d] 최소채널[%d] 현재채널[%d]\n\n", //최대층, 최소층, 현재층 출력
				k39_id, k39_help, k39_ChannelUp, k39_ChannelDown, k39_chrn); 
	}
	void vol_msg (String k39_id) {
		System.out.printf("%s --> [%s] 최대볼륨 [%d] 최소볼륨[%d] 현재볼륨[%d]\n\n", //최대층, 최소층, 현재층 출력
				k39_id, k39_help, k39_VolUp , k39_VolDown , k39_volrn); 
	}
	
	
	
	
}
