package class0325;

import java.util.Scanner;

public class P08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String com = rpsResult();
		System.out.println(com);
		System.out.println(winResult(input,com));
	}
	
	public static String rpsResult() {
		String ret = "";
		int randomNumber = (int)(Math.random()*3);
		if (randomNumber == 0) {
			ret = "Rock";
		} else if (randomNumber == 1) {
			ret = "Paper";
		} else {
			ret = "Scissor";
		}
		return ret;
	}
	public static String winResult(String a, String b) {
		String win = "";
		if (a.equals("Rock")) {
			if (b.equals("Paper")) {
				win = "Defeat";
			} else if (b.equals("Scissor")) {
				win = "Win";
			} else if (b.equals("Rock")) {
				win = "Draw";
			}
		}
		else if (a.equals("Paper")) {
			if (b.equals("Rock")) {
				win = "Win";
			} else if (b.equals("Scissor")) { 
				win = "Defeat";
			} else if (b.equals("Paper")) {
				win = "Draw";
			}
		}
		else if (a.equals("Scissor")) {
			if (b.equals("Rock")) {
				win = "Defeat";
			} else if (b.equals("Paper")) {
				win = "Win";
			} else if (b.equals("Scissor")) {
				win = "Draw";
			}
		}
		return win;
	}
}