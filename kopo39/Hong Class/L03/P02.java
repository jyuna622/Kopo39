package L03;

public class P02 {

	public static void main(String[] args) {
		//#2. 누적하기, 합구하기
		
		int sum; //c는 맨 앞에서만 선언해야하지만. C++,java는 필요할 때 선언해도 됨. BUT 지저분함
		sum = 0; //누적, 루프는 꼭 초기화
		
		//1부터 100까지 더해보자. for statement 사용
		for (int i = 1; i < 101; i++) {
		sum = sum + i;
		}
		System.out.printf("#2 : %d\n", sum);
		//평균을 처리한다면 여기서 다 더한다음에 해야됨
		System.out.printf("#2-2 : %d\n", sum/100);
		
		//배열 응용
		
		int[] v = {1, 2, 3, 4, 5};
		int vSum;
		vSum = 0;
		
		for (int i = 0; i < 5; i++) {
		vSum = vSum + v[i];
		}
		
		System.out.printf("#2-3 : %d\n", vSum);
	}

}
