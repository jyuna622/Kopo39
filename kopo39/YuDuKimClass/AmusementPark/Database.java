package AmusementPark;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Database {

	public void db(ArrayList<ProcessingClass> arrayProcess) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String time = sdf.format(date);
		
		try {
		
			/*Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
						"jdbc:mysql://127.0.0.1:3306/testdb",
						"root" ,
						"kms0411");
						*/
			Statement stmt = conn.createStatement();
			
			String data = "";
			for (int i = 0; i < arrayProcess.size(); i++) {
				ProcessingClass process = arrayProcess.get(i);
				data = String.format("Insert into `Report` (`Date`, `Ticket Type`, `Age`, `Count`, `Price`, `Treat`) "
						+ "Values ('%s', '%s', '%s', '%d', '%d', '%s')", time, process.getTicketType(), process.getCheckId()
																		,process.getTicketCount(), process.getPrice(), process.getDisabled());
				stmt.execute(data);
			}

			stmt.close();
			conn.close();
		} catch (Exception e) {
			
		}
	}
}