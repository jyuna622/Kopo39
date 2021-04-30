package class0325lecture9;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreammm {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] content = new byte[1000];
		FileInputStream input = new FileInputStream("C:\\Users\\kopo39\\Desktop\\data.csv");
		
		input.read(content);
		String allLine = new String(content);
		System.out.println(allLine);
		
		input.close();
	}

}
