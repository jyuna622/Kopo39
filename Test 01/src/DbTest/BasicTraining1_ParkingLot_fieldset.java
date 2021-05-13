package DbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicTraining1_ParkingLot_fieldset {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. Class.forName() 을 이용해서 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver"); 
							
		//DriverManager.getConnection() 으로 연결 얻기
		//Connection 인스턴스를 이용해서 Statement 객체 생성
		Connection k39_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.75:3306/kopo39", "root", "kopo39");
								
		//Statement 객체의 결과를 ResultSet에 받기
		Statement k39_stmt = k39_conn.createStatement();
				
		k39_stmt.execute("drop table KoreaParkingLotData;");//우선 KoreaParkingLotData 테이블 지우기
				
		k39_stmt.execute(	"create table KoreaParkingLotData(" +				//KoreaParkingLotData로 테이블생성
							"park_no	int, " + 							//주차장관리번호
							"park_name		varchar(200), " +		//주차장명
							"latitude	double, " +					//위도
							"longitude	double, " +					//경도
							"park_differentiate		varchar(50), " +		//주차장구분
							"park_type		varchar(50), " +	//주차장유형
							"park_addr_land		varchar(200), " + //주차장지번주소
							"park_addr_road		varchar(200), " + //주차장도로명주소
							"park_section	int, " +	//주차구획수
							"opendays	varchar(50), " +			//운영요일
							"wkdays_openinghours	varchar(50), " +			//평일운영시작시간
							"wkdays_closinghours	varchar(50), " +			//평일종료시작시간
							"sat_openinghours	varchar(50), " +			//토요일운영시작시간
							"sat_closinghours	varchar(50), " +			//토요일졸료시작시간
							"CONSTRAINT pmk PRIMARY KEY (park_no, park_name, park_addr_road, latitude, longitude));"); 
							//복합 프라이머리키 설정: 설치장소명, 설치장소상세, 위도, 경도 등 pk로 설정

		k39_stmt.close();//Statement 닫아주기 --> Open()한 만큼 close()
		k39_conn.close();//Connection 닫아주기 --> Open()한 만큼 close()

	}

}
