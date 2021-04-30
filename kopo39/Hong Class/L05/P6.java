package L05;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k39_Weekday = 6; //2022년 1월1일은 토요일은 7번째이니 --> 5. 그래야 1일이 금욜부터 시작함
		
		int [] k39_End = {31,29,31,30,31,30,31,31,30,31,30,31}; // Array로 이번년도 마지막 일 넣어주기
		
		for (int k39_Mon = 0; k39_Mon < 12; k39_Mon++) { //월 표현
			System.out.printf("\n\n         %d월\n", k39_Mon+1); //월 +1 (1~12월) 프린트
			System.out.printf("======================\n");
			System.out.printf("일  월  화  수  목  금  토\n");
			
			for (int a = 0; a < k39_Weekday; a++) { // 1월 1일이 금요일이니 금요일까지의 요일만큼
				System.out.print("   "); //빈칸 출력하여 조정
			}	
			
			for (int i = 1; i <= k39_End[k39_Mon]; i++) { //1부터 end배열의 값까지 (각 월의 마지막 일에 해당함
				
				System.out.printf(" %2s", i); // %2.9s 간격만큼 스페이스 + 해당 숫자 차례로 array
	
				k39_Weekday++; //날짜 출력후 요일+1
				if (k39_Weekday == 7) { //요일이 7이 되면 (=일요일이 되면) 한칸씩 띄우기
					System.out.println(" ");
					k39_Weekday = 0; //Weekday = 0으로 초기와 --> 일요일(0)로 옴.
				}
			}
		}
	}
}