package JavaWithStumi;

import java.util.Scanner;

public class EveningPlans {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("What would you like to do tomorrow evening?");
			System.out.println("\n#Options");
			System.out.println("1) go party in hongdae with the other exchange students");
			System.out.println("2) have a chill movie and cuddle evening in the dorm");
			System.out.println("3) you have a better idea and tell me :)");
			System.out.println("\nPlease type in your preference from the Option Menu: ");
			int input = scan.nextInt();
			
			if (input == 1) { 
				System.out.println("go party in hongdae with the other exchange students");
			} else if (input == 2) {
				System.out.println("have a chill movie and cuddle evening in the dorm");
			} else if (input == 3) {
				System.out.println("you have a better idea and tell me :)");
				String a = "--> We can both hang out with your friends and then also chill after we come back?:)";
				System.out.println(a);
			} else {
				System.out.println("Error!");
			}
			break;
		}
	}
}