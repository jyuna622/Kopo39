package Tickets;

import java.util.Scanner;

public class InputFromConsoleClass {
	Scanner scan = null;
	
	public InputFromConsoleClass() {
		scan = new Scanner(System.in);
	}
	
	//이용권 종류
	public int ticketType() {
		System.out.println("이용권 종류를 고르시오:\n\n1. 주간권\n2. 야간권(16시~)");
		int num = scan.nextInt();
		return num;
	}
	
	//주민번호
	public String id() {
		System.out.println("\n주민번호를 7자리까지 '-'없이 입력하시오:");
		String id = scan.next();
		return id;
	}
	
	//티켓 장 수
	public int ticketCount() {
		System.out.println("\n몇개를 주문하시겠습니까? (최대 10장까지 가능)");
		int ticketcnt = scan.nextInt();
		return ticketcnt;
	}
	
	//우대사항
	public int disabled() {
		System.out.println("\n우대사항을 선택하세요.\n1. 해당사항 없음 \n2. 장애인 우대\n3. 국가유공자 우대\n4. 다자녀 가정 우대\n5. 임산부 우대");
		int disabled = scan.nextInt();
		return disabled;
	}
	
	//티켓 계속 발권 여부 /종료 
	public int continueTicket() {
		System.out.println("\n티켓을 계속 발권 하시겠습니까?\n1. 계속 티켓 발권\n2. 종료");
		int yn = scan.nextInt();
		return yn;
	}
	
	//제시작 or 종료
	public int exit() {
		System.out.print("\n계속 진행 (1: 재시작, 2: 종료) : ");
		int re = scan.nextInt();
		return re;
	}
}