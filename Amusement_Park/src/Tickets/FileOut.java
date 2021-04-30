package Tickets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FileOut {

	SimpleDateFormat sdf = null;
	Date date = null;
	FileWriter fw = null;
	
	public void FileOut (ArrayList<ProcessingClass> arrayProcess) {
		try {
			ProcessingClass processing = null;
			sdf = new SimpleDateFormat("yyyy-MM-dd");
			date = new Date();
			fw = new FileWriter(FixedValue.File_Route, true);
			String s = "";
			
			for (int i = 0; i < arrayProcess.size(); i++) {
				processing = arrayProcess.get(i);
				s += sdf.format(date) + ",";
				s += processing.getTicketType() + ",";
				s += processing.getCheckId() + ",";
				s += processing.getTicketCount() + ",";
				s += processing.getPrice() + ",";
				s += processing.getDisabled() + "\n";
				
				fw.write(s);
			}
			fw.close();
		} catch(Exception e) {
			
		}
	}
}