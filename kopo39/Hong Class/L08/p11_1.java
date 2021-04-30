package L08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p11_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long k39_beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss"); //지정 포멧으로 시간get
		Calendar beforeTime_cal = Calendar.getInstance(); // 시작 - 현재시간get
		String format_time1 = format1.format(beforeTime_cal.getTime()); //위에서 지정해준 포멧으로 시간프린트해주기

		///////////////////////////////////////////////////////////////////////
		//실습1) 삼성전자 (단축코드 A005930) 만 추출하여 A005930.csv파일을 만드시오
		File k39_f = new File ("C:\\Users\\kopo39\\Desktop\\StockDailyPrice.csv"); //주가정보가 있는 파일 경로
		BufferedReader k39_br = new BufferedReader(new FileReader(k39_f)); //throw declaration: IOException 해줘야함 //BufferedReader:  한 줄 씩 읽어 들이는 readLine이라는 메소드가 있기 때문에 한 줄씩 읽어 들이기에도 유리하다
		
		File k39_f1 = new File ("C:\\Users\\kopo39\\Desktop\\A005930.csv");//A005930.csv파일로 콤마분리자 파일을 만든다.
		BufferedWriter k39_bw1 = new BufferedWriter(new FileWriter(k39_f1)); //BufferedWriter로 새로운 파일 생성하여 그 안에 내용 작성해주기
		
		String readtxt;//텍스트를 읽어줄 변수를 생성. 여러 글자이니 string함수로 만들기 
		
		int k39_cnt = 0;//총 데이터 갯수 - 0으로 초기화
		int k39_wcnt = 0; //유효한 데이터 갯수 - 0으로 초기화
		
		while((readtxt = k39_br.readLine()) != null){ //한 줄씩 읽어서 readtxt변수에 저장
			StringBuffer k39_s = new StringBuffer(); //StringBuffer생성. 값은 memory에 append하는 방식으로 클래스를 직접생성하지 않는다. 클래스가 생성될 때 method들과 variable도 같이 생성되는데, StringBuffer는 이런 시간을 사용하지 않는다.
			String[] k39_field = readtxt.split(","); //배열에 있는 내용을 읽어주고 구분자를 ,로 잡아 field배열에 저장
			
			if (k39_field[2].contains("A005930")) {//필드[2]에 삼성전자 (단축코드: A005930)가 포함되어 있다면
				k39_s.append(readtxt);// 그 내용을 readtxt에 추가하기(append)
			
				k39_bw1.write(k39_s.toString()); //BufferedWriter로 클래스의 toString() 메소드 호출 (즉, String 객체로 변환) --> 그리고 그 내용을 적기
				k39_bw1.newLine();//BufferedWriter로 csv파일 생성
				k39_wcnt++; //유효한 데이터 계속 읽기
			}
			k39_cnt++;//데이터 계속 읽기
		}
		
		k39_br.close();//버퍼리더 닫아주기 - Close를 안하면 계속 파일이 열려있어서 제어할 수 가 없다
		k39_bw1.close();//버퍼라이터도 닫아주기
		
		System.out.printf("Programme End [%d][%d] records\n", k39_cnt, k39_wcnt); //프로그램끝났다는 것을 프린트해주고 데이터와 유효한 데이터 프린트
		
		///////////////////////////////////////////////////////////////////////////
		Calendar afterTime_cal = Calendar.getInstance();// 끝 - 현재시간get
		String format_time2 = format1.format(afterTime_cal.getTime());//위에서 지정해준 포멧으로 시간프린트해주기
		long k39_afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (k39_afterTime - k39_beforeTime)/1000; //두 시간에 차 계산 초로 표현
		long minDiffTime = (k39_afterTime - k39_beforeTime)/1000/60; //두 시간에 차 계산 분으로 표현
		System.out.println("시작시간: " + format_time1); //시작시간 프린트
		System.out.println("완료시간: " + format_time2); //완료시간 프린트
		System.out.println("\n***걸린시간 : "+ minDiffTime + " 분 ( = " + secDiffTime + " 초) "); //걸린시간을 분 으로 표현하고, 초로도 표현  
	}
}