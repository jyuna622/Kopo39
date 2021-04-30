package L04;

public class P08_ppt19_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//날짜를 다르게 해보기
		//비정형비교2 
		
		for (int i = 1; i < 13; i++) { //1월부터 12월까지
			System.out.printf(" %d월 ==> ", i); 
			for (int j = 1; j < 32; j++) { //한달에 최대 31까지 있으니 32미만으로 범위설정
				
				System.out.printf("%d, ", j);
				
				if (i == 4 || i == 6 || i == 9 || i == 7 || i == 11) { // 4, 6, 7, 9, 11월달일떈, 30일
					if ( j == 30) //30일
						break;//끝나고, 
				}
				
				if (i == 2) { //2월달일때만 28일
					if(j == 28) //28일
						break;//끝남
				}
			}
			System.out.printf("\n");//한 줄 띄우기
		}
	}
}