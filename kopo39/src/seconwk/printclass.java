package seconwk;

public class printclass {	
	int a, b, n;
		
public printclass(int a, int b, int n) {
	a = a;
	b = b;
	n = n;
	}
		
public void printMyName2() {
	System.out.println(this.n);
}
		
public void printadd() {
	int sum;
	sum = this.a + this.b;
	System.out.println(sum);
}
	
public void showPrice() {
	System.out.println("#Price");
	System.out.println("1. Apple");
	System.out.println("2. Strawberry");
	System.out.println("3. Grape");
	System.out.println("4. Watermelon");
	System.out.println("--> ");
}	
/*public static void printMyName2(int a, int b) {
		int sum;
		sum = a + b;
		System.out.print(sum);
	}
	*/

}
