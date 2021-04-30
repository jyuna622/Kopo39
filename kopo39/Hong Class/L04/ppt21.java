package L04;

public class ppt21 {
	/// Array 이용 비교
	// 비정형 비교(룰이 애매한)는 배열을 이용하는 것도 한 방법임
	public static void main(String[] args) {
		int[] k39_iLMD = {31,28,31,30,31,30,31,31,30,31,30,31};
		// 배열은 0부터 시작한다는 것에 유의 LastMonthDate
		// iLMD[0] ~ iLMD[11]
		
		for (int i = 1; i < 13; i++) { // 1월부터 12월까지
			System.out.printf(" %d월 =>", i); // 1~12
			for (int j = 1; j < 32; j++) { // 최대 31일까지 있음 31까지 LOOP실행
				System.out.printf("%d", j); // j 1~31 
				if (k39_iLMD[i-1] == j) break; // 12까지임
				System.out.printf(","); // 마지막일 콤마 안찍기
			}
			System.out.printf("\n"); // 한줄 띄우기
		}
	}
}
