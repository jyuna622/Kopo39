package L02;

public class p21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('\''); //'''처럼 할 수 없ㄷ다. \를 추가해야지 문자로 인식해준다
		System.out.println("abc\t123\b456"); // \t은 tab만큼 띄어짐, \b는 뒤에 글자(-->3) 하나 지움
		System.out.println('\n'); //개행(new line) 문자 출력하고 개행
		System.out.println("\"Hello\"");  //큰따옴표(")를 출력하려면 이렇게 해야한다 --> \" 
		System.out.println("c:\\"); // \\를 두개 해줬으니 \뒤에 \를 프린트해줌.
	}

}
