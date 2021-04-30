package L02;

public class p23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte k39_b = 1; //(-128 ~ 127) 범위까지 저장 및 표현이 가능하다.
		short k39_s = 2; //(-32,768 ~ 32,767) 범위까지 저장 및 표현이 가능하다.
		char k39_c = 'A'; //음수의 범위 없이 유니코드 ( 0 ~ 65535) 범위를 저장한다.
		
		int k39_finger = 10; //finger 값을 10으로 초기화
		long k39_big = 100000000000L; //big값 초기화
		long k39_hex = 0xFFFFFFFFFFFFFFFFL; //hex값 초기화
		
		int k39_octNum = 010;	//8진수 10, 10진수로는 8
		int k39_hexNum = 0x10;	//16진수 10, 10진수로는 16
		int k39_binNum = 0b10; //2진수 10, 10진수로는 2
		
		System.out.printf("b = %d%n", k39_b); //%d자리에 b값 출력
		System.out.printf("s = %d%n", k39_s);//%d자리에 s값 출력
		System.out.printf("c = %c, %d %n", k39_c, (int)k39_c);//%c(char)자리에 c값, %d자리에 a의 유니코드 값 출력
		System.out.printf("finger = [%5d]%n", k39_finger); //왼쪽 정렬5칸 띄우기 10출력
		System.out.printf("finger = [%-5d]%n", k39_finger);//10출력후 오른정렬 5칸 띄우기
		System.out.printf("finger = [%05d]%n", k39_finger);//5칸의 마지막에 10출력
		System.out.printf("big = %d%n", k39_big);//%d자리에 big값 출력
		System.out.printf("hex = %#x %n", k39_hex); //'#'는 접두사 (16진수 0x, 8진수 0)
		System.out.printf("octNum = %o, %d%n", k39_octNum, k39_octNum);//%o는 8진수(10출력),  %d는 10진수(8출력) 
		System.out.printf("hexNum = %x, %d%n", k39_hexNum, k39_hexNum);//%x는 16진수(10출력),  %d는 10진수(16출력) 
		System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(k39_binNum), k39_binNum);//%s는 2진수(10출력),  %d는 10진수(2출력) 
		
		
	}

}
