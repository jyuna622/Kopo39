package class0325lecture9;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File ("C:\\Users\\kopo39\\Desktop\\trycatch");
		File files[] = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}
}