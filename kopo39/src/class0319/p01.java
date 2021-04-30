package class0319;

import java.util.Scanner;

public class p01 {

		public static final String Father = "Jonas";
		public static final String Mother = "Anni";
		public static final String Son = "Jan";
		public static final String Daughter = "Yuna";
			
		public static void main(String[] args) {
			
		p01 p01 = new p01();
			Scanner scan = new Scanner(System.in);
		
			while(true) {
				p01.showMenu();
				int n = scan.nextInt();
				p01.getName(n);
			}
		}
		public void  getName(int familyMember) {
			if (familyMember == 1) {
				System.out.println("Father");
			} else if (familyMember == 2){
				System.out.println("Mother");
			} else if (familyMember == 3){
				System.out.println("Son");
			} else if (familyMember == 4){
				System.out.println("Daughter");
			} else {
				System.out.println("Error");
			}
			
		}
		public void showMenu() {
			System.out.println("#Menu");
			System.out.println("1. Father");
			System.out.println("2. Mother");
			System.out.println("3. Son");
			System.out.println("4. Daughter");
			System.out.println("--> ");
		}	
}
		
	
	
	/*public static void main(String[] args) {
		p01 p01 = new p01();
		p01.print("Yuna", 5, 3);
		p01.print("jhgvjgv");
		
		System.out.println("Printing a Name");
	}
	void print(String text, int number1, int number2) {
		for (int i= 0; i < Math.abs(number1 - number2); i++) {
			System.out.println(text);
		}
	}
	void print(String text) {
	System.out.println(text);
	}
}
	*/