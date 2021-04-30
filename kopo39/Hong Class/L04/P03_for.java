package L04;

public class P03_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for 문 : 반복시 카운트 변수를 유용히 쓸경우 
		//while 문 : 그 외
		//do-while문은 while문의 변형으로 블럭{}이 최소한 한번은 수행될 것을 보장한다.
		
		/*int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + i;
		}
		System.out.printf("sum %d\n", sum); //Sysout.printf("출력 서식",출력할 내용)
		*/
		
		//for 복합문
		for (int i = 1; i < 10; i++) { // 1에서 9단까지 - (a X b)에서 a에 해당
			System.out.printf("**********************\n", i);
			System.out.printf("    구구단 %d 단 \n", i);
			System.out.printf("**********************\n", i);
			for (int j = 1; j <10; j++) { // 1부터 9까지 곱하는 것  - (a X b)에서 b에 해당
				System.out.printf(" %d * %d = %d \n", i, j, i*j);
			}
		}
	}
}
