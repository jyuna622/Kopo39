package class0325lecture9;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamm {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream output = new FileOutputStream("C:\\Users\\kopo39\\Desktop\\new.txt");
		for (int i = 1; i < 11; i++) {
			String data = "Line #" + i + "Age,"+"School," + "\n";
			output.write(data.getBytes());
		}
		output.close();
	}

}
