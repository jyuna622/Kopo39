package DbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicTraining2_Reportcard_3 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//실습3) 페이지당 30명씩 성적집계표 출력 
		//(단 개인별 총점/평균, 페이지별 총점/평균, 누적 총점/평균 은 select 쿼리문에서 처리할 것 
						
		//1. Class.forName() 을 이용해서 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver"); 						
		//DriverManager.getConnection() 으로 연결 얻기, Connection 인스턴스를 이용해서 Statement 객체 생성
		Connection k39_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.75:3306/kopo39", "root", "kopo39");					
		//Statement 객체생성
		Statement k39_stmt = k39_conn.createStatement();
		//k39_QueryTxt = "select * from ReportcardTable"; //전부보기
		ResultSet k39_rset;
		String k39_QueryTxt;
		
		int start = 0; 
		int k39_page = 0;
		
		while(true) {	
			k39_page++;
			System.out.printf("\n%-22s%s\n\n","", "성적집계표");
			System.out.printf("Page : " + k39_page + "%-32s%s\n", " ", " ");
			System.out.println("========================================================================");
			System.out.printf("%-5s %-10s %-5s %-5s %-7s %-7s %s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
			System.out.println("========================================================================");
			
			k39_QueryTxt = String.format("select *, kor + eng + mat, (kor + eng + mat)/3 from ReportcardTable where studentid > %d and studentid <= %d;", start, start + 30);			
			k39_rset = k39_stmt.executeQuery(k39_QueryTxt);//Statement 객체의 결과를 ResultSet에 받기
			while (k39_rset.next()) {
				//페이지 출력용
				System.out.printf("%04d    %-10s  %-7s %-7s %-9s %-9s %s\n", k39_rset.getInt(1), k39_rset.getString(2), k39_rset.getInt(3), 
						k39_rset.getInt(4), k39_rset.getInt(5), k39_rset.getInt(6), k39_rset.getInt(7));
			}
			k39_rset.close();//ResultSet 닫아주기 --> Open()한 만큼 close()
			
			/////////////////////////
			//Current total Score
			k39_QueryTxt = String.format("select sum(kor), sum(eng), sum(mat), sum(kor+eng+mat), sum((kor+eng+mat) / 3) from ReportcardTable where studentid < 31 and studentid >= 0;");
			k39_rset = k39_stmt.executeQuery(k39_QueryTxt);//Statement 객체의 결과를 ResultSet에 받기
			while (k39_rset.next()) {				
				System.out.println("========================================================================");		
				System.out.println("현재페이지");	
				System.out.printf("*합계 %20d %7d %7d %9d %9d\n", k39_rset.getInt(1), k39_rset.getInt(2), k39_rset.getInt(3), 
						k39_rset.getInt(4), k39_rset.getInt(5));
				System.out.printf("*평균 %20d %7d %7d %9d %9d\n\n", k39_rset.getInt(1)/30, k39_rset.getInt(2)/30, k39_rset.getInt(3)/30, 
						k39_rset.getInt(4)/30, k39_rset.getInt(5)/30);
			}
			k39_rset.close();//ResultSet 닫아주기 --> Open()한 만큼 close()
			
			/////////////////////////
			//Cumulative Score
			k39_QueryTxt = String.format("select sum(kor), sum(eng), sum(mat), sum(kor+eng+mat), sum((kor+eng+mat) / 3) from ReportcardTable where studentid > 0 and studentid <= %d;", start + 30);
			k39_rset = k39_stmt.executeQuery(k39_QueryTxt);
			while (k39_rset.next()) {
				System.out.println("누적페이지");
				System.out.printf("*합계 %20d %7d %7d %9d %9d\n", k39_rset.getInt(1), k39_rset.getInt(2), k39_rset.getInt(3), 
						k39_rset.getInt(4), k39_rset.getInt(5));
				System.out.printf("*평균 %20d %7d %7d %9d %9d\n", k39_rset.getInt(1)/(start+30), k39_rset.getInt(2)/(start+30), k39_rset.getInt(3)/(start+30), 
						k39_rset.getInt(4)/(start+30), k39_rset.getInt(5)/(start+30));
			System.out.println("========================================================================");		
						
			start += 30;
			}
			k39_rset.close();//ResultSet 닫아주기 --> Open()한 만큼 close()	
					
			if(start > 1000) break;
		}
												
		k39_stmt.close();//Statement 닫아주기 --> Open()한 만큼 close()
		k39_conn.close();//Connection 닫아주기 --> Open()한 만큼 close()
						
	}
}