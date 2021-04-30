package L02;

public class p19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k39_x = 10; //x라는 숫자형 변수를 정의하고 10으로 초기화
		int k39_y = 20; //y라는 숫자형 변수를 정의하고 20으로 초기화
		int k39_tmp = 0;//tmp라는 숫자형 변수를 정의하고 0으로 초기화
		
		System.out.println("x: " + k39_x  + " y: " + k39_y); //각 x(10)와 y(20)값 출력
		
		k39_tmp = k39_x; //x값을 tmp 변수에 저장 --> tmp = 10
		k39_x = k39_y; //y값을 x 변수에 저장 --> x = 20
		k39_y = k39_tmp; //tmp값을 y변수에 저장 -> y = 10
		
		System.out.println("x: " + k39_x  + " y: " + k39_y); //위에 다시 저장된 값을 출력
	}

}
