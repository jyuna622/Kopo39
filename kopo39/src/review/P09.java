package review;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class P09 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		File file = new File("C:\\Users\\kopo39\\Desktop\\sports.csv");
		String path = "C:\\Users\\kopo39\\Desktop\\sports.csv";
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\kopo39\\Desktop\\sports.csv"));
		
		System.out.println("Which sports do you want? Please write in Korean.");
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
			
			System.out.printf("National team of [ %s ] is: %d in total.",name, countbasket);
	}

}

