package class0325;

import java.util.Scanner;

public class P09 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		P09 main = new P09();
		int N = scanner.nextInt();

		for(int i = 0;i < N; i++) {
			Thread thread = new Thread(main);  
			thread.start(); 
		}

	}

	@Override
	public void run() {
		try {
			double sum = 0;
			double recordperSec = 0.0d;

			while (true) { 
				recordperSec = (Math.random()*10);
				sum = sum + recordperSec;
				if (sum < 50 || sum ==50) {
				System.out.printf("%.1f m ", sum);
				Thread.sleep(1000);
				} else {
					System.out.println("finished");
					break;
				}

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

