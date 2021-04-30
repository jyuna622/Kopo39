package seconwk;

public class main {

	public static void main(String[] args) {
		newPrintClass2 newPrintClass2 = new newPrintClass2 (1, 2, 5);
		newPrintClass2.printInteger();
		newPrintClass2.printAdd();
	}

	public static void getNearest() {
		// TODO Auto-generated method stub
		
	}
}

class newPrintClass2 {
	int a, b, n;
	
	public newPrintClass2(int a, int b, int n) {
		this.a = a;
		this.b = b;
		this.n = n;
	}
	
	public void printInteger() {
		System.out.println(this.n);
	}
	
	public void printAdd() {
		int sum;
		sum = this.a + this.b;
		System.out.println(sum);
	}
}