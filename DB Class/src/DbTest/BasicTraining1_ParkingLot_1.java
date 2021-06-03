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

public class BasicTraining1_ParkingLot_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		//1. Class.forName() 을 이용해서 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver"); 						
		//DriverManager.getConnection() 으로 연결 얻기, Connection 인스턴스를 이용해서 Statement 객체 생성
		Connection k39_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.75:3306/kopo39", "root", "kopo39");					
		//Statement 객체의 결과를 ResultSet에 받기
		Statement k39_stmt = k39_conn.createStatement();
		
		File k39_f = new File("C:\\Users\\kopo39\\Desktop\\KoreaParkingLotData.txt"); //전국주차장 txt파일이 있느 경로
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
			String k39_QueryTxt;//다음 데이터베이스를 다루기 위해 String변수 생성
			
			k39_QueryTxt = String.format("insert IGNORE into KoreaParkingLotData ("//primary key: 데이터가 중복이면 ignore
					+ "park_no, park_name, latitude, longitude, park_differentiate,"
					+ "park_type, park_addr_land, park_addr_road, park_section, opendays,"
					+ "wkdays_openinghours, wkdays_closinghours, sat_openinghours, sat_closinghours)"
					+ "values ("
					+ "%s, '%s', %s, %s, '%s', " //번호(no)는 int, latitude longitude는 double이어서 ''없이 그냥 %s
					+ "'%s', '%s', '%s', %s, '%s', " //주차구획수는 int라 ''없이 그냥 %s
					+ "'%s', '%s', '%s', '%s');",
					k39_field[0], k39_field[1], k39_field[2], k39_field[3], k39_field[4], 
					k39_field[5], k39_field[6], k39_field[7], k39_field[8], k39_field[9],
					k39_field[10], k39_field[11], k39_field[12], k39_field[13]
					); //'%s'와 그냥 %s, (')의 유무의 결과는 다르다.
			
			k39_stmt.execute(k39_QueryTxt); //위 데이터베이스 내용을 실행하기
			System.out.printf("%d번째 항목 Insert OK [%s]\n", k39_LineCnt, k39_QueryTxt);
			
			k39_LineCnt++;	//줄 수 늘어나기			
		}
		k39_br.close();//버퍼드리더 닫아주기
		
		k39_stmt.close();//Statement 닫아주기 --> Open()한 만큼 close()
		k39_conn.close();//Connection 닫아주기 --> Open()한 만큼 close()
		
	}

}
