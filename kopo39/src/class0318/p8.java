package class0318;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class p8 {

	public static void main(String[] args) {
		String date = "20210318";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
				LocalDate ld = LocalDate.parse(date, dtf);
		
		System.out.println(ld);
	}

}
