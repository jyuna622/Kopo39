package class0325lecture9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BfR {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader (new FileReader("C:\\Users\\kopo39\\Desktop\\data\\한국도로공사_교통사고통계_20191231 (2).csv"));
		String line;
		
		for (int i = 1; i < 20; i++) {
			for (int j = 1; j < 4; i++) {
				int sum = i+j;
				System.out.println(sum);
			}
		}
		
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
			
		}
		
	}

}
