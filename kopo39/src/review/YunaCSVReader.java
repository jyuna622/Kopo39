package review;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class YunaCSVReader {
	//Get "sum, min, max, avr, med" of Microdust
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		System.out.println("Air Pollution (Microdust) data of Seoul from 2019-Nov-01 to 2019-Dec-31\n");
		
		getData d = new getData();
		ArrayList<Float> microdusts = d.getDataOfColumn(5); // Microdust is in column F
		
		//max
		float maxMicrodusts = Collections.max(microdusts);
		System.out.println("- Maximum of Microdusts: " + maxMicrodusts + "(§¶/§©)");
		
		//min
		float minMicrodusts = Collections.min(microdusts);
		System.out.println("- Minimum of Microdusts: " + minMicrodusts + "(§¶/§©)");
		
		//sum
		float totalMicrodusts = 0f;
		for(float cnt : microdusts) {
			totalMicrodusts += cnt;
		}
		System.out.println("- Total of Microdusts: " + totalMicrodusts + "(§¶/§©)");
		
		//avr
		int countMicrodust = microdusts.size();

		float averageMicrodusts = totalMicrodusts/countMicrodust;
		System.out.println("- Average of Microdusts: " + averageMicrodusts + "(§¶/§©)");
		
		//med
		float medianMicrodusts = getMedian(microdusts);
		System.out.println("- MedianMicrodusts: " + (int) medianMicrodusts + "(§¶/§©)");

	}

	static class getData {

		public ArrayList<Float> getDataOfColumn(int colNr) throws IOException {
			BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\jyuna\\OneDrive\\Desktop\\2019airpollution.csv"));
			String line;
			ArrayList<Float> colValues = new ArrayList<Float>();
			boolean firstLine = true;
			while ((line = read.readLine()) != null) {
				if(firstLine) { //skip the first line (heading of file)
					firstLine = false;
					continue;
				}
				String[] cols = line.split(",");
				String colValue = cols[colNr];
				colValues.add(Float.parseFloat(colValue));
			}

			return colValues;
		}

	}
	public static float getMedian(ArrayList<Float> colValues) {
		Collections.sort(colValues);
		int middle = colValues.size() / 2;
		middle = middle > 0 && middle % 2 == 0 ? middle - 1 : middle; // ? = if else --> http://www.cafeaulait.org/course/week2/43.html
		/*if (middle-1 > middle) {
		int jungang = middle;
		}
		else {
		jungang = 0
		*/
		
		return colValues.get(middle);
	}
}

/*
 * int min = 100;
		int max = 0;
		
		for(int i = 0; i < total.length; i++) {
			if (total[i] < min) {
				min = total[i];
			}
			if (total[i] > max) {
				max = total[i];
			}
		}

		System.out.printf("\nMax: ", max);
		System.out.printf("\nMin: ", min);
		*/
