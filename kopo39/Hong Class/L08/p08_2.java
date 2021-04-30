package L08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;

public class p08_2 {

	public static void main(String[] args) throws IOException {
		// \는 특수문자이므로 \\두개를 써야한다.
		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss"); //지정 포멧으로 시간get
		Calendar beforeTime_cal = Calendar.getInstance(); // 시작 - 현재시간get
		String format_time1 = format1.format(beforeTime_cal.getTime()); //위에서 지정해준 포멧으로 시간프린트해주기
		
		//////////////////////////////////////////////////////////////////////////////////		
		File k39_f = new File ("C:\\Users\\kopo39\\Desktop\\서울무료와이파이정보(수정).txt");//무료와이파이.csv가 데이터가 읽기 어려워 엑셀에서 텝으로 분리되는 txt파일로 저장.
		BufferedReader k39_br = new BufferedReader (new FileReader(k39_f));//BufferedReader -  한 줄 씩 읽어 들이는  readLine이라는 메소드가 있기 때문에 한 줄씩 읽어 들이기에도 유리하다 
		
		String k39_readtxt;//텍스트를 읽어줄 변수를 생성. 여러 글자이니 string함수로 만들기 
				
		//한줄을 먼저 읽어야 필드명을 알 수 있다.
		if((k39_readtxt = k39_br.readLine()) == null) {//버퍼리더의 다음 줄들을 읽고 그 내용이 비어있을때 readtxt변수에 저장해 준다. readLine()  같은 함수를 사용하여 한줄(\n)단위로 읽는다
			System.out.printf("빈 파일 입니다.\n");//비어있으면(=null) "빈파일입니다"라고 출력
			return;
		}
		String[] k39_field_name = k39_readtxt.split("\t");//파일의 첫째줄인 readtxt를 tab기준으로 잘라서 field_name String 배열에 저장
		
		//융합기술교육원 위도경도, 지도에서 알아보기
		double k39_lat = 37.38598768667056; //위도 latitude
		double k39_lng = 127.12126026892624; //경도 longitude
		
		double k39_min = Double.MAX_VALUE; //두 거리간의 거리가 제일 가까운 것을 구해야하니, 최소값을 구하는 함수적용
		String nearest = "";//제일 가까운 거리의 주소를 저장할 빈 String 변수 선언
		String nearest_lat = "";//가장 가까운 장소의 위도를 저장항 빈 String 변수 선언
		String nearest_lng = "";//가장 가까운 장소의 경도를 저장항 빈 String 변수 선언
		
		//double max = Collections.max(null);
		double k39_max = Double.MIN_VALUE;//두 거리간의 거리가 제일 먼 것을 구해야하니, 최댓값을 구하는 함수적용
		String furthest = ""; //제일 먼 거리일때의 주소를 저장할 빈 String 변수 선언
		String furthest_lat = "";//가장 먼 장소의 위도를 저장항 빈 String 변수 선언
		String furthest_lng = "";//가장 먼 장소의 경도를 저장항 빈 String 변수 선언
		
		int k39_LineCnt = 0;//변수 initiate하기 - 0으로 초기화
		
		while ((k39_readtxt = k39_br.readLine()) != null) { //그 다음부터 한줄씩 읽어서 readtxt에 넣고 null이 아닐(!=)때까지(-->끝까지)		
			String[] field = k39_readtxt.split("\t"); //readtxt를 tab기준으로 잘라서 field String배열에 저장
			System.out.printf("**[%d번째 항목]*********************************\n", k39_LineCnt);// 줄 수가 몇번째인지 출력
			System.out.printf("  %s : %s\n", k39_field_name[9], field[9]); //9번 : 지번주소
			System.out.printf("  %s : %s\n", k39_field_name[13], field[13]); //13번 : 위도주소
			System.out.printf("  %s : %s\n", k39_field_name[14], field[14]); //14번 : 경도주소
			double k39_dist = Math.sqrt(Math.pow(Double.parseDouble(field[13])-k39_lat,2) // 피타고라스 정리의 원리를 이용하여 위도 거리구하기: 루트{(a-c)^2+(b-d)^2}
					+ Math.pow(Double.parseDouble(field[14])-k39_lng,2)); // 피타고라스 정리의 원리를 이용하여 경도 거리구하기: 루트{(a-c)^2+(b-d)^2}
			System.out.printf("  현재지점과 거리 : %f\n", k39_dist ); //13번 : 경도주소
			System.out.printf("**************************************************\n"); //다음내용과 구분하기 위해 구분선추가 
			
			//min, max구하기
			if (k39_dist < k39_min) { //만약에 거리가 min값보다 작다면,
				k39_min = k39_dist;	//그 값을 min에 저장해주고,
				nearest = field[9] + " " + field[1];//9번째 지번주소 내용을 nearest변수에 저장해준다.
				nearest_lat = field[13];//가장가까운장소의 위도
				nearest_lng = field[14];//가장먼 장소의 경도
			} else if (k39_dist > k39_max) { //반대로 만약에 거리가 max보다 크다면,
				k39_max = k39_dist;	//그 값을 max에 저장해주고,
				furthest = field[9] + " " + field[1]; //9번째 지번주소 내용을 furthest변수에 저장해준다.
				furthest_lat = field[13];//가장 먼 장소의 위도
				furthest_lng = field[14];//가장 먼 장소의 경도
			}
			k39_LineCnt++;//줄 수가 하나씩 증가
		}
		System.out.printf("\n\n**한국폴리텍대학 분당융합기술교육원과 가장 가까운 장소: \n->%s\n->현재지점과 거리: %.6f\n", nearest, k39_min); //가장 가까운 거리를 저장한 nearest변수를 소수점 6번째자리까지 프린트
		System.out.printf("->위도: %s\n->경도: %s\n\n", nearest_lat, nearest_lng); //가장 가까운 장소의 위도, 경도
		System.out.printf("**한국폴리텍대학 분당융합기술교육원과 가장 먼 장소: \n->%s\n->현재지점과 거리: %.6f\n", furthest, k39_max); //가장 먼 거리를 저장한 furthest변수를 소수점 6번째자리까지 프린트
		System.out.printf("->위도: %s\n->경도: %s\n\n", furthest_lat, furthest_lng);//가장 먼 장소의 위도, 경도
		k39_br.close();//버퍼리더 닫아주기 - Close를 안하면 계속 파일이 열려있어서 제어할 수 가 없다
		
		//////////////////////////////////////////////////////////////////////////////////
		Calendar afterTime_cal = Calendar.getInstance();// 끝 - 현재시간get
		String format_time2 = format1.format(afterTime_cal.getTime());//위에서 지정해준 포멧으로 시간프린트해주기
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
		System.out.println("시작시간: " + format_time1); //시작시간 프린트
		System.out.println("완료시간: " + format_time2); //완료시간 프린트
		System.out.println("\n***걸린시간 : "+secDiffTime + " 초 ***"); //걸린시간 프린트
	}
}