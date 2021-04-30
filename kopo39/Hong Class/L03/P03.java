package L03;

public class P03 {

	public static void main(String[] args) {	
		int k39_ii;	
		//#3.정수형 연산 (버림)
		
		k39_ii = 1000 / 3;   //333.333333...으로 나오지 않음.
		System.out.printf("#3-1 : %d\n", k39_ii);
		
		k39_ii = 1000 % 3;   //나머지를 계산할땐 --> % 사용.
		System.out.printf("#3-2 : %d\n", k39_ii);
		
		//나머지 연산자의 응용
		
		for (int i = 0; i < 20; i++) { //i의 범위 설정
			System.out.printf("#3-3 : %d\n", i); //i값 출력
			
			if (((i + 1) % 5) == 0) { //나머지가 0인것은 5번마다 있다. 왜 1을 더했는지 생각해보기
				System.out.printf("\n");
			}
		}		
	}
}
