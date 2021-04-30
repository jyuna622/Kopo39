package Currency;

public class OutputClass {
	
	public void printWon(double changeWon, int returnWon, int won10000, int won5000, int won1000, int won500, 	int won100, int won10) {
		System.out.println("-------------------------------------------------\n");
		System.out.printf("-->원화 거스름돈 : [ %.2f 원]\n",changeWon);
		System.out.println("-->원화 거스름 돈 지급 : [ " + returnWon + " 원]");
		System.out.println("");
		System.out.println("- 10000원 : 	" + won10000 + " 장");
		System.out.println("- 5000원 : 	" + won5000 + " 장");
		System.out.println("- 1000원 : 	" + won1000 + " 장");
		System.out.println("- 500원 : 	" + won500 + " 개");
		System.out.println("- 100원 : 	" + won100 + " 개");
		System.out.println("- 10원 : 	" + won10  + " 개");
		System.out.println(" ");
		System.out.println("=================================================");
	}
}
