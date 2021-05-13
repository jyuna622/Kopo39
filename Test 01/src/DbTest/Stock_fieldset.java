package DbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Stock_fieldset {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//1. Class.forName() 을 이용해서 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver"); 
							
		//DriverManager.getConnection() 으로 연결 얻기
		//Connection 인스턴스를 이용해서 Statement 객체 생성
		Connection k39_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.75:3306/kopo39", "root", "kopo39");
								
		//Statement 객체의 결과를 ResultSet에 받기
		Statement k39_stmt = k39_conn.createStatement();
				
		//k39_stmt.execute("drop table StockDailyPrice;");//우선 StockDailyPrice 테이블 지우기
				
		k39_stmt.execute(	"create table StockDailyPrice (" +				//StockDailyPrice로 테이블생성
				   			"shrn_iscd varchar(200), " +  //유가증권 단축 종목코드 
							"bsop_date int, "+ //  주식 영업 일자
							"stck_oprc int, " + //  주식 시가
							"stck_hgpr int, " + // 주식 최고가 
							"stck_lwpr int, " + //  주식 최저가
							"stck_prpr int, " +  // 주식 종가 
							"acml_vol bigint, " + // 누적 거래량	
							"acml_tr_pbmn bigint, " + // 누적 거래 대금
							"CONSTRAINT pmk PRIMARY KEY (shrn_iscd, bsop_date));"); 
							//복합 프라이머리키 설정: 설치장소명, 설치장소상세, 위도, 경도 등 pk로 설정

		k39_stmt.close();//Statement 닫아주기 --> Open()한 만큼 close()
		k39_conn.close();//Connection 닫아주기 --> Open()한 만큼 close()

	}

}
