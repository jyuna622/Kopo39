package Class0402;

public class printWon {
	public void printWon (double cw, int returnWon, int won10000,
			int won5000, int won1000, int won500, int won100, int won10) {
		System.out.printf(" * ��ȭ �Ž����� : %.2f ��\n", cw);
		System.out.println(" * ��ȭ �Ž����� ����: " + returnWon + "��");
		System.out.println("10000�� :  " + won10000 + "��");
		System.out.println("5000�� :  " + won5000 + "��");
		System.out.println("1000�� :  " + won1000 + "��");
		System.out.println("500�� :  " + won500 + "��");
		System.out.println("100�� :  " + won100 + "��");
		System.out.println("10�� :  " + won10 + "��");
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
