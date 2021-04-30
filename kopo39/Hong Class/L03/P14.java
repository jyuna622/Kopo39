package L03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P14 {

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
		
		//수수료 올리처리하기
		int i_totalcom;
		
		if (totalcom != (double) ((int)totalcom)) { //totlacom이 totalcom과 값이 같지 않을떄 
			i_totalcom = (int) totalcom + 1; //totalcom에 +1해줌
		} else {
			i_totalcom = (int) totalcom;
		} 
		
		DecimalFormat df = new DecimalFormat ( " # # #, # # #, # # #, # # #"); //decimal format 정해주기
		//DecimalFormat라는 클래스 import하기
		
		System.out.printf("*************************************************************\n");
		System.out.printf("*                        콤마찍기, 날짜 적용                      *\n");
		
		System.out.printf("총 수수료: %s원 --> 미화: %s달러, 달러당 수수료: %f원\n", df.format(i_totalcom), df.format (usd), ComPerOne);
		
		int remain = (int) (MyWon - usd * MoneyEx - i_totalcom);
		System.out.printf("총 한화환전금액: %s원 --> 미화: %s달러, 수수료 창구: %s원 잔돈: %s원\n",
				df.format(MyWon), df.format(usd), df.format(i_totalcom), df.format(remain));
		
		
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY/MM/dd HH:mm:ss");
		System.out.printf("\n최종 실행 시간: %s\n", sdt.format(calt.getTime()));
		
		System.out.printf("*************************************************************\n");
	}
}
