package L04;

import java.util.Scanner;

public class P01_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt(); //점수를 입력 받음
		
		if (score >= 90)  {// 성적이 90점 이상일 때
			System.out.println("A등급입니다");
		} else if (score >= 80 && score < 90){ // 80 이상 90미만
			System.out.println("B등급입니다");
		} else if (score >= 70 && score < 80){ // 70 이상 80미만
			System.out.println("C등급입니다");
		} else { // 그 외의 경우 = 0
			System.out.println("F등급입니다");
		}
	}
}
