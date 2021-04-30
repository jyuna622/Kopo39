package L08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p09 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long k39_beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss"); //지정 포멧으로 시간get
		Calendar beforeTime_cal = Calendar.getInstance(); // 시작 - 현재시간get
		String format_time1 = format1.format(beforeTime_cal.getTime()); //위에서 지정해준 포멧으로 시간프린트해주기
		
		File k39_f = new File ("C:\\Users\\kopo39\\Desktop\\day_data\\THTSKS010H00.dat"); //주가정보가 있는 파일 경로
		BufferedReader k39_br = new BufferedReader(new FileReader(k39_f)); //throw declaration해줘야함 ////BufferedReader:  한 줄 씩 읽어 들이는 readLine이라는 메소드가 있기 때문에 한 줄씩 읽어 들이기에도 유리하다
		
		String readtxt;//텍스트를 읽어줄 변수를 생성. 여러 글자이니 string함수로 만들기 
		
		int Linecnt = 0;//변수 initiate하기 - 0으로 초기화
		int k39_n = -1; //0보다 작을때의 범위를 고려해서 0보다 작은 값인, -1로 값을 initiate해줌
		StringBuffer k39_s = new StringBuffer(); //StringBuffer는 값은 memory에 append하는 방식으로 클래스를 직접생성하지 않는다. 클래스가 생성될 때 method들과 variable도 같이 생성되는데, StringBuffer는 이런 시간을 사용하지 않는다.
		/**String 클래스의 인스턴스는 한 번 생성되면 그 값을 읽기만 할 수 있고, 변경할 수는 없습니다. 
		 * 하지만 StringBuffer 클래스의 인스턴스는 그 값을 변경할 수도 있고, 추가할 수도 있습니다. 이를 위해 StringBuffer 클래스는 내부적으로 버퍼(buffer)라고 하는 독립적인 공간을 가짐.
		 * 버퍼 크기의 기본값은 16개의 문자를 저장할 수 있는 크기이며, 생성자를 통해 그 크기를 별도로 설정할 수도 있습니다. 하지만 인스턴스 생성 시 사용자가 설정한 크기보다 언제나 16개의 문자를 더 저장할 수 있도록 여유 있는 크기로 생성됩니다. 
		 * 덧셈(+) 연산자를 이용해 String 인스턴스의 문자열을 결합하면, 내용이 합쳐진 새로운 String 인스턴스를 생성합니다. 따라서 문자열을 많이 결합하면 결합할수록 공간의 낭비뿐만 아니라 속도 또한 매우 느려지게 됩니다.
		 * 하지만 StringBuffer 인스턴스를 사용하면 문자열을 바로 추가할 수 있으므로, 공간의 낭비도 없으며 속도도 매우 빨라집니다.
		 * **/
		
		while(true) { //while문이 true일때 
			char[] k39_ch = new char[1000]; //char문자 배열은 1000개
			k39_n = k39_br.read(k39_ch); //위에 char를 bufferedreader통해 읽어주기
			
			if (k39_n == -1) //n값이 -1일때의 if 조건 생성.
				break;//n값이 -1되면 break 걸어주기.
			for (char c : k39_ch) { //for each (변수타입(char) 변수이름(c) : 배열이름 (ch) - 배열의 항목 수만큼 실행부분을 반복하는데, 반복할때마다 배열의 헝목을 순서대로 꺼내어 변수(number)에 자동대입 
				if(c == '\n') { //for문의 실행부분 - char가 문단띄기를 만났을때
					System.out.printf("[%s]***\n", k39_s.toString()); //StringBuffer로 클래스의 toString() 메소드 호출 (즉, String 객체로 변환)
					k39_s.delete(0, k39_s.length()); //추가한 버퍼들을 삭제시켜주기. 0부터 끝까지(끝의 크기를 알기위해 length()써줌)
				} else {
					k39_s.append(c);//c의 내요을 추가
				}
			}
			Linecnt++;//줄 수가 하나씩 증가
		}
		System.out.printf("[%s]***\n", k39_s.toString());
		k39_br.close();//버퍼리더 닫아주기 - Close를 안하면 계속 파일이 열려있어서 제어할 수 가 없다
		
		
		Calendar afterTime_cal = Calendar.getInstance();// 끝 - 현재시간get
		String format_time2 = format1.format(afterTime_cal.getTime());//위에서 지정해준 포멧으로 시간프린트해주기
		long k39_afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (k39_afterTime - k39_beforeTime)/1000; //두 시간에 차 계산 초로 표현
		long minDiffTime = (k39_afterTime - k39_beforeTime)/1000/60; //두 시간에 차 계산 분으로 표현
		System.out.println("시작시간: " + format_time1); //시작시간 프린트
		System.out.println("완료시간: " + format_time2); //완료시간 프린트
		System.out.println("\n***걸린시간 : "+ minDiffTime + " 분 ( " + secDiffTime + " 초) "); //걸린시간을 분 으로 표현하고, 초로도 표현  
	}
}