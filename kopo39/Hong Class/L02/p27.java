package L02;

public class p27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k39_i = 10; //i를 10으로 초기화
		byte k39_b = (byte)k39_i; //i값을 b에 byte로 저장 -->10
		System.out.printf("[int --> byte] i = %d --> b = %d%n", k39_i, k39_b);//i = 10 --> b = 10
		
		k39_i = 300; //i를 300으로 초기화
		k39_b = (byte) k39_i; //i값을 b에 byte로 저장 -->44
		System.out.printf("[int --> byte] i = %d --> b = %d%n\n", k39_i, k39_b);//i = 300 --> b = 44
		
		k39_b = 10;//b를 10으로 초기화
		k39_i = (int)k39_b; //b값을 i에 정수로 저장 -->10
		System.out.printf("[byte --> int] b = %d --> i = %d%n", k39_b, k39_i);// b = 10 --> i = 10
		
		k39_b = -2;//b를 -2으로 초기화
		k39_i = (int)k39_b; //b값을 i에 정수로 저장-->-2
		System.out.printf("[byte --> int] b = %d --> i = %d%n", k39_b, k39_i);//b = -2 --> i = -2
		
		System.out.println("\ni = " + Integer.toBinaryString(k39_i));//2진수를 10진수로 변환하기 위해선 Integer 클래스의 parseInt를 사용하여 쉽게 변환이 가능하다.
		
		
	}

}
