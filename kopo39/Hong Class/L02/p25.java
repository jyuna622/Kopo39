package L02;

public class p25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short k39_sMin = -32768;//short는 byte다음으로 작은 자료형이다. short는 2바이트의 크기 즉 16 bits를 저장 할 수 있다. 16 bits에는 65,536개의 숫자를 저장 할 수 있다. 
		short k39_sMax = 32767;//마찬가지로 이 자료형도 65,536을 둘로 나눠 32,768개의 음수와 32,768개의 0과 양수를 표현한다. 따라서 -32,768~32,767까지의 정수를 표현 할 수 있다.
		char k39_cMin = 0; //문자를 저장하기 위한 변수를 선언할 때 사용되며, char 타입의 변수는 하나의 문자만 저장할 수 있다.
		char k39_cMax = 65535; //'char'의 형태로 나타낼 수 있는 방법은 유니코드, ASCII코드, 문자 세 가지 방법이 있다.
		
		System.out.println("sMin = " + k39_sMin); //sMin = -32768
		System.out.println("sMin - 1 = " + (short) (k39_sMin-1)); //short는 -32,768~32,767까지의 정수를 표현 할 수 있다. 그래서 -1을 하면 overflow가 되어 반대의 최대값인 32,767출력됨.
		System.out.println("sMax = " + k39_sMax);//sMax = 32767
		System.out.println("sMax + 1 = " + (short) (k39_sMax+1) + "\n");//얘도 overflow돼서 반대의 최소값인 -32,768출력
		System.out.println("cMin = " + (int) k39_cMin); //0을문자에서 숫자로 변환 후 출력
		System.out.println("cMin - 1 = " + (int)--k39_cMin);//char의 overflow값(최대값)
		System.out.println("cMax = " + (int) k39_cMax);//cMax = 65535
		System.out.println("cMax + 1 = " + (short)++k39_cMin);//char의 overflow값(최소값)
		
	}

}
