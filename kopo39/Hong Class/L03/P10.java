package L03;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo39_MyWon = 1000000;//백만원 
		double MoneyEx = 1238.21; //달러환율
		double commission = 0.003; //환전수수료, 0.3%
		double ComPerOne = MoneyEx * commission; //1$당 수수료

		int usd = (int) (kopo39_MyWon/MoneyEx); //전체금액 나누기 환율
		
		double totalcom = usd * ComPerOne; // 달러 x 1$당 수수료
		
		System.out.printf("*******************************************************\n");
		System.out.printf("*                      수수료 계산                       *\n");
		System.out.printf("총 수수료 : %f원 --> 미화: %d 달러, 잔돈 : %f원\n", totalcom, usd, ComPerOne);
		System.out.printf("*******************************************************\n");
		
	}

}
