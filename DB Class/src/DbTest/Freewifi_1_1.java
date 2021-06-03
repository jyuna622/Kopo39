package DbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Freewifi_1_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 무료와이파이 정보파일을 보고 해당 필드명으로 테이블을 만든다.
		//1. Class.forName() 을 이용해서 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver"); 
					
		//DriverManager.getConnection() 으로 연결 얻기
		//Connection 인스턴스를 이용해서 Statement 객체 생성
		Connection k39_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.75:3306/kopo39", "root", "kopo39");
						
		//Statement 객체의 결과를 ResultSet에 받기
		Statement k39_stmt = k39_conn.createStatement();
		
		k39_stmt.execute("drop table freewifi;");//우선 freewifi 테이블 지우기
		
		k39_stmt.execute(	"create table freewifi(" +				//freewifi로 테이블생성
							"no	int, " + 							//번호
							"inst_place		varchar(100), " +		//설치장소명
							"inst_place_detail varchar(200), " +	//설치장소상세
							"inst_city		varchar(50), " +		//설치시도명
							"inst_country		varchar(50), " +	//설치시군구명
							"inst_place_flag	varchar(50), " +	//설치시설구분
							"service_provider	varchar(50), " +	//서비스제공사명
							"wifi_ssid	varchar(50), " +			//와이파이 SSID
							"inst_date	date, " +			//설치년월 ->정제할 것
							"place_addr_road		varchar(200), " + //소재지 도로명주소
							"place_addr_land		varchar(200), " + //소재지 지번주소
							"manage_office		varchar(50), " +	//관리기관명
							"manage_office_phone varchar(50), " +	//관리기관전화번호
							"latitude	double, " +					//위도
							"longitude	double, " +					//경도
							"write_date		date, " +				//데이터기준일자
							"CONSTRAINT pmk PRIMARY KEY (inst_place, inst_place_detail, latitude, longitude));"); //복합 프라이머리키 설정: 설치장소명, 설치장소상세, 위도, 경도 등 pk로 설정
							//") DEFAULT CHARSET=utf8;");

		k39_stmt.close();//Statement 닫아주기 --> Open()한 만큼 close()
		k39_conn.close();//Connection 닫아주기 --> Open()한 만큼 close()
	}

}