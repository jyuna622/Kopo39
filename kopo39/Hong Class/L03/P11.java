package L03;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MyWon = 1000000; //백만원
		double MoneyEx = 1238.21; //달러환율
		double commission = 0.003; //환전수수료, 0.3%
		double ComPerOne = MoneyEx * commission; //1$당 수수료
		int usd = (int) (MyWon/MoneyEx); //전체금액 나누기 환율
		int remain = (int) (MyWon - usd * MoneyEx);// 고객에게 돌려줄 잔돔도 당연히 소숫점이하의 금액은 병행해야함. 실수로 계산 후 버림처리
		
		double totalcom = usd * ComPerOne; // 달러 x 1$당 수수료
		
		int i_totalcom;
		if (totalcom != (double) ((int)totalcom)) {
			i_totalcom = (int) totalcom + 1;
		} else {
			i_totalcom = (int) totalcom;
		} 
		
		System.out.printf("****************************************************************\n");
		System.out.printf("*                         수수료 적용환전                          *\n\n");
		System.out.printf("총 수수료 : %d원 --> 미화: %d 달러, 잔돈 : %f원\n", i_totalcom, usd, ComPerOne);
		
		remain = (int) (MyWon - usd * MoneyEx - i_totalcom);
		System.out.printf("총 한화환전금액 : %d원 --> 미화: %d달러, 수수료창구: %d원, 잔돈 : %d원\n", MyWon, usd, i_totalcom, remain);
		
		System.out.printf("****************************************************************\n");
		
	}
}