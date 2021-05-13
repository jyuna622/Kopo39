package DbTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Freewifi_2_3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, ParseException {
		// 무료와이파이 정보파일을 읽고 DB에 값을 집어넣어보자.
		//1. Class.forName() 을 이용해서 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver"); 
							
		//DriverManager.getConnection() 으로 연결 얻기
		//Connection 인스턴스를 이용해서 Statement 객체 생성
		Connection k39_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.75:3306/kopo39", "root", "kopo39");
								
		//Statement 객체의 결과를 ResultSet에 받기
		Statement k39_stmt = k39_conn.createStatement();
		
		File k39_f = new File("C:\\Users\\kopo39\\Desktop\\freewifiinfo.txt"); //무료와이파이 txt파일이 있느 경로
		BufferedReader k39_br = new BufferedReader(new FileReader(k39_f)); //파일리더의 자식클래스인 버퍼드리더의 문법
		
		String k39_readtxt;//텍스트를 읽어줄 String변수 생성
		
		if ((k39_readtxt = k39_br.readLine()) == null) { //다음 줄의 텍스트를 읽는데 내용이 없을때의 조건
			System.out.printf("빈 파일입니다\n");
			return;
		}
				
		String[] k39_field_name = k39_readtxt.split("\t"); //txt파일은 tab으로 분리됨. 그래서 tab으로 split
		
		int k39_LineCnt = 0; //줄 갯수 초기화
		while ((k39_readtxt = k39_br.readLine()) != null) { //다음 줄의 텍스트를 읽는데 내용이 존재할 때
			String[] k39_field = k39_readtxt.split("\t");//txt파일은 tab으로 분리됨. 그래서 tab으로 split. 그리고 그것을 field에 저장
			String k39_QueryTxt; //다음 데이터베이스를 다루기 위해 String변수 생성
			
			SimpleDateFormat k39_sdf1 = new SimpleDateFormat("MMM-yy", Locale.ENGLISH); //설치날짜가 Jan 이런식으로 되어있으니,  Locale.ENGLISH로 이 날짜 형식을 인식하게함.
			SimpleDateFormat k39_sdf2 = new SimpleDateFormat("yy-MM-01");//변환할 date타입 형식 포멧. 일수는 값이 없으니 임의날짜로 지정
			Date k39_date;
			String k39_reDate = "";
			
			if (k39_field[8] != "") {//설치날짜=field[8]인 inst_date의 값이 공백이 아니면의 조건
				k39_date = k39_sdf1.parse(k39_field[8]); //sdf1포멧으로 필드8을 변환한 후 date 변수에 저장
				k39_reDate = k39_sdf2.format(k39_date); //sdf2포멧으로 위의 date 변환후 reDate에 저장
			} else {
				k39_reDate = "5000-06-22"; //설치날짜가 공백인 필드도 있음. 이 경우, 임의 날짜 5000-06-22로 저장.(6월22일은 내 생일)
			}
			
			k39_QueryTxt = String.format("insert IGNORE into freewifi (" //primary key: 데이터가 중복이면 ignore
					+ "no, inst_place, inst_place_detail, inst_city, inst_country, inst_place_flag,"
					+ "service_provider, wifi_ssid, inst_date, place_addr_road, place_addr_land,"
					+ "manage_office, manage_office_phone, latitude, longitude, write_date)"
					+ "values ("
					+ "%s, '%s', '%s', '%s', '%s', '%s', " //번호(no)는 int여ㅛㅓ ''없이 그냥 %s
					+ "'%s', '%s', '%s', '%s', '%s', "
					+ "'%s', '%s', %s, %s, '%s');",
					k39_field[0], k39_field[1], k39_field[2], k39_field[3], k39_field[4], k39_field[5],
					k39_field[6], k39_field[7], k39_reDate, k39_field[9], k39_field[10],		//필드8은 reDate로 교체
					k39_field[11], k39_field[12], k39_field[13], k39_field[14], k39_field[15]
					); //'%s'와 그냥 %s, (')의 유무의 결과는 다르다. --> double이여서 '없음
			
			k39_stmt.execute(k39_QueryTxt); //위 데이터베이스 내용을 실행하기
			System.out.printf("%d번째 항목 Insert OK [%s]\n", k39_LineCnt, k39_QueryTxt);
			
			k39_LineCnt++;	//줄 수 늘어나기			
		}
		k39_br.close();//버퍼드리더 닫아주기
		
		k39_stmt.close();//Statement 닫아주기 --> Open()한 만큼 close()
		k39_conn.close();//Connection 닫아주기 --> Open()한 만큼 close()
	}

}
