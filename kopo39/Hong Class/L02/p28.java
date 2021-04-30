package L02;

public class p28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float k39_f = 9.1234567f; //float는 실수형 - 4바이트
		double k39_d = 9.1234567; //double도 실수형 - 8바이트
		double k39_d2 = (double) k39_f;//float를 더블로 강변환
		
		System.out.printf("f = %20.18f\n", k39_f);//f = 9.123456954956055000
		System.out.printf("d = %20.18f\n", k39_d);//9.1234567뒤의 20자리까지는 0으로 찍힘
		System.out.printf("d2 = %20.18f\n", k39_d2);//f와 값이 같음
	}

}
