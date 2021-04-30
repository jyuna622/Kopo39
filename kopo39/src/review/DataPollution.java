package review;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataPollution {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\kopo39\\Desktop\\2019airpollution.csv"));
		String line;
		ArrayList<String> pollution= new ArrayList<String>();
		while ((line = reader.readLine()) != null){
			pollution.add(line);
		}
		System.out.println(pollution.size());
		
		double sum = pollution.size();
		double min = 0;
		double max = 0;
		double avr = (double) sum / pollution.size();
		
		int cntMicrodust = 0;
		for(int i = 0; i < 8897; i++) {
			//sum += pollution(i);
			if(pollution.get(i).contains("미세먼지")) {
				cntMicrodust++;
				if (min > pollution[i]) {
					min = pollution[i];
				}
				if(max < pollution[i]) {
					max = pollution[i];
				}
				System.out.printf("    sum:  " + sum);
				System.out.printf("    min:  " + min);
			    System.out.printf("%n    max:  " + max);
			    System.out.printf("%naverage:  %.1f", avr);
			}
		}
		
		int cntOzone = 0;
		for(int i = 0; i < pollution.size(); i++) {
			if(pollution.get(i).contains("오존")) {
				cntOzone++;
				if (min > pollution[i]) {
					min = pollution[i];
				}
				if(max < pollution[i]) {
					max = pollution[i];
				}
				System.out.printf("    sum:  " + sum); 
				System.out.printf("    min:  " + min);
			    System.out.printf("%n    max:  " + max);
			    System.out.printf("%naverage:  %.1f", avr);
			}
		}
		
		int cntUltradust = 0;
		for(int i = 0; i < pollution.size(); i++) {
			if(pollution.get(i).contains("초미세먼지")) {
				cntUltradust++;
				if (min > pollution[i]) {
					min = pollution[i];
				}
				if(max < pollution[i]) {
					max = pollution[i];
				}
				System.out.printf("    sum:  " + sum); 
				System.out.printf("    min:  " + min);
			    System.out.printf("%n    max:  " + max);
			    System.out.printf("%naverage:  %.1f", avr);
			}
		}
		System.out.println("미세먼지 : " + cntMicrodust);
		System.out.println("오존 : " + cntOzone);
		System.out.println("초미세먼지 : " + cntUltradust);
	}
}