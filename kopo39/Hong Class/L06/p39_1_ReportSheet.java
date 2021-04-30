package L06;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p39_1_ReportSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k39_iPerson = 31; //이 값을 주는 만큼 저장소 생성
		p39_2_InputData inData = new p39_2_InputData(k39_iPerson); //생성자의 숫자를 준 만큼 배열을 만듬
		
		for (int i = 0; i < k39_iPerson; i++) {
			String k39_name = String.format("홍길%02d", i);//이름 만들기
			int k39_kor = (int)(Math.random()*100); //국어점수 최대범위100까지 랜덤 숫자
			int k39_eng = (int)(Math.random()*100); //영어점수 최대범위100까지 랜덤 숫자
			int k39_math = (int)(Math.random()*100); //수학점수 최대범위100까지 랜덤 숫자
			inData.SetData(i, k39_name, k39_kor, k39_eng, k39_math); //클래스 내 값 입력
		}
		////////////////////////////////
		//Head
		Calendar caldr = Calendar.getInstance(); //시간 및 날짜 가져오는 함수
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY.MM.dd HH:mm:ss"); //시간 표시 format --> 년도, 월, 일, 시간, 분, 초 로 출력된다
		System.out.printf("%-20s%s\n\n","", "성적집계표");
		System.out.printf("%-32s%s\n", "", "출력일자 : " + sdt.format(caldr.getTime()));
		System.out.println("===================================================================");
		System.out.printf("%-4s %-9s %-5s %-5s %-7s %-7s %s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.println("===================================================================");
		
		////////////////////////////////
		//Body
		int k39_korsum = 0;	int k39_koravg = 0; //국어의 합계와 평균
		int k39_engsum = 0;	int k39_engavg = 0; //영어의 합계와 평균
		int k39_mathsum = 0;	int k39_mathavg = 0; //수학의 합계와 평균
		int k39_totalsum = 0;	int k39_avgoftotal = 0; //합계의 총점와 평균
		int k39_totalavg = 0;	int k39_avgofavg = 0; //평균의 총점와 평균
		
		for (int i = 0; i < k39_iPerson; i++) {//입력된 값이 잘 들어갔는지 확인
			System.out.printf("%03d %7s %8s %7s %7d %9d %9d\n", 
					i, inData.k39_name[i], inData.k39_kor[i], inData.k39_eng[i], inData.k39_math[i], 
					inData.k39_sum[i], inData.k39_avg[i]);
			
					k39_korsum += inData.k39_kor[i]; //국어 총점
					k39_engsum += inData.k39_eng[i]; //수학 총점
					k39_mathsum += inData.k39_math[i]; //영어 총점
					k39_totalsum += inData.k39_sum[i]; //총점의 합계
					k39_totalavg += inData.k39_avg[i]; //총평균
					
					k39_koravg = k39_korsum/30; //30명의 국어 평균
					k39_engavg = k39_engsum/30;//30명의 영어 평균
					k39_mathavg = k39_mathsum/30;//30명의 수학 평균
					k39_avgoftotal = k39_totalsum/30;//30명의 합계평균
					k39_avgofavg = k39_totalavg/30;//30명의 총 평균의 평균
		}
		////////////////////////////////
		//Tail		
		System.out.println("===================================================================");
		System.out.printf("합계 %17d %7d %7d %9d %9d\n", k39_korsum, k39_engsum, k39_mathsum, k39_totalsum, k39_totalavg);
		System.out.printf("평균 %17d %7d %7d %9d %9d\n", k39_koravg, k39_engavg, k39_mathavg, k39_avgoftotal, k39_avgofavg);
		}
		
}