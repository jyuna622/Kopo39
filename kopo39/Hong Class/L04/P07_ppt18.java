package L04;

public class P07_ppt18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비정형비교1
		//1월은 31이고, 2월은 28일, ... , 12월은 31이다.
		
		for (int i = 1; i < 13; i++) { //1월부터 12월까지
			System.out.printf(" %d월 ==> ", i); 
			for (int j = 1; j < 32; j++) { //한달에 최대 31까지 있으니 32미만으로 범위설정
				System.out.printf("%d, ", j);
				
				if(i == 1 && j == 31) break; //1월 = 31일까지
				if(i == 2 && j == 28) break; //2월은 예외!! 28일까지
				if(i == 3 && j == 31) break; //3월 = 31일까지
				if(i == 4 && j == 30) break; //4월 = 30일까지
				if(i == 5 && j == 31) break; //5월 = 31일까지
				if(i == 6 && j == 30) break; //6월 = 30일까지
				if(i == 7 && j == 31) break; //7월 = 31일까지
				if(i == 8 && j == 31) break; //8월 주의!! = 다시 31일까지
				if(i == 9 && j == 30) break; //9월 = 30일까지
				if(i == 10 && j == 31) break; //10월 = 31일까지
				if(i == 11 && j == 30) break; //11월 = 30일까지
				if(i == 12 && j == 31) break; //12월 = 31일까지
			}
			System.out.printf("\n"); //한 줄 띄우기
		}
	}
}
