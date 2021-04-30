package seconwk;


public class main2 implements InterPrice {
	
	public static void main(String[] arg) {
		main2 m = new main2();
		m.getPriceA(100);
		m.getPriceB(100);
	}
	
	@Override
	public void getPriceA(int price) {
		System.out.println(price + 100);
	}
	
	@Override
	public void getPriceB(int price) {
		System.out.println(price + 1000);
	}

}
