package review;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class newdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		File file = new File("C:\\Users\\kopo39\\Desktop\\2019airpollution.csv");
		String path = "C:\\Users\\kopo39\\Desktop\\2019airpollution.csv";
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\kopo39\\Desktop\\2019airpollution.csv"));
		
		System.out.println("Which pollution do you want?");
		System.out.println("Option: 미세먼지, 오존, 일산화탄소농도");
		String name = scan.nextLine();
		String line;
			int count = 0;
			int countbasket = 0;
			while ((line = reader.readLine()) != null) {
				count += 1;
				if (line.contains(name)) {
					countbasket ++;
				}
			}
				
			System.out.printf("The result of [ %s ] is: %d in total.",name, countbasket);
	}
}