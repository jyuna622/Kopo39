package seconwk;

public class p1new {
	int ApplePrice, StrawberryPrice, GrapePrice, WatermelonPrice;
	
	public p1new (int a, int b, int c, int d) {
		this.ApplePrice = a;
		this.StrawberryPrice = b;
		this.GrapePrice = c;
		this.WatermelonPrice = d;
	}
	
	public void showPrice() {
		System.out.println("#Price");
		System.out.println("1. Apple");
		System.out.println("2. Strawberry");
		System.out.println("3. Grape");
		System.out.println("4. Watermelon");
		System.out.println("--> ");
	}	
			
	public void showPrice(int n) {
		if (n == 1) {
			System.out.println("1,000");
		} else if (n == 2){
			System.out.println("4,980");
		} else if (n == 3){
			System.out.println("8,970");
		} else if (n == 4){
			System.out.println("6,530");
		} else {
			System.out.println("Error");
		}
	}
	
}