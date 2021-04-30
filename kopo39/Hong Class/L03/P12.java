package L03;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MyWon = 1000000; 
		double MoneyEx = 1238.21; //달러환율
		double commission = 0.003; //환전수수료, 0.3%
		double ComPerOne = MoneyEx * commission; //1$당 수수료
		//int usd = (int) (MyWon/MoneyEx); //전체금액 나누기 환율
		//int remain = (int) (MyWon - usd * MoneyEx);// 고객에게 돌려줄 잔돔도 당연히 소숫점이하의 금액은 병행해야함. 실수로 계산 후 버림처리
		int usd = (int) (MyWon/(MoneyEx + ComPerOne)); // 환전달러		
		double totalcom = usd * ComPerOne; // 총 수수료
		
		//수수료 올림처리하기
		int i_totalcom;
		
		if (totalcom != (double) ((int)totalcom)){ //totlacom이 totalcom과 값이같지 않을떄 
			i_totalcom = (int) totalcom + 1; //totalcom에 +1해줌
		} else {
			i_totalcom = (int) totalcom;
		} 
		
		System.out.printf("*********************************************************************\n");
		System.out.printf("*                         (정확한) 수수료 적용환전                         *\n");
		
		System.out.printf("총 수수료 : %d원 --> 미화: %d 달러, 달러당 수수료 : %f원\n", i_totalcom, usd, ComPerOne);
		
		int remain = (int) (MyWon - usd * MoneyEx - i_totalcom);
		System.out.printf("총 한화홙전금액 : %d원 --> 미화: %d 달러, 수수료창구: %d원, 잔돈 : %d원\n", MyWon, usd, i_totalcom, remain);
		
		System.out.printf("*********************************************************************\n");
		
	}

}