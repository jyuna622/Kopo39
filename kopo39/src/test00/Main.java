package test00;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String[][] score = {{"kim", "80", "90", "90"},
				{"park", "60", "90", "90"}, {"lee", "70", "90", "90"}
	};
		while(true) {
			int mainChoice = mainMenu();
			if (mainChoice == 1) {
			int nameChoice = nameMenu(score);
			statisticsByName(score, nameChoice);
			} else if (mainChoice == 2) {
				
		} else {
				
			}
		}
	}
	
	public static int mainMenu() {
		System.out.println("#Menu");
		System.out.println("1. Name");
		System.out.println("2. Subject");
		return scanner.nextInt();
	}
	
	public static int nameMenu(String[][] score) {
		System.out.println("#Name");
		for (int i = 0; i < score.length; i++) {
			System.out.println("#" + (i + 1) + " : " + score[i][0]);
		}
		return scanner.nextInt();
	}
	
	 
	public static void statisticsByName(String[][] score, int nameIndex) {
		System.out.println("#Statistis : " + score[nameIndex][0]);
		int sum = 0;
		int avg = 0;
		int min = 0;
		int max = 0;
		for (int i = 1; i < score[nameIndex].length; i++) {
			sum = sum + Integer.parseInt(score[nameIndex][i]);
		}
			avg = sum / score[nameIndex].length - 1;
		
		System.out.println("SUM : " + sum);
		System.out.println("AVG : " + avg);
		System.out.println("MIN : " + min);
		System.out.println("MAX : " + max);
	}
}

