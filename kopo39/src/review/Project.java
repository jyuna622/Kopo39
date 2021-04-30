package review;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		String[][] data = getData();
	}
	
	public static String[][] getData() throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\kopo39\\Desktop\\SeoulAirPollution.csv"));
		String line;
		ArrayList<String> pollution= new ArrayList<String>();
		while ((line = reader.readLine()) != null){
			pollution.add(line);
		}
		
		String[][] pollutionData = new String[pollution.size()][];
		for (int i = 0; i < pollution.size(); i++) {
			pollutionData[i] = pollution.get(i).split(",");
		}
		
//		String[][] pol = new String[pollution.length][2];
//		for(int i = 0; i , pollution.length; i++) {
//			pol[i][0] = pollution[i][3];
//			pol[i][1] = pollution[i][4];
//		}
		System.out.println(pollution.size());
		
		for(int i = 0; i < pollution.size(); i++) {
			for(int j = 0; j < pollutionData[i].length; j++) {
				System.out.print("[" + pollutionData[i][j] + "]");
			}
			System.out.println("");
		}
		return pollutionData;
	}
	
	public static void printMenu(String pollution) {
		String[] menu = new String[6];
		for(int i = 0; i < menu.length; i++) {
			menu[2] = pollution[i];
			menu[i][] = pollution.[i][];
			//0,2 ~0,7
			System.out.println(menu[0]);
			
		}
	}
	
	
	public static void getStat(int n) {
		
	}
	
		
		/*
		System.out.println("[2019년 미세먼지, 오존]");
		
		int cntMicrodust = 0;
		int cntOzone = 0;
		
		for(int i = 0; i < pollution.size(); i++) {
			for(int j = 0; j < pollution.size(); j++) {
			double sum = 0;
			sum += Double.parseDouble(PollutionData[i][j]);
			double min = Math.min(i, j);
			double max = Math.max(i, j);
			double avr = sum / pollution.size();
			if (min > PollutionData.length) {
				min = PollutionData.length;
			}
			if(max < PollutionData.length) {
				max = PollutionData.length;
			}
			if(PollutionData[i][j].contains("미세먼지")) {
				cntMicrodust++;
				System.out.println("\n\n미세먼지");
				System.out.printf("%nsum:   %.3f", sum);
				System.out.printf("%nmin:  %.3f", min);
			    System.out.printf("%nmax:  %.3f ", max);
			    System.out.printf("%naverage:  %.3f", avr);
			    System.out.println("미세먼지(㎍/㎥) : " + cntMicrodust);
			}
			if(PollutionData[i][j].contains("오존")) {
				System.out.println("\n\n오존");
				System.out.printf("%nsum:   %.3f", sum);
				System.out.printf("%nmin:  %.3f", min);
			    System.out.printf("%nmax:  %.3f ", max);
			    System.out.printf("%naverage:  %.3f", avr);
			    cntOzone++;
			    System.out.println("오존(ppm) : " + cntOzone);
			}
		}
		System.out.println("미세먼지(㎍/㎥) : " + cntMicrodust);
		System.out.println("오존(ppm) : " + cntOzone);
		}
		
		*/
}
