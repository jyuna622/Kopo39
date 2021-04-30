package class0324;

import java.util.Arrays;
import java.util.Scanner;

public class P07 {

		public static Scanner scan = new Scanner(System.in);
		public static void main(String[] args) {
			// TODO Auto-generated constructor stub
			System.out.println("Input names and grades. \nex: Hong A+/Kim B0/Park B+/...");
			String allAtOnce = scan.nextLine();
			
			String[] nameFirst = allAtOnce.split("/");
			String[] sample = new String[nameFirst.length];
			String[] gradeFirst = new String[nameFirst.length];
			int l = sample.length;
			
			Arrays.sort(nameFirst);
			
			System.out.println("\nPrint names in ascending order : ");
			for(int i = 0; i < nameFirst.length; i++) {
				sample[i] = nameFirst[i];
				System.out.println((i+1) + ". " + nameFirst[i]);
			}
			System.out.println("");
			
			System.out.println("\nPrint names in descending order : ");
			for(int i = 0; i < nameFirst.length; i++) {
				nameFirst[i] = sample[l-(i+1)];
				System.out.println((i+1) + ". " + nameFirst[i]);
			}
			System.out.println("");
			
			String[][] finalGrade = new String[nameFirst.length][];
			
			for(int i = 0; i < nameFirst.length; i++) {
				finalGrade[i] = nameFirst[i].split(" ");
			}
			
			
			
			for(int i = 0; i < finalGrade.length; i++) {
				sample[i] = finalGrade[i][0];
				finalGrade[i][0] = finalGrade[i][1];
				finalGrade[i][1] = sample[i];
				
			}
			
			
			for(int i = 0; i < gradeFirst.length; i++) {
				gradeFirst[i] = finalGrade[i][0] + " " + finalGrade[i][1];
			}
			
			Arrays.sort(gradeFirst);
			
			for(int i = 0; i < gradeFirst.length; i++) {
				finalGrade[i] = gradeFirst[i].split(" ");
			}
			
			for(int i = 0; i < finalGrade.length; i++) {
					sample[i] = finalGrade[i][0];
					finalGrade[i][0] = finalGrade[i][1];
					finalGrade[i][1] = sample[i];
			}
			

			for(int i = 0; i < gradeFirst.length; i++) {
				gradeFirst[i] = finalGrade[i][0] + " " + finalGrade[i][1];
			}
			
			System.out.println("\nPrint grades in ascending order : ");
			for(int i = 0; i < gradeFirst.length; i++) {
				sample[i] = gradeFirst[i];
				System.out.println((i+1) + ". " + gradeFirst[i]);
			}
			System.out.println("");
			
			System.out.println("\nPrint grades in descending order : ");
			for(int i = 0; i < gradeFirst.length; i++) {
				gradeFirst[i] = sample[l-(i+1)];
				System.out.println((i+1) + ". " + gradeFirst[i]);
			}
			System.out.println("");
			
		}

	}
