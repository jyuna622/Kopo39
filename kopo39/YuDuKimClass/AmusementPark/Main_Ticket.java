package AmusementPark;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main_Ticket {
	
	public static void main(String[] args) throws IOException {		
		
		InputFromConsoleClass input = new InputFromConsoleClass();
		ProcessingClass processing = null;
		OutputClass output = new OutputClass();
		FileOut fileout = new FileOut();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		//Database db = new Database();
		//DatabaseOutputClass out = new DatabaseOutputClass();
		
		int ticketType;
		String customerId;
		int ticketCount, disabled, totalPrice;
		int sum;
		int continueTicket;
		int exit;
		String year;
		
		while(true) {
			ArrayList<ProcessingClass> arrayProcess = new ArrayList<ProcessingClass>();
			while(true) {
				processing = new ProcessingClass();
				ticketType = input.ticketType();
				customerId = input.id();
				ticketCount = input.ticketCount();
				disabled = input.disabled();
				totalPrice = processing.calPrice(ticketType, customerId, ticketCount);
				sum = processing.DisabledPrice(disabled, totalPrice);
				output.printTotal(sum);
				year = sdf.format(date);
				
				processing.setYear(year);
				processing.setTicketType(ticketType);
				processing.setCheckId(customerId);
				processing.setTicketCount(ticketCount);
				processing.setDisabled(disabled);
				processing.setPrice(sum);
				
				arrayProcess.add(processing);
				continueTicket = input.continueTicket();
				//out.addToDatabase(processing);
				
				if(continueTicket == 2) {
					output.printSum(arrayProcess);
					break;
				}
			}
			
			exit = input.exit();
			if(exit == 2) {
				fileout.FileOut(arrayProcess);
				//out.printDatabase();
				//out.printticketType();
				//out.printdayResult();
				//out.printhandicapResult();
				break;
			}
		}
	}
}