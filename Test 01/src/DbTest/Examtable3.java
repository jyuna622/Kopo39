package DbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Examtable3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//테이블 레코드 집어넣기
		//1. Class.forName() 을 이용해서 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver"); 
							
		//DriverManager.getConnection() 으로 연결 얻기
		//Connection 인스턴스를 이용해서 Statement 객체 생성
		Connection k39_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.75:3306/kopo39", "root", "kopo39");
						
		//Statement 객체의 결과를 ResultSet에 받기
		Statement k39_stmt = k39_conn.createStatement();
						
		//Result Set이 의미가 없음. ResultSet이 필요없는 경우는 execute 함수 (executeQuery가 아님) executeQuery -> execute
		k39_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('효민', 209901, 95, 100, 95);");
		k39_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('보람', 209902, 95, 95, 95);");
		k39_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('은정', 209903, 100, 100, 100);");
		k39_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('지연', 209904, 100, 95, 90);");
		k39_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('소연', 209905, 80, 100, 70);");
		k39_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('큐리', 209906, 100, 100, 70);");
		k39_stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('화영', 209907, 70, 70, 70);");
	
					
		k39_stmt.close();//Statement 닫아주기 --> Open()한 만큼 close()
		k39_conn.close();//Connection 닫아주기 --> Open()한 만큼 close()


	}

}
