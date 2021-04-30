package Currency;

import java.io.IOException;
import java.util.Scanner;

public class Main_MoneyExchange {
	public static void main(String[] args) throws IOException {		
		ExchangeType exType;
		
		ProcessingClass pc = new ProcessingClass();
		InputFromConsoleClass inputConsole = new InputFromConsoleClass();
		FileWriteClass fwc = new FileWriteClass();
		
		fwc.headerWrite();
		
		do {
			exType = new ExchangeType();
			exType.won = inputConsole.inputWon();
			exType.type = inputConsole.inputType();

			if(exType.type == Monet.EX_TYPE_USD) {
				exType.changewon = pc.exchangeUSD(exType.won);
				exType.exchange_type = "USD";
				exType.exchangeResult = (int)(exType.won / Monet.EX_RATE_USD);
			} else if (exType.type == Monet.EX_TYPE_EUR) {
				exType.changewon = pc.exchangeEUR(exType.won);
				exType.exchange_type = "EUR";
				exType.exchangeResult = (int)(exType.won / Monet.EX_RATE_EUR);
			} else if (exType.type == Monet.EX_TYPE_JPY) {
				exType.changewon = pc.exchangeJPY(exType.won);
				exType.exchange_type = "JPY";
				exType.exchangeResult = (int)(exType.won / Monet.EX_RATE_JPY);
			} else {
				break;
			}
			
			exType.returnwon = pc.returnWon(exType.changewon);
			
			fwc.dataWrite(exType);
			
		} while(exType.type != Monet.EX_TYPE_EXIT);
		fwc.fileClose();
	}

}