package L03;

public class P05 {

	public static void main(String[] args) {
		//#5. 소수점 자리의 반올림/버림처리
		int Val_k39 = 14/5; // 값은 2.8이다. 소수점 이하 버리면 2, 반올림하면 3임.
		System.out.printf("# 5-1 : %d\n", Val_k39); //그냥 연산하고 넣으면 버려짐.
		
		// 저것을 실수(real number)형 (float, double 형태로 형변환) 계산을 한 후 0.5를 더한다음, 정수형 형변환을 하면 반올림처리가 됨.
		
		double valK39F;
		
		valK39F = 14/5;
		System.out.printf("# 5-2 : %f\n", valK39F);
		
		//한개해도 실수형태의 표시를 해야 결과가 실수가 나온다
		valK39F = 14.0/5;
		System.out.printf("# 5-3 : %f\n", valK39F);
		
		//실수형 계산에서 0.5 더해보기
		valK39F = (14.0)/5 + 0.5;
		System.out.printf("# 5-4 : %f\n", valK39F);
		
		//실수형 계산을 하고 정수형 형변환하기
		Val_k39 = (int) ((14.0)/5 + 0.5);
		System.out.printf("# 5-5 : %d\n", Val_k39);
	}

}
