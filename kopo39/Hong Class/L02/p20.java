package L02;

public class p20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k39_name = "Ja" + "va"; //name이라는 string변수에는 ja와 va가 합쳐진 java가 나옴
		String k39_str = k39_name + "8.0"; //String str = name + 8.0이라하면 안됨. "8.0" 해줘야함
		
		System.out.println(k39_name); //name변수에 저장된 문구 java출력
		System.out.println(k39_str); //name변수에 저장된 문구 java + 8.0출력
		System.out.println(7 + " "); //7 + 빈칸 출력
		System.out.println(" " + 7); //빈칸 + 7 출력
		System.out.println(7 + "");//7 출력
		System.out.println("" + 7);//7 출력
		System.out.println("" + "");//빈줄 출력
		System.out.println(7 + 7 + ""); //7 + 7이 계산됨 --> 14출력
		System.out.println("" + 7 + 7);//7과 7이 출력됨 -->77
	}

}
