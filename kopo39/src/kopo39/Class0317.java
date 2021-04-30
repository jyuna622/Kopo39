package kopo39;

import java.util.Scanner;

public class Class0317 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int m = scanner.nextInt();
		int i=1; int sum = 0;
		while(i<=n) {
			sum += i;
			i += m;
		} System.out.println(sum);
	}
}
		

/*
Scanner scanner = new Scanner(System.in);
int i = 0;
int a = scanner.nextInt();
int b = scanner.nextInt();
int sum = 0;
		
for (i = 1; i <= 10; i += 2) {
	sum = sum + i;
	
}

System.out.println(sum);
}

}
*/