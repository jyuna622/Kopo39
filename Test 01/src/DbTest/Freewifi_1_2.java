package DbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Freewifi_1_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//1. Class.forName() 을 이용해서 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver"); 
					
		//DriverManager.getConnection() 으로 연결 얻기
		//Connection 인스턴스를 이용해서 Statement 객체 생성
		Connection k39_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.75:3306/kopo39", "root", "kopo39");
						
		//Statement 객체의 결과를 ResultSet에 받기
		Statement k39_stmt = k39_conn.createStatement();
		
		k39_stmt.execute("drop table freewifi;");
		

		k39_stmt.close();//Statement 닫아주기 --> Open()한 만큼 close()
		k39_conn.close();//Connection 닫아주기 --> Open()한 만큼 close()
	}

}
