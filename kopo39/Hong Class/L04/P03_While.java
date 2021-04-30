package L04;

public class P03_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2; // 구구단 2단부터 시작
		while (i <= 9) { //9단까지만
			int j = 1; //1부터 곱하기
			while(j <=9) { //9까지 곱하기
				System.out.println(i + " * " + j + " = " + (i*j)); //구구단 출력
				j++;
			}
			i++; //j의 while loop 빠져나와서 해줘야함
		}
	}
}