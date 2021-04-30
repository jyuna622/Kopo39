package L04;

public class P03_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //인티져를 initiate해줌
		int i = 0; //인티져를 initiate해줌
		
		while (true) { //while이 true일떄의 무한루프
			if (sum > 100) //100미만
				break; //break문이 실행되면 아래 부분이 실행되지 않고 while문을 완전히 벗어남
				i++; 
			sum += i;
		//break조건: sum 이 100이 넘으면 멈춰라. ==> 그래서 i = 14에서 멈춤
		}
		
		System.out.println("i = " + i);
		System.out.println("sum =" + sum);
	}
}