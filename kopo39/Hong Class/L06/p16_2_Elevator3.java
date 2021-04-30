package L06;

public class p16_2_Elevator3 extends p13_2_Elevator2 { //아래 Elevator3 클래스는 Elevator2를 상속받아 만듦.
								  //Elevator2에서 사용 가능한(Public등) 함수 변수를 그대로 가져다 사용 가능하다.

	void k39_Repair() {
		k39_help = String.format("수리중입니다.");
	}
	
	void up() { //엘리베이터 올라감
		if (k39_floor >= k39_limit_up_floor) {
			k39_help = "마지막 층입니다.";
		} else { 
			k39_floor = k39_floor + 2; //최상층이 아닐때 두층씩 올라감
			k39_help = String.format("%d층입니다.", k39_floor);
		}
		
		this.down(); //이렇게 하면 두칸 올라가고 한칸 내려가는 결과가 나옴
	}
	
	void down() {//엘베 내려감
		super.down();
		//super(): 자식 클래스에서 상속받은 부모 클래스의 멤버변수를 참조할때 사용
		//this(): 현재 클래스에 정의된 생성자를 부를때 사용됩니다.
		
		System.out.printf("\n클래스 안에서 찍고있는 MSG [%s]\n", this.k39_help);
	}
	
}
