package Tickets;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class OutputClass {
	
	public void printTotal(int total) {
		System.out.println("---------------------------------------------------------");
		System.out.println("총 금액 : " + total);
	}
	
	public void printSum(ArrayList<ProcessingClass> arrayProcess) {
		ProcessingClass Process = null;
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");
		int totalSum = 0;
		
		System.out.println("======================= POLYTECHLAND ==========================");
		
		for (int i = 0; i < arrayProcess.size(); i++) {
			Process = arrayProcess.get(i);
			System.out.printf("\n- %s: %s  X%3d = %9s 원 (%7s)\n", 
					Process.getTicketType(),Process.getCheckId(),Process.getTicketCount(),df.format(Process.getPrice()),Process.getDisabled());
			totalSum += Process.getPrice();
		}
		
		
		System.out.println("\n총 지불 입장료 금액은 " + df.format(totalSum) + "원 입니다.");
		System.out.println("===============================================================");	
	}
	
	
}
