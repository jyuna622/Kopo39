package test00;

import java.util.Scanner;

public class TestA06 implements Statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		TestA06 main = new TestA06();
		double doubNums = scan.nextDouble();
		
	}

	@Override
	public double getMaxNumber(double[] numbers) {
		// TODO Auto-generated method stub
		double max = (double) (Math.max(doubleNums));
		System.out.println("Maximum : " + max);
		return max;
	}

	@Override
	public double getMinNumber(double[] numbers) {
		// TODO Auto-generated method stub
		double min = (double)Math.min(doubleNums);
		System.out.println("Minimum : " + min);
		return min;
	}

}
