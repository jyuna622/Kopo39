package L02;

public class p29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k39_i = 91234567; //8자리의 10진수
		float k39_f = (float)k39_i;//int를 float로 형변환
		int k39_i2 = (int) k39_f;//float를 다시 int로 형변환
		
		double k39_d = (double) k39_i;//int를 다시 double로 형변환
		int k39_i3 = (int)k39_d; //double을 다시 int로 형변환
		
		float k39_f2 = 1.666f;//f2값 초기화
		int k39_i4 = (int)k39_f2;//float를 int로 형변환
		
		System.out.printf("i = %d\n", k39_i);//i값 그대로 출력
		System.out.printf("f = %f i2 = %d\n", k39_f, k39_i2);//float기때문에 f = 91234568.000000
		System.out.printf("d = %f i3 = %d\n", k39_d, k39_i3);//다시 더블로 형변환해서 d = 91234567.000000 
		System.out.printf("(int) %f = %d\n", k39_f2, k39_i4);//다시 정수로 형변환 (소수점 이하 생략)		
		
	}

}
