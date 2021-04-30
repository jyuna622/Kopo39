package class0318;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class timezone {

	public static void main(String[] args) {
		TimeZone time;
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:zZ");
		
		time = TimeZone.getTimeZone("Europe/Zurich");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
		
		time = TimeZone.getTimeZone("Asia/Seoul");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
	}

}
