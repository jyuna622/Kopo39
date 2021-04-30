package L04;

public class ppt26 {
	
	public static void main(String[] args) {
		//sin 함수 그래프
		//360도 : 2pi = 1도: x
		//Sin함수는 -1~1까지 나온다
		//양수화하여 +1을 더하면 0~2까지 나온다.
		double k39_fsin;
		for(int i = 0; i < 360; i ++) { //i의범위는 360도 미만까지
			
			k39_fsin = Math.sin(i * 3.141592 / 180); //sin함수 이용, i값 * 파이값 / 180도
			
			System.out.printf("%d sin ==> %f\n", i, k39_fsin);
		}
		
		for(int i = 0; i < 360; i ++) { //360도까지 그려보기
			k39_fsin = Math.sin(i * 3.141592 / 180); //sin함수 이용, i값 * 파이값 / 180도
			
			int k39_ispace = (int)((1.0 - k39_fsin) * 50); //여기에 50배 곱하면 0~100까지 표현할 수 있다.
			for(int k39_j = 0; k39_j < k39_ispace; k39_j++) System.out.printf(" "); 
			System.out.printf("*[%f][%d]\n", k39_fsin, k39_ispace);//그 값만큼 띄어 쓴 다음 별하나 찍어보자
		}
	}
}
