package L04;

public class ppt20 { 
	/// case문 비교
	
	public static void main(String[] args) {
		for (int i = 1; i < 13; i++) { // 1월부터 12월까지
			System.out.printf(" %d월 =>", i); // 1~12월
			k39_LOOP: for (int j = 1; j < 32; j++) { // 최대 31일까지 있음 31까지 LOOP실행
				
				System.out.printf("%d,", j); // j프린트
				
				switch (i) { // i범위내에서 switch loop
				case 4: case 6: case 9: case 11: // 4,6,9,11월
					if (j == 30) 
						break k39_LOOP; // LOOP표시자가 없으면 엉뚱한 결과나옴
					break;
				case 2: // 2월
					if (j == 28) break k39_LOOP; // j가 28이면 LOOP끝남
					break;
				}
			}
			System.out.printf("\n");
		}
	}
}
