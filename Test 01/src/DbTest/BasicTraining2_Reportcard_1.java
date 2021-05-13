package DbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicTraining2_Reportcard_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. Class.forName() 을 이용해서 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver"); 						
		//DriverManager.getConnection() 으로 연결 얻기, Connection 인스턴스를 이용해서 Statement 객체 생성
		Connection k39_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.75:3306/kopo39", "root", "kopo39");					
		//Statement 객체생성
		Statement k39_stmt = k39_conn.createStatement();
		
		k39_stmt.execute("drop table ReportcardTable;");// 테이블 지우기
		
		k39_stmt.executeUpdate(	"create table ReportcardTable(" //테이블 생성
								+ "studentid int not null primary key, " 	//학번, 프라이머리키 설정
								+ "name varchar(20), "		//이름
								+ "kor int, "				//국어
								+ "eng int, "				//영어
								+ "mat int);");				//수학
								/*+ "indv_total int, "		//개인별 총점
								+ "indv_average double, "	//개인별 평균
								+ "page_total double, " 	//페이지별 총점
								+ "page_avr double, "		//페이지별 평균
								+ "cumltd_total double, " 	//누적 총점
								+ "cumltd_average double);");	//누적 평균		
*/
		//연결 닫기
		k39_stmt.close();//Statement 닫아주기 --> Open()한 만큼 close()
		k39_conn.close();//Connection 닫아주기 --> Open()한 만큼 close()
	}
}
