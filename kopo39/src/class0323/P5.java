package class0323;

import java.util.Scanner;

public class P5 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Name\tKorean\tEnglish\tMath");
		String[][] score = {{"Yuna","70","80","100"},{"Marifer","60","70","86"},
				{"Stumi","54","100","82"},{"Jan","87","95","79"}}; //score array
		String[] subject = {"Korean", "English", "Math"};		
		P5 p5 = new P5();
		p5.printScore(score);
		
		while(true) {
			int mainChoice = mainMenu();
			if (mainChoice == 1) {
				int nameChoice = nameMenu(score)-1;
				statisticsByName(score, nameChoice);
			} else if (mainChoice == 2) {
				int subChoice = subMenu(subject);
				statisticsBySubject(score, subject, subChoice);
			} else {
				System.out.println("Please input the number correctly");
			}
		}
		
	}
	
	public void printScore(String[][] score) {
		for (int i = 0; i < score.length; i++) { 
		      for (int j = 0; j < score[i].length; j++) {
		        System.out.print(score[i][j] + "\t"); //print score array
		      }
		      System.out.println();
		}
	}
	
	public static int mainMenu() {
		System.out.println("\n#Menu");
		System.out.println("1. Name");
		System.out.println("2. Subject");
		return sc.nextInt();
	}
	
	public static int nameMenu(String[][] score) {
		System.out.println("#Name");
		for (int i = 0; i < score.length; i++) {
			System.out.println("#" + (i + 1) + " : " + score[i][0]);
		}
		return sc.nextInt();
	}
	
	public static int subMenu(String[] subject) {
		System.out.println("#Subject");
		for (int i = 0; i < subject.length; i++) {
			System.out.println("#" + (i + 1) + " : " + subject[i]);
		}
		return sc.nextInt();
	}
	
	
	public int sum(int[][] score) {
		int sum = 0;
		for (int i = 1 ; i<score.length ; i++) {
			for (int j=0 ; j<score.length ; j++) {
				sum = sum + score[i][j];
			}
		}
		return sum;
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
		
		avg = (double)sum / (score[nameIndex].length - 1);
		
		for (int i = 1 ; i < score[nameIndex].length ; i++) {
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
		for (int i = 0; i < score.length; i++) {
			sum = sum + Integer.parseInt(score[i][subIndex]);
		}
		
		avg = (double)sum/(subject.length);
		
		for (int i = 0 ; i<score.length ; i++) {
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