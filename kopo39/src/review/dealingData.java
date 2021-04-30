package review;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class dealingData {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\kopo39\\Desktop\\2019airpollution.csv"));
		String line;
		ArrayList<String> pollution= new ArrayList<String>();
		while((line = reader.readLine()) != null) {
			pollution.add(line);
		}
		
		System.out.println(pollution.size());
		
		int total = 0;
		for(int i = 0; i < pollution.size(); i++) {
			if(pollution.get(i).contains("미세먼지") || pollution.get(i).contains("오존") || pollution.get(i).contains("초미세먼지")) {
				System.out.println(pollution.get(i));
				total++;
			}
		}
		
		System.out.printf("total : %d", total);
			
		}
}
