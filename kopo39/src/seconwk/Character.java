package seconwk;

public class Character {
	public static int power = 30;
	
	public void printPower() {
		System.out.println(power);
	}
}

class main extends Character {
	public static int power = 10;
	
	public static void main(String[] args) {
		main main = new main();
		main.printPower();
	}
	
	public void printPower() {
		super.printPower();
		System.out.println(power);
	}
}
	
	
	
	
	/*String name;
	int age;
	int power;
	
	public Character() {
		this("hello", 10, 20);
	}
		
	public Character (String name, int age, int power) {
		this.name = name;
		this.age = age;
		this.power = power;
	}
}
*/
