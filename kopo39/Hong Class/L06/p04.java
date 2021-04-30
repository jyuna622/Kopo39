package L06;

public class p04 {

	public static void k39_iamMethod() {//클래스명
		System.out.printf("메소드라 불러줘요~~\n");//내용 프린트
	}
	
	public static void main(String[] args) {//메인 클래스
		// TODO Auto-generated method stub
		p04.k39_iamMethod();//함수를 method라고 지칭함 

		k39_iamMethod();//일단 자기 클래스 안에 함수를 정의하면 함수이름만으로 불러올 수 있다
	}
}
