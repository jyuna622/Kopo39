package seconwk;

import java.util.Scanner;

public class P07 {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String[][] score = {{"kim", "80", "90", "100"},
				{"park", "60", "90", "90"}, {"lee", "70", "65", "88"}
		};
		
		String[] subject = {"Korean", "English", "Math"};
		while(true) {
			int mainChoice = mainMenu();
			if (mainChoice == 1) {
				int nameChoice = nameMenu(score)-1;
				statisticsByName(score, nameChoice);
			} else if (mainChoice == 2) {
				int subChoice = subMenu(subject);
				statisticsBySubject(score, subject, subChoice);
			} else {
				System.out.println("Please input number correctly");
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
	
	public static int subMenu(String[] subject) {
		System.out.println("#Subject");
		for (int i = 0; i < subject.length; i++) {
			System.out.println("#" + (i + 1) + " : " + subject[i]);
		}
		return scanner.nextInt();
	}
	
	public static void statisticsByName(String[][] score, int nameIndex) {
		System.out.println("#Statistis : " + score[nameIndex][0]);
		int sum = 0;
		double avg = 0;
		int min = Integer.parseInt(score[nameIndex][1]);
		int max = Integer.parseInt(score[nameIndex][1]);
		for (int i = 1; i < score[nameIndex].length; i++) {
			sum = sum + Integer.parseInt(score[nameIndex][i]);
		}
		
		avg = (double)sum/(score[nameIndex].length-1);
		
		for (int i=1 ; i<score[nameIndex].length ; i++) {
			int a = Integer.parseInt(score[nameIndex][i]);
			if (a > max) {
				max = a;
			} else if (a < min) {
				min = a;
			}
		}
	
		System.out.println("SUM : " + sum);
		System.out.printf("AVG : %.2f \n", avg);
		System.out.println("MIN : " + min);
		System.out.println("MAX : " + max);
	}
	
	public static void statisticsBySubject(String[][] score, String[] subject, int subIndex) {
		System.out.println("#Statistis : " + subject[subIndex-1]);
		int sum = 0;
		double avg = 0;
		int min = Integer.parseInt(score[0][subIndex]);
		int max = Integer.parseInt(score[0][subIndex]);
		for (int i = 0; i < subject.length; i++) {
			sum = sum + Integer.parseInt(score[i][subIndex]);
		}
		
		avg = (double)sum/(subject.length);
		
		for (int i=0 ; i<subject.length ; i++) {
			int a = Integer.parseInt(score[i][subIndex]);
			if (a > max) {
				max = a;
			} else if (a < min) {
				min = a;
			}
		}
		System.out.println("SUM : " + sum);
		System.out.printf("AVG : %.2f \n", avg);
		System.out.println("MIN : " + min);
		System.out.println("MAX : " + max);
	
	}
}
