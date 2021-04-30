package L04;

public class P03_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) {
			if ( i % 3 == 0) //3으로 나눴을떄 나머지 값이 0인 것
				continue;
				//조건이 true가 되어 continue문이 수행되면 반복문의 끝으로 이동한다.
				//break문과는 달리 반복문 전체를 벗어나지 않는다.
			System.out.println(i);
		}
	}
}
