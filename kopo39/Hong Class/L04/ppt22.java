package L04;

public class ppt22 {
	// 범위주기, 숫자 자르기
	public static void main(String[] args) {
		String[] k39_units = {"영","일","이","삼","사","오","육","칠","팔","구"}; // String으로 숫자 units array 받기
		for (int i = 0; i < 101; i++) { // i범위는 0부터 100까지
			
			if (i >= 0 && i < 10) { // i는 0이상, 그리고 10미만
				System.out.printf("일의 자리: %s\n", k39_units[i]); // 0 부터 9까지 프린트됨
			} else if (i >=10 && i < 100) { // i는 10이상, 100미만
				int k39_i10, k39_i0; // i0, i10
				k39_i10 = i / 10; // 십의자리  
				k39_i0 = i % 10; // 일의자리 
				if (k39_i0 == 0) { // i0 이 0일때
					System.out.printf("십의 자리 : %s십\n", k39_units[k39_i10]); 
					//십의 자리 픤트 됨
				} else { // 그 외의 경우
					System.out.printf("십의 자리 : %s십%s\n", k39_units[k39_i10], k39_units[k39_i0]);
					// ~10까지는 : 일,이,삼,사,~~~구
					//10~ : 일십일,일십이,~~일십구,이십, 
			        // 이십일,이십이,~~이십구,삼십

				}
			} else { 
				System.out.printf("==> %d\n", i); // ==> i는 마지막 값을 출력
			}
		}
	}
}