package L02;

public class p24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k39_url = "www.codechobo.com";
		
		float k39_f1 = .10f; // 0.10, 1.0e-1
		float k39_f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
		float k39_f3 = 3.13e3f; //f3 = 3130.000000, 3.130000e+03, 3130.00
		double k39_d = 1.23456789;//d값
		
		System.out.printf("f1 = %f, %e, %g%n", k39_f1, k39_f1, k39_f1); //%f는 소수점 6자리까지만, 1.000000e-01, 0.100000
		System.out.printf("f2 = %f, %e, %g%n", k39_f2, k39_f2, k39_f2); //f2 = 10.000000, 1.000000e+01, 10.0000
		System.out.printf("f3 = %f, %e, %g%n", k39_f3, k39_f3, k39_f3);//f3 = 3130.000000, 3.130000e+03, 3130.00
		
		System.out.printf("d = %f %n", k39_d);//%f는 소수점 6자리까지만
		System.out.printf("d = %14.10f%n", k39_d); //전체 14자리중 소수점 10자리 
		
		System.out.printf("[12345678901234567890]%n"); //숫자출력
		System.out.printf("[%s] %n", k39_url);//%s자리에 url출력
		System.out.printf("[%20s]%n", k39_url); //왼쪽정렬 20글자출력
		System.out.printf("[%-20s] %n", k39_url);//오른쪽정렬
		System.out.printf("[%.8s]%n", k39_url);//왼쪽에서 8글자만 출력
	}

}
