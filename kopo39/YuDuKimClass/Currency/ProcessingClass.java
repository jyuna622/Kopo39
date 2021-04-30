package Currency;

public class ProcessingClass {
	OutputClass outClass = null;
	
	ProcessingClass() {
		outClass = new OutputClass();
	}
	
	public int returnWon(double changeWon) {
		int cwResult;
		cwResult = (int)changeWon;
		int won10000, won5000, returnWon;
		int won1000, won500, won100, won10;
		
		returnWon = (int)(changeWon/10)*10;
		won10000 = cwResult/10000;
		won5000 = cwResult/5000;
		won1000 = cwResult/1000;
		won500 = cwResult%1000/500;
		won100 = cwResult%500/100;
		won10 = cwResult%100/10;

		outClass.printWon(changeWon, returnWon, won10000, 
				won5000, won1000, won500, won100, won10);
		
		return cwResult;
	
	}
	
	public double exchangeUSD(double won) {
		double exchangeResult; //환율 결과
		double ex_rate; //환율 처리 변수
		int usd; //환율 결과를 정수로
		double changeWon = 0; 
		ex_rate = Monet.EX_RATE_USD;
		exchangeResult = won / ex_rate ;
		System.out.println("\n-------------------------------------------------");
		System.out.println("");
		System.out.printf("달러로 환전 결과 : [ %.2f 달러 ]\n", exchangeResult);

		usd = (int)exchangeResult; 
		System.out.println("달러 지급 : [ " + usd + " 달러 ]");
		System.out.println("");
		System.out.println("-100달러 : 	"+ usd/100 + " 장");
		System.out.println("-50달러 : 	" + usd%100/50 + " 장");
		System.out.println("-20달러 : 	" + usd%100%50/20 + " 장");
		System.out.println("-10달러 : 	" + usd%100%50%20/10 + " 장");
		System.out.println("-5달러 : 	" + usd%100%50%20%10/5 + " 장");
		System.out.println("-2달러 : 	" + usd%100%50%20%10%5/2 + " 장");
		System.out.println("-1달러 : 	" + usd%100%50%20%10%5%2/1 + " 장");
		changeWon = won - usd * ex_rate;
		return changeWon;
	}
	
	public double exchangeEUR(double won) {
		double exchangeResult; //환율 결과
		double ex_rate; //환율 처리 변수
		int usd; //환율 결과를 정수로
		int eur;
		double changeWon = 0; 
		ex_rate = Monet.EX_RATE_EUR; //유로 환율로 변경
		exchangeResult = won / ex_rate ; //유로 환율로 계산된 값
		System.out.println("\n-------------------------------------------------");
		System.out.println("");
		System.out.printf("유로로 환전 결과 : [ %.2f 유로 ]\n", exchangeResult);

		eur = (int)exchangeResult; 
		System.out.println("유로 지급 : [ " + eur + " 유로 ]");
		System.out.println("");
		System.out.println("-100유로 : 	"+ eur/100 + " 장");
		System.out.println("-50유로 : 	" + eur%100/50 + " 장");
		System.out.println("-20유로 : 	" + eur%100%50/20 + " 장");
		System.out.println("-10유로 : 	" + eur%100%50%20/10 + " 장");
		System.out.println("-5유로 : 	" + eur%100%50%20%10/5 + " 장");
		System.out.println("-2유로 : 	" + eur%100%50%20%10%5/2 + " 장");
		System.out.println("-1유로 : 	" + eur%100%50%20%10%5%2/1 + " 장");
		changeWon = won - eur * ex_rate;
		return changeWon;
	}
	
	public double exchangeJPY(double won) {
		double exchangeResult; //환율 결과
		double ex_rate; //환율 처리 변수
		int jpy;
		double changeWon = 0; 
		ex_rate = Monet.EX_RATE_JPY * 100; //엔화 환율로 변경
		exchangeResult = won / ex_rate ; //엔화 환율로 계산된 값
		System.out.println("\n-------------------------------------------------");
		System.out.println("");
		System.out.printf("엔화로 환전 결과 :  [ %.2f 엔 ]\n", exchangeResult);

		jpy = (int)exchangeResult; 
		System.out.println("엔화 지급 : [ " + jpy + " 엔 ]");
		System.out.println("");
		System.out.println("-10000엔 : 	"+ jpy/10000 + " 장");
		System.out.println("-5000엔 : 	" + jpy%10000/5000 + " 장");
		System.out.println("-2000엔 : 	" + jpy%10000%5000/2000 + " 장");
		System.out.println("-1000엔 : 	" + jpy%10000%5000%2000/1000 + " 장");
		System.out.println("-500엔 : 	" + jpy%10000%5000%2000%1000/500 + " 개");
		System.out.println("-100엔 : 	" + jpy%10000%5000%2000%1000%500/100 + " 개");
		System.out.println("-50엔 : 	" + jpy%10000%5000%2000%1000%500%100/50 + " 개");
		System.out.println("-10엔 : 	" + jpy%10000%5000%2000%1000%500%10%50/10 + " 개");
		System.out.println("-5엔 : 		" + jpy%10000%5000%2000%1000%500%10%50%10/5 + " 개");
		System.out.println("-1엔 : 		" + jpy%10000%5000%2000%1000%500%10%50%10%5/1 + " 개");
		changeWon = won - jpy * ex_rate;
		return changeWon;
	}
}
