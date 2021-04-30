package L06;

public class p07_Elevator {

	/*
	 * 클래스는 앞서 언급한데로, c의 구조체의 확대, 즉 변수와 함수(메소드)로 구성 어느 클래스의 속한 변수와 함수를 가져다 쓰는데 중점
	 * 클래스를 가져다 사용, 클래스(붕어빵틀)을 그대로 대입한 것을 객체(Object)라 하고 클래스를 실행시켜 사용 가능한 클래스 변수(?)를
	 * 인스턴스라 한다
	 */
	
	
		int k39_limit_up_floor = 10;//최상위 층
		int k39_limit_down_floor = 0;//최하위 층
		int k39_floor = 1;//현재층
		String k39_help;//help이라는 스트링 변수 생성
		
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
}
