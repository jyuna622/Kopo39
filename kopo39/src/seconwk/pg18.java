package seconwk;

public class pg18 extends Character2 {
	public static int power = 10;
		
	public static void main(String[] args) {
		pg18 main = new pg18();
		main.printPower();
	}
	
	public void printPower() {
		super.printPower();
		
		System.out.println(power);
	}
}

class Character2 {
	public static int power = 30;
	
	public void printPower() {
		System.out.println(power);
	}
}
		

