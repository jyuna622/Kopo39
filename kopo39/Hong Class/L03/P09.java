package L03;

public class P09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo39_MyWon = 1000000;//백만원 
		double MoneyEx = 1238.21; //달러환율
		double commission = 0.003; //환전수수료, 0.3%
		
		int usd = (int) (kopo39_MyWon/MoneyEx); //전체금액 나누기 환율
		int remain = (int) (kopo39_MyWon - usd * MoneyEx);// 고객에게 돌려줄 잔돔도 당연히 소숫점이하의 금액은 병행해야함. 실수로 계산 후 버림처리
		
		System.out.printf("***************************************************\n");
		System.out.printf("*                   수수료없이 계산                    *\n");
		System.out.printf("총 한화환전금액 : %d원 --> 미화: %d 달러, 잔돈 : %d원\n", kopo39_MyWon, usd, remain);
		
		System.out.printf("***************************************************\n");
	}

}
