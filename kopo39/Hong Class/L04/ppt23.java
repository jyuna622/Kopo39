package L04;

public class ppt23 {
	
	public static void main(String[] args) {
		// 숫자 읽기 고급
		int k39_iNumVal = 1001034567; // int iNumVal 변수에 숫자 정의
		String k39_sNumVal = String.valueOf(k39_iNumVal); // 숫자를 문자열로 반환
		String k39_sNumVoice = ""; //빈 String 변수
		System.out.printf("==> %s [%d자리]\n", k39_sNumVal, k39_sNumVal.length()); // 숫자, 숫자의 길이 출력
		int k39_i, k39_j;
		
		String[] k39_units = {"영","일","이","삼","사","오","육","칠","팔","구"}; // String 배열 units
		String[] k39_unitX = {"","십","백","천","만","십","백","천","억","십"}; // String 배열 unitX
				
		k39_i = 0;
		k39_j = k39_sNumVal.length()-1; // 숫자길이 -1
				
		while (true) { // 무한 반복
			if (k39_i >= k39_sNumVal.length()) { //  i가 숫자길이 이상일 때
				break; //while loop 끝
			}
			System.out.printf("%s[%s] ", 
					k39_sNumVal.substring(k39_i, k39_i+1), // 숫자 문자열의 i번째 문자 출력
					k39_units[Integer.parseInt(k39_sNumVal.substring(k39_i, k39_i+1))]); 
					// [숫자 문자열의 i번째 문자->int로 변환->그 int 값의 순서에 해당하는 units배열 값] 출력 
					// ex) i=0 이면 sNumVal 의 0번째 문자인 '1' -> int로 변환 -> units배열의 1번째 값인 "일" 출력
					
			if (k39_sNumVal.substring(k39_i, k39_i+1).equals("0")) { 
				// 해당자리가 0일 때는 단위값을 안붙이지만 억, 만 자리는 붙임
				if (k39_unitX[k39_j].equals("만")||k39_unitX[k39_j].equals("억")) { // 억 또는 만 자리일 때
					k39_sNumVoice = k39_sNumVoice + "" + k39_unitX[k39_j]; // 억 또는 만 출력
				} else {
					// 그 외에는 없음.
				}
			} else { // 해당 자리가 0이 아닐 때
				k39_sNumVoice = k39_sNumVoice 
						+ k39_units[Integer.parseInt(k39_sNumVal.substring(k39_i,k39_i+1))]
						+ k39_unitX[k39_j];
				// 해당 자리 숫자와 단위값 붙이기
			}
			k39_i++; k39_j--; //i는 1씩 증가 , j는 1씩 감소
			}
			System.out.printf("\n %s[%s]\n", k39_sNumVal, k39_sNumVoice);
	}
}
