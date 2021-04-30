package L04;

public abstract class triangle {

	public static void main(String[] args) {
		// TODO Auto-gek39_nerated method stub
		//피라미드 찍기
		int k39_n, k39_m;
		k39_m=20; //m에 20 값을 줌
		k39_n=1; //n에 1 값을 줌
		
		while(true) { //while, true일떄의 무한루프 반복재생
			for(int i = 0; i < k39_m; i++) //20일떄까지
				System.out.printf(" "); //띄어쓰기 찍기
			for(int i = 0; i < k39_n; i++) // 1일떄까지
				System.out.printf("*"); //별찍기
			
			System.out.printf("\n");
			// 가운데를 중심으로 띄어쓰기는 한 칸 줄어들고 있고, 별은 두 개씩 늘어난다.

			
			k39_m = k39_m-1; // 전값
			k39_n = k39_n+2; // 다다음 값
			
			if (k39_m < 0) //m의 값이 0미만일떄 break 
				break;
		}
	}

}
