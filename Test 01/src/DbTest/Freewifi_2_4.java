package DbTest;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Freewifi_2_4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,  UnsupportedEncodingException {
		// 무료와이파이 table 읽기
		//1. Class.forName() 을 이용해서 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver"); 
							
		//DriverManager.getConnection() 으로 연결 얻기
		//Connection 인스턴스를 이용해서 Statement 객체 생성
		Connection k39_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.75:3306/kopo39", "root", "kopo39");					
		//Statement 객체의 결과를 ResultSet에 받기
		Statement k39_stmt = k39_conn.createStatement();
		double k39_lat = 37.3860521; //위도
		double k39_lng = 127.1214038; //경도
		
		
		String k39_QueryTxt;//다음 데이터베이스를 다루기 위해 String변수 생성
		k39_QueryTxt = String.format(	"select * from freewifi where " + 
										"SQRT( POWER( latitude-%f, 2) + POWER (longitude-%f, 2 ) ) = " +
										"(select MIN( SQRT( POWER( latitude-%f, 2) + POWER (longitude-%f, 2 ) ) ) from freewifi);", 
										k39_lat, k39_lng, k39_lat, k39_lng); //가까운 지점 select
		
		//k39_QueryTxt = "select * from freewifi"; //전부보기
		//k39_QueryTxt = "select * from freewifi where service_provider = 'SKT'";//SKT꺼만 찾기
		k39_QueryTxt = "select * from freewifi where inst_country = '노원구'";//노원구꺼만 찾기
		
		ResultSet k39_rset = k39_stmt.executeQuery(k39_QueryTxt);//Statement 객체의 결과를 ResultSet에 받기
		int k39_iCnt = 0; //라인카운트 값 초기화
		while (k39_rset.next()) { //다음 줄의 텍스트를 읽는데 내용이 존재할 때
			System.out.printf("*(%d)***************************************************\n", k39_iCnt++); //갯수 증가
			System.out.printf("설치장소명		: %s\n", k39_rset.getString(2));
			System.out.printf("설치장소상세		: %s\n", k39_rset.getString(3));
			System.out.printf("설치시도명		: %s\n", k39_rset.getString(4));
			System.out.printf("설치시군구명		: %s\n", k39_rset.getString(5));
			System.out.printf("설치시설구분		: %s\n", k39_rset.getString(6));
			System.out.printf("서비스제공사명		: %s\n", k39_rset.getString(7));
			System.out.printf("와이파이SSID		: %s\n", k39_rset.getString(8));
			System.out.printf("설치년월		: %s\n", k39_rset.getString(9));
			System.out.printf("소재지도로명주소	: %s\n", k39_rset.getString(10));
			System.out.printf("소재지지번주소		: %s\n", k39_rset.getString(11));
			System.out.printf("관리기관명		: %s\n", k39_rset.getString(12));
			System.out.printf("관리기관전화번호	: %s\n", k39_rset.getString(13));
			System.out.printf("위도			: %f\n", k39_rset.getFloat(14));
			System.out.printf("경도			: %f\n", k39_rset.getFloat(15));
			System.out.printf("데이터기준일자		: %s\n", k39_rset.getDate(16));
			System.out.printf("**********************************************************\n");

		
		}		
		k39_rset.close();//ResultSet 닫아주기 --> Open()한 만큼 close()
		k39_stmt.close();//Statement 닫아주기 --> Open()한 만큼 close()
		k39_conn.close();//Connection 닫아주기 --> Open()한 만큼 close()
	}

		
		
}