package L04;

public class P08_ppt19_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//날짜를 다르게 해보기
		//비정형비교3
		for (int i = 1; i < 13; i++) { //1월부터 12월까지
			System.out.printf(" %d월 ==> ", i); 
			for (int j = 1; j < 32; j++) { //한달에 최대 31까지 있으니 32미만으로 범위설정
				
				System.out.printf("%d, ", j);
				
				if ((i == 4 || i == 6 || i == 9 || i == 7 || i == 11) && (j == 30)) // 4, 6, 7, 9, 11월달일떈, 30일
					break;
				if (i == 2 && j ==28) //2월달엔 28일////까지
					break;
			}
			System.out.printf("\n");//한 줄 띄우기
		}
	}
}