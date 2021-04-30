package L08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p06 {

	public static void Kopo39_FileWrite() throws IOException { //파일에 글을 입력할 용 클래스 생성
		File k39_f = new File ("C:\\Users\\kopo39\\Desktop\\p06MyTest.txt"); // 파일 저장 디렉토리를 C:\...바탕화면으로 경로를 지정하여 텍스트 파일로 저장
		/**
		 * Buffer란? 다른 말로 메모리를 의미하는데, 메모리가 있기 때문에 입출력 시에 병목현상을 줄일 수 있다. 
		 * 빠른 속도로 읽어들이거나, 빠른 속도로 쓰고자 할때 읽어 들여야 할 대상과 써야할 대상 간의 속도 차이 때문에 병목현상이 일어날 수 있기 때문이다. 
		 * 따라서 중간에 버퍼를 둠으로써 읽기와 쓰기 시 성능이 향상될 수 있다.
		 */
		
		BufferedWriter k39_bw = new BufferedWriter(new FileWriter(k39_f)); //BufferedWriter --> Buffer를 가지고 ks9_f의 내용을 쓰게 허용해주는 함수이다.
		//BufferedWriter의 경우, 버퍼가 있기때문에 반드시 flush()메소드를 이용하거나 close()메소드를 호출 해줘야만 한다. 그렇지 않고 프로그램을 종료하게 되면 버퍼의 내용을 완전하게 쓸 수 없게 된다. 
		//특히 네트워크 프로그래밍의 경우에는  write()메소드를 호출한 후에는 반드시  flush()메소드를 호출해 줘야한다.
		k39_bw.write("안녕 파일");//파일에 글을 쓰고 싶을땐, BufferedWriter.write(""); p06MyTest.txt파일에 "안녕 파일"이라는 텍스트가 입력됨. 첫줄
		k39_bw.newLine(); //newLine() 같은 함수를 사용하여 한 줄(\n)단위 새로운 라인 생성. 그러면 다음 line으로 넘어감
		k39_bw.write("hello 헬로");//파일에 글을 쓰고 싶을땐, BufferedWriter.write(""); p06MyTest.txt파일에 "hello 헬로"라는 텍스트가 입력됨. 둘재줄
		k39_bw.newLine();//newLine() 같은 함수를 사용하여 한 줄(\n)단위 새로운 라인 생성.그러면 다음 line으로 넘어감
		
		k39_bw.close();// 파일에 글쓰기 종료해주기 위해 BufferedWriter.close(); 해줌. 그럼 파일 내용적기 종료됨
	}
	
	public static void Kopo39_FileRead() throws IOException {//파일을 읽어주기 위해 파일읽기용 클래스 생성. IOException을 클래스 위로 던져서 시스템 메시지로 받는예
		File k39_f = new File ("C:\\Users\\kopo39\\p06MyTest.txt");// 파일 저장 디렉토리를 C:\...바탕화면으로 경로를 지정하여 텍스트 파일로 저장
		BufferedReader k39_br = new BufferedReader (new FileReader(k39_f));//BufferedReader -  한 줄 씩 읽어 들이는  readLine이라는 메소드가 있기 때문에 한 줄씩 읽어 들이기에도 유리하다 
		String readtxt; //텍스트를 읽어줄 변수를 생성. 여러 글자이니 string함수로 만들기 
		
		while ((readtxt = k39_br.readLine()) != null) { //버퍼리더의 다음 줄들을 읽고 그 내용을 readtxt변수에 저장해 준다. readLine()  같은 함수를 사용하여 한줄(\n)단위로 읽는다
			System.out.printf("%s\n", readtxt); //저장된 readtxt내용들을 출력하여 한줄씩 띄어준다.
		}
		k39_br.close();//버퍼리더 닫아주기 - Close를 안하면 계속 파일이 열려있어서 제어할 수 가 없다
	}
	
	public static void main (String[] args) throws IOException {
		// TODO Auto-generated method stub
		Kopo39_FileWrite();//위에 있던 클래스를 main클래스로
		Kopo39_FileRead();//위에 만들었던 클래스를 main클래스로
		
	}

}