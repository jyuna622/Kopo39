package Class0402;

public class printWon {
	public void printWon (double cw, int returnWon, int won10000,
			int won5000, int won1000, int won500, int won100, int won10) {
		System.out.printf(" * 원화 거스름돈 : %.2f 원\n", cw);
		System.out.println(" * 원화 거스름돈 지급: " + returnWon + "원");
		System.out.println("10000원 :  " + won10000 + "장");
		System.out.println("5000원 :  " + won5000 + "장");
		System.out.println("1000원 :  " + won1000 + "장");
		System.out.println("500원 :  " + won500 + "개");
		System.out.println("100원 :  " + won100 + "개");
		System.out.println("10원 :  " + won10 + "개");
	}
	
	public void returnWon (double cw) {
		int cwResult;
		cwResult = (int) cw;
		int returnWon, won10000, won5000;
		int won1000, won500, won100, won10;
		
		returnWon = (int) (cw/10) * 10;
		won10000 = cwResult/10000;
		won5000 = cwResult/5000;
		won1000 = cwResult/1000;
		won500 = cwResult%1000/500;
		won100 = cwResult%500/100;
		won10 = cwResult%100/10;
		
		printWon(cw, returnWon, won10000, won5000, won1000, won500, won100, won10);
	}
	
	
}
