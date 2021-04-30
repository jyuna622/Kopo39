package L05;

public class p5_gugudan2 {

	public static void main(String[] args) {
		//구구단 인쇄
		for (int k39_i = 1; k39_i < 4; k39_i++ ) { 
			//1단부터 9단까지, 다음단락에 첫번쨰+3의 구구단 
			//하지만 다음단락의 구구단이 2단이고 그 다음 단락이 3단이니, 범위는 4까지만 함
			
				System.out.printf("***************\t***************\t***************\n");
				System.out.printf("   구구단 %d 단  \t   구구단 %d 단  \t   구구단 %d 단  \t\n", k39_i, k39_i+3, k39_i+6); // 구구단 +3 하나씩 순서대로 인쇄
				System.out.printf("***************\t***************\t***************\n");	
				
			for (int j = 1; j <10; j++) { // 1부터 9까지 곱하는 것  - (a X b)에서 b에 해당
				System.out.printf("  %d * %d = %d \t  %d * %d = %d \t  %d * %d = %d\n", k39_i, j, k39_i * j, k39_i+3, j, (k39_i+3) * j, k39_i+6, j, (k39_i+6) * j);
				//세단씩 차례로 출력
			}
			
		}
	}
}