package AmusementPark;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import Currency.ExchangeType;

public class ProcessingClass {
	
	//ExchangeType exType;
	//exType = new ExchangeType();
	private String ticketType;
	private String checkId;
	private int ticketCount;
	private String disabled;
	private int price;
	private String year;
	SimpleDateFormat sdf = null;
	Date date = null;
	DecimalFormat df = new DecimalFormat("###,###,###,###,###");
	
	public ProcessingClass() {
		sdf = new SimpleDateFormat("yyyyMMdd");
		date = new Date();
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = sdf.format(date);
	}
	
	public String getTicketType() {
		return ticketType;
	}
	
	//티켓종류
	public void setTicketType(int n) {
		if (n == FixedValue.ONEDAY_Ticket) {
			this.ticketType = "주간권";
		} else if (n == FixedValue.NIGHT_Ticket) {
			this.ticketType = "야간권 (16시~)";
		}
	}
	
	public String getCheckId() {
		return checkId;
	}
	
	public void setCheckId(String checkId) {
		ProcessingClass process = new ProcessingClass();
		int age = process.checkAge(checkId);
		
		if (age >= FixedValue.AGE_Elderly) {
			this.checkId = "노인";
		} else if (age < FixedValue.AGE_Elderly && age >= FixedValue.AGE_Adult) {
			this.checkId = "어른";
		} else if (age < FixedValue.AGE_Adult && age >= FixedValue.AGE_Teenager) {
			this.checkId = "청소년";
		} else if (age < FixedValue.AGE_Teenager && age >= FixedValue.AGE_Children) {
			this.checkId = "어린이";
		} else if (age < FixedValue.AGE_Children && age >= 0) {
			this.checkId = "유아";
		}
	}
	
	public int getTicketCount() {
		return ticketCount;
	}
	
	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}
	
	public String getDisabled() {
		return disabled;
	}
	
	public void setDisabled(int disabled) {
		if (disabled == 1) {
			this.disabled = "해당사항 없음";
		} else if (disabled == 2) {
			this.disabled = "장애인";
		} else if (disabled == 3) {
			this.disabled = "국가유공자";
		} else if (disabled == 4) {
			this.disabled = "다자녀 가정";
		} else if (disabled == 5) {
			this.disabled = "임산부";
		}
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
		
	}
	
	public int checkAge(String id) {
		SimpleDateFormat sf = new SimpleDateFormat("yy");
		Date date = new Date();
		int checkId = Integer.parseInt(id.substring(0, 2));
		int legalId = Integer.parseInt(id.substring(6, 7));
		int year = Integer.parseInt(sf.format(date));
		int realAge = 0;
		
		if (legalId == 1 || legalId == 2) {
			realAge = (year + 100) - checkId;
		} else if (legalId == 3 || legalId == 4) {
			realAge = year - checkId;
		}
		
		return realAge;
	}
	
	public int calPrice(int ticketType, String id, int ticketCount) {
		ProcessingClass process = new ProcessingClass();
		int age = process.checkAge(id);
		int totalPrice = 0;
		
		if (ticketType == FixedValue.ONEDAY_Ticket) {
			if (age > FixedValue.AGE_Elderly) {
				totalPrice = FixedValue.ONEDAY_Elderly * ticketCount;
			} else if (age < FixedValue.AGE_Elderly && age >= FixedValue.AGE_Adult) {
				totalPrice = FixedValue.ONEDAY_Adult * ticketCount;
			} else if (age < FixedValue.AGE_Adult && age >= FixedValue.AGE_Teenager) {
				totalPrice = FixedValue. ONEDAY_Teenager * ticketCount;
			} else if (age < FixedValue.AGE_Teenager && age >= FixedValue.AGE_Children) {
				totalPrice = FixedValue.ONEDAY_Children * ticketCount;
			} else if (age < FixedValue.AGE_Children && age >=0) {
				totalPrice = FixedValue.ONEDAY_baby * ticketCount;
			}
		} else if (ticketType == FixedValue.NIGHT_Ticket) {
			if (age > FixedValue.AGE_Elderly) {
				totalPrice = FixedValue.NIGHT_Elderly * ticketCount;
			} else if (age >= FixedValue.AGE_Adult && age < FixedValue.AGE_Elderly) {
				totalPrice = FixedValue.NIGHT_Adult * ticketCount;
			} else if (age < FixedValue.AGE_Adult && age >= FixedValue.AGE_Teenager) {
				totalPrice = FixedValue.NIGHT_Teenager	* ticketCount;
			} else if (age < FixedValue.AGE_Teenager && age >= FixedValue.AGE_Children) {
				totalPrice = FixedValue.NIGHT_Children * ticketCount;
			} else if (age < FixedValue.AGE_Children && age >= 0) {
				totalPrice = FixedValue.NIGHT_baby * ticketCount;
			}
		}
		
		return totalPrice;
	}
	
	public int DisabledPrice(int DisabledType, int totalPrice) {
		int result = 0;
		
		if (DisabledType == 1) {
			result = (int)(totalPrice * FixedValue.NormalPpl);
		} else if (DisabledType == 2) {
			result = (int)(totalPrice * FixedValue.Disabled);
		} else if (DisabledType == 3) {
			result = (int)(totalPrice * FixedValue.Veterans);
		} else if (DisabledType == 4) {
			result = (int)(totalPrice * FixedValue.MultiKindFam);
		} else if (DisabledType == 5) {
			result = (int)(totalPrice * FixedValue.Schwangere);
		}
		
		return result;
	}
}