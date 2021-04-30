package L04;

public class ppt24_space {
	
	public static void main(String[] args) {
		//띄어쓰기 연습
		for(int i = 0; i < 10; i++) { //i는 0부타 10미만
			for(int j = 0; j < i; j++)  //j는 0부터 i의값 미만
				System.out.printf(" "); // 띄어쓰기 프린트
				System.out.printf(" %d\n", i); //원하는 띄어쓸 칸 만큼 블랭크(빈칸)를 출력
		}
	}
}
