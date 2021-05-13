package DbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTest1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//JDBC란: 자바에서 제공하는 데이터베이스와 연결하여 데이터를 주고 받을 수 있도록 하는 인터페이스
		
		//1. Class.forName() 을 이용해서 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		//DriverManager.getConnection() 으로 연결 얻기
		//Connection 인스턴스를 이용해서 Statement 객체 생성
		Connection k39_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.75:3306/kopo39", "root", "kopo39");
		
		//Statement 객체의 결과를 ResultSet에 받기
		Statement k39_stmt = k39_conn.createStatement();
		ResultSet k39_rset = k39_stmt.executeQuery("show databases;");
		
		while (k39_rset.next()) { //ResultSet이 다음값일때 조건문
			System.out.println("값 : " + k39_rset.getString(1));//첫번째(1) 값을 출력
		}
		
		k39_rset.close(); //ResultSet 닫아주기
		k39_stmt.close(); //Statement 닫아주기
		k39_conn.close(); //Connection 닫아주기
		
	}

}
