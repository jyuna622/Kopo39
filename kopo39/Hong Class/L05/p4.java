package L05;

public class p4 {

	public static void main(String[] args) {
		//구구단 인쇄
		for (int k39_i = 1; k39_i < 10; k39_i = k39_i+3 ) { //1단부터 9단까지, 다음단락에 첫번쨰+3의 구구단 
			int k39_ii = k39_i + 1; //2단부터 9단까지, 다음단락에 첫번쨰+3의 구구단 
			int k39_iii = k39_i + 2; //3단부터 9단까지, 다음단락에 첫번쨰+3의 구구단 
			
			System.out.printf("***************\t***************\t***************\n");
			System.out.printf("   구구단 %d 단  \t   구구단 %d 단  \t   구구단 %d 단  \t\n", k39_i, k39_ii, k39_iii); // 구구단 +1 하나씩 순서대로 인쇄
			System.out.printf("***************\t***************\t***************\n");
				
				for (int j = 1; j <10; j++) { // 1부터 9까지 곱하는 것  - (a X b)에서 b에 해당
					System.out.printf("  %d * %d = %d \t  %d * %d = %d \t  %d * %d = %d\n", k39_i, j, k39_i * j, k39_ii, j, (k39_ii) * j, k39_iii, j, (k39_iii) * j);
					//세단씩 차례로 출력
				}
				
			}
	}
}