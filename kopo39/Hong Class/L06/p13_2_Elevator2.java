package L06;

public class p13_2_Elevator2 {
	public int k39_limit_up_floor;//최상위 층
	public int k39_limit_down_floor;//최하위 층
	public int k39_floor;//현재층
	public String k39_help;//help이라는 스트링 변수 생성
	
	p13_2_Elevator2(){
		k39_limit_up_floor = 10;//최상위 층
		k39_limit_down_floor = 0;//최하위 층
		k39_floor = 1;//현재층
		k39_help = "엘리베이터 기본 준공완료";//help이라는 스트링 변수 생성
	}
	
	p13_2_Elevator2(int up_floor, int d_floor, int in_floor){
		k39_limit_up_floor = up_floor;//최상위 층
		k39_limit_down_floor = d_floor;//최하위 층
		k39_floor = in_floor;//현재층
		k39_help = "엘리베이터 맞춤 준공완료";//help이라는 스트링 변수 생성
	}
	
	void up() {//엘리베이터가 올라감
		if(k39_floor == k39_limit_up_floor) { //층수(floor)가, 최상위 층이라면 
			k39_help = "마지막 층입니다.";//마지막 층이라는 String 인쇄
		} else {
			k39_floor++; //최상층이 아닐때 한 층씩 올라감
			k39_help = String.format("%d층입니다.", k39_floor); //#층입니다 format으로 층수 출력 
		}
	}
	
	void down() {//엘리베이터가 내려감
		if (k39_floor == k39_limit_down_floor) {//층수(floor)가, 최하위 층이라면 
			k39_help = "처음 층입니다.";//처음 층이라는 String 인쇄
		} else {
			k39_floor--;//최하층이 아닐 때 한 층씩 올라감
			k39_help = String.format("%d층입니다.", k39_floor);//#층입니다 format으로 층수 출력 
		}
	}
	
	//처음 몇층인지 지정한다면 그만큼 올라가도록 해봤다
	void up (int k39_u) {
		for (int i = 0; i < k39_u; i++)//0에서 u까지의 범위 설정
			this.up();//this를 쓰면 명확해짐
	}
	//처음 몇층인지 지정한다면 그만큼 내려가도록 해봤다
	void down (int k39_u) {
		for (int i = 0; i < k39_u; i++)//0에서 u까지의 범위 설정
			down();//this를 안써봄
	}
	void msg (String k39_id) {
		System.out.printf("%s --> [%s] 최대층 [%d] 최소층[%d] 현재층[%d]\n", //최대층, 최소층, 현재층 출력
				k39_id, k39_help, k39_limit_up_floor, k39_limit_down_floor, k39_floor); 
	}
	
}
