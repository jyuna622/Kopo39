package L04;

public class P04_ppt15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k39_a, k39_b;
		
		k39_a = 0;  //인티저를 initiate
		while (true) { //while true 루프 시작
			
			k39_b = 0; //initiate
			while(true) {
			System.out.printf("*"); // 별 찍기
			
			if(k39_a == k39_b) break; //만약 서로 값이 같을 시, break
			k39_b++;
		}
		//k39_b 루프에서 나오기
		System.out.printf("\n"); //줄 바꾸기
		k39_a++;
		if(k39_a == 30) break; //k39_a가 30일 때 break.
		}

	}
}