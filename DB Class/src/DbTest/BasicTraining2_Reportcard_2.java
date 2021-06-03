package DbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicTraining2_Reportcard_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. Class.forName() 을 이용해서 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver"); 						
		//DriverManager.getConnection() 으로 연결 얻기, Connection 인스턴스를 이용해서 Statement 객체 생성
		Connection k39_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.75:3306/kopo39", "root", "kopo39");					
		//Statement 객체생성
		Statement k39_stmt = k39_conn.createStatement();
		
		int k39_LineCnt = 0;
		for (int i = 0; i <= 1000; i++) {
			int k39_studentid = i;
			String k39_name = String.format("홍길%04d", i);//이름 만들기
			int k39_kor = (int)(Math.random()*100); //국어점수 최대범위100까지 랜덤 숫자
			int k39_eng = (int)(Math.random()*100); //영어점수 최대범위100까지 랜덤 숫자
			int k39_math = (int)(Math.random()*100); //수학점수 최대범위100까지 랜덤 숫자
			
			String k39_QueryTxt = String.format("insert IGNORE into ReportcardTable ("
					+ "studentid, name, kor, eng, mat)" + "values ( %s, '%s', %s, %s, %s);", 
					k39_studentid, k39_name, k39_kor, k39_eng, k39_math);
		
			k39_stmt.execute(k39_QueryTxt); //위 데이터베이스 내용을 실행하기
			System.out.printf("%d번째 항목 Insert OK [%s]\n", k39_LineCnt, k39_QueryTxt);
			
		k39_LineCnt++;	//줄 수 늘어나기			
	}
	
	
	k39_stmt.close();//Statement 닫아주기 --> Open()한 만큼 close()
	k39_conn.close();//Connection 닫아주기 --> Open()한 만큼 close()
	}
}
