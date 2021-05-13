package DbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Examtable4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 테이블 읽기
		//1. Class.forName() 을 이용해서 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver"); 
			
		//DriverManager.getConnection() 으로 연결 얻기
		//Connection 인스턴스를 이용해서 Statement 객체 생성
		Connection k39_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.75:3306/kopo39", "root", "kopo39");
				
		//Statement 객체의 결과를 ResultSet에 받기
		Statement k39_stmt = k39_conn.createStatement();
		ResultSet k39_rset = k39_stmt.executeQuery("select * from examtable;");
		
		System.out.printf("  이름  학번	국어	영어	수학\n");
				
		while (k39_rset.next()) { //ResultSet이 다음값일때 조건문
			System.out.printf("%4s	%6d	%3d	%3d	%3d \n", 
					k39_rset.getString(1), k39_rset.getInt(2), k39_rset.getInt(3), k39_rset.getInt(4), k39_rset.getInt(5));//각 해당 값을 해당하는 string과 int에 값을 출력
		}
				
		k39_rset.close(); //ResultSet 닫아주기
		k39_stmt.close(); //Statement 닫아주기
		k39_conn.close(); //Connection 닫아주기

	}

}
