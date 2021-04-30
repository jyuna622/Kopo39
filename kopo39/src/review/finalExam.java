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

public class finalExam {
	public static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) throws IOException {
		getData d = new getData();
		getStat s = new getStat();
		
		ArrayList<String> freeK = d.getFile();
		ArrayList<String> city = s.getCity(freeK);
		s.getTotal(freeK, city);

	}
	
static class getData{
	
	public ArrayList<String> getFile() throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\kopo39\\Desktop\\2019airpollution.csv"));
		String line;
		ArrayList<String> freeKitchen = new ArrayList<String>();
		
		while((line = read.readLine()) != null) {
			freeKitchen.add(line);
		}
		
		return freeKitchen;
		
	}
	
}

static class getStat{
	
	public ArrayList<String> getCity(ArrayList<String> free) {
		String[][] adr = new String[free.size()][];
		ArrayList<String> adress = new ArrayList<String>();
		
		
		for(int i = 0; i < free.size(); i++) {
			adr[i] = free.get(i).split(","); 
		}

		for(int i = 1; i < free.size(); i++) {
			adress.add(adr[i][1]);
		}
		
		//get city and district
		String[][] newAd = new String[adress.size()][];
		HashSet<String> City = new HashSet<String>();
		
		for(int i = 0; i < adress.size(); i++) {
			newAd[i] = adress.get(i).split(" ");
		}
		
		for(int i = 0; i < newAd.length; i++) {
			City.add(newAd[i][0]);
		}
	
		//System.out.println(City.size());
		
		ArrayList<String> city = new ArrayList<String>(City);
		
		Collections.sort(city);
		
		city.remove(0);
		
		return city;
		}
	
	public void getTotal(ArrayList<String> free, ArrayList<String> city) {
		int[] total = new int[city.size()];
		
		int cnt = 1;
		for(int i = 0; i < free.size(); i++) {
			for(int j = 0; j < city.size(); j++) {
				if(free.get(i).contains(city.get(j))) {
					total[j] += cnt;
				}
			}
		}
		
		System.out.printf("媛� �떆�뿉 �엳�뒗 臾대즺湲됱떇�냼�뒗 珥� %d 媛쒖씠�떎.\n", free.size());
		for(int i = 0; i < total.length; i++) {
			System.out.println(city.get(i) + ":" + total[i]);
		}
		
		System.out.printf("�슦由щ굹�씪�뿉 �룊洹좎쟻�쑝濡� 臾대즺湲됱떇�냼�뒗 %d 媛쒓� �엳�떎.\n", free.size() / city.size());
		
		int min = 100;
		int max = 0;
		
		for(int i = 0; i < total.length; i++) {
			if (total[i] < min) {
				min = total[i];
			}
			if (total[i] > max) {
				max = total[i];
			}
		}

		System.out.printf("臾대즺湲됱떇�냼媛� 媛��옣 留롮� �룄�뿉�뒗 %d媛쒓� �엳�떎", max);
		System.out.printf("臾대즺湲됱떇�냼媛� 媛��옣 �쟻�� �룄�뿉�뒗 %d媛쒓� �엳�떎", min);
	}
}
}//package closing
