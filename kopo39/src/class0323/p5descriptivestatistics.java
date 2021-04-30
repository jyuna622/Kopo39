package class0323;

import java.util.ArrayList;
import java.util.Scanner;

public class p5descriptivestatistics {

	public static void main(String[] args) {
		 char data[] = {'a', 'b', 'c'};
	     String str = new String(data);
 
		System.out.println("abc");
	     String cde = "cde";
	     System.out.println("abc" + cde);
	     String c = "abc".substring(2, 3);
	     String d = cde.substring(1, 2);
	}
}

/*
		Scanner scan = new Scanner(System.in);
		String[][] names = {{"Name", "Jeong", "Pyo", "Choi", "Mike"}, {"Korean", 70, 60, 54, 87}, {"English", 80, 70, 100, 95}, {"Math", 100, 86, 82, 79}};
		
		int[] temp = new int[3];
		temp[0] = numbers[1][0];
		temp[1] = numbers[1][1];
		temp[2] = numbers[1][2];
		ArrayList<String>	newList	=	new	ArrayList<String>();
		System.out.println(sum(temp));
	}
	
	public static void mainMenu(String[][] score) {
		System.out.println("#Name");
		for (int i = 0; i < score.length; i++) {
			System.out.println("#" + (i + 1) + " : " + score[i][0]);
		}
	}
	
	public static int sum(int[] score) {
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		return sum;
		}
		/*
		System.out.println("  Name " + " | " + " Korean " + " | " + " English " + " | " + " Math ");
		
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
			numbers[i][j] = count;
			count++;
			System.out.print(" [" + i + " , " + j + "] ");
			}
			System.out.println("");
		}
		*/	

