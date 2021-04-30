package Class0402;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		Currency main = new Currency();
		
		double won;
		double exchangeResult;
		double USD_EX_RATE = 1133.4;
		double EUR_EX_RATE = 1348.3;
		double YEN_EX_RATE = 10.20;
		double changeWon, money;
		int changeWonResult;
		int USD, EUR, YEN, cc, a;
		//cc = Country Code
		
		System.out.print("Please input Korean Won : ");
		won = scanner.nextDouble();
		
		System.out.print("Please input country : \n1 = U.S.A \n2 = Europe \n3 = Japan \n");
		cc = scanner.nextInt();

		switch(cc) {
		case 1: 
			//달러 계산
			money = won / USD_EX_RATE;
			System.out.println("In Dollars");
			System.out.printf("달러 지급 : %.2f 달러 \n", money );
			scanner.close();
			
			USD = (int)money;
			a = USD;
			System.out.println("100 - " + USD / 100);
			USD = USD % 100;
			System.out.println("50 - " + USD / 50);
			USD = USD % 50;
			System.out.println("20 - " + USD / 20);
			USD = USD % 20;
			System.out.println("10 - " + USD / 10);
			USD = USD % 10;
			System.out.println("5 - " + USD / 5);
			USD = USD % 5;
			System.out.println("1 - " + USD / 1);
			
			//  원화 거스름 계산
		    changeWon = (won - (a * USD_EX_RATE)) / 10;
		    changeWonResult = (int)changeWon * 10;
		    System.out.printf("거스름돈 : " + changeWonResult + " 원");
		    scanner.close();
			break;
			
		case 2:
			//유로 계산
			money = won / EUR_EX_RATE;
			System.out.println("In Euros");
			System.out.printf("유로 지급 : %.2f 유로 \n", money);
			scanner.close();
			
			EUR = (int)money;
			a = EUR;
			System.out.println("100 - " + EUR / 100);
			EUR = EUR % 100;
			System.out.println("50 - " + EUR / 50);
			EUR = EUR % 50;
			System.out.println("20 - " + EUR / 20);
			EUR = EUR % 20;
			System.out.println("10 - " + EUR / 10);
			EUR = EUR % 10;
			System.out.println("5 - " + EUR / 5);
			EUR = EUR % 5;
			System.out.println("2 - " + EUR / 2);
			EUR = EUR % 2;
			System.out.println("1 - " + EUR / 1);
			
			//  원화 거스름 계산
		    changeWon = (won - (a * EUR_EX_RATE)) / 10;
		    changeWonResult = (int)changeWon * 10;
		    System.out.printf("거스름돈 : " + changeWonResult + " 원");
		    scanner.close();
			break;
			
		case 3:
			//엔화 계산
			money = won / YEN_EX_RATE;
			System.out.println("In Yens");
			System.out.printf("엔화 지급 : %.2f 엔화 \n", money);
			scanner.close();
			
			YEN = (int)money;
			a = YEN;
			System.out.println("10000 - " + YEN / 10000);
			YEN = YEN % 10000;
			System.out.println("5000 - " + YEN / 5000);
			YEN = YEN % 5000;
			System.out.println("2000 - " + YEN / 2000);
			YEN = YEN % 2000;
			System.out.println("1000 - " + YEN / 1000);
			YEN = YEN % 1000;
			System.out.println("500 - " + YEN / 500);
			YEN = YEN % 500;
			System.out.println("100 - " + YEN / 100);
			YEN = YEN % 100;
			System.out.println("50 - " + YEN / 50);
			YEN = YEN % 50;
			System.out.println("10 - " + YEN / 10);
			YEN = YEN % 10;
			System.out.println("5 - " + YEN / 5);
			YEN = YEN % 5;
			System.out.println("1 - " + YEN / 1);
			
			//  원화 거스름 계산
		    changeWon = (won - (a * YEN_EX_RATE)) / 10;
		    changeWonResult = (int)changeWon * 10;
		    System.out.printf("거스름돈 : " + changeWonResult + " 원");
		    scanner.close();
			break;
		}	    
	}
}