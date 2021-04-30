package L06;

public class p10_2 {
	
	//클래스 메소드는 아귀먼트(argment,매개변수) 형식이나 갯수가 다르면 이름은 동일하게 사용하여 편리하게 사용할 수 있는데, 
	//이따위 짓을 메소드 오버로딩(Overloading)이라 한다.
	
	public int k39_sum (int a, int b) {//2개형 덧셈 메소드
		return a+b;//a+b을 계산해줌
	}
	
	public int k39_sum (int a, int b, int c) {//3개형 덧셈 메소드
		return a+b+c;//a+b+c을 계산해줌
	}
	
	public int k39_sum (int a, int b, int c, int d) {//4개형 덧셈 메소드
		return a+b+c+d;//a+b+c+d을 계산해줌
	}
	
	public double k39_sum (double a, double b) {//더블형 덧셈 메소드
		return a+b;//a+b을 계산해줌
	}
	
}
