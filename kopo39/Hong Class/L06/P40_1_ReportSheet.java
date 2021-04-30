package L06;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P40_1_ReportSheet {

	static int k39_korsum_total; //국어 누적 총점
	static int k39_engsum_total; //수학 누적 총점
	static int k39_mathsum_total; //영어 누적 총점
	static int k39_totalsum_total; //총점의 누적 총점
	static int k39_totalavg_total; //총평균 누적 총점
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k39_iPerson = 200; //이 값을 주는 만큼 저장소 생성
		p40_2_InputData inData = new p40_2_InputData(k39_iPerson); //생성자의 숫자를 준 만큼 배열을 만듬
		int page = 1; //페이지 수 
		Calendar caldr = Calendar.getInstance(); //시간 및 날짜 가져오는 함수
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY.MM.dd HH:mm:ss"); //시간 표시 format --> 년도, 월, 일, 시간, 분, 초 로 출력된다
		
		int k39_korsum = 0;	int k39_koravg = 0; //국어의 합계와 평균
		int k39_engsum = 0;	int k39_engavg = 0; //영어의 합계와 평균
		int k39_mathsum = 0;	int k39_mathavg = 0; //수학의 합계와 평균
		int k39_totalsum = 0;	int k39_avgoftotal = 0; //합계의 총점와 평균
		int k39_totalavg = 0;	int k39_avgofavg = 0; //평균의 총점와 평균
		
		for (int i = 0; i < k39_iPerson; i++) {
			String k39_name = String.format("홍길%03d", (i + 1));//이름 만들기
			int k39_kor = (int)(Math.random() * 100); //국어점수 최대범위100까지 랜덤 숫자
			int k39_eng = (int)(Math.random() * 100); //영어점수 최대범위100까지 랜덤 숫자
			int k39_math = (int)(Math.random() * 100); //수학점수 최대범위100까지 랜덤 숫자
			inData.SetData(i, k39_name, k39_kor, k39_eng, k39_math); //클래스 내 값 입력
		}
		
		///////////////////////
		//Head
		System.out.printf("%-20s%s\n\n","", "성적집계표");
		System.out.printf("Page : " + page + "%-32s%s\n", "", "출력일자 : " + sdt.format(caldr.getTime()));
		System.out.println("========================================================================");
		System.out.printf("%-4s %-9s %-5s %-5s %-7s %-7s %s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.println("========================================================================");
		
		/////////////////////
		//Body	
		int cnt = 0;//번호를 cnt 변수 생성하여 초기화
		for (int i = 0; i < k39_iPerson; i++) {//입력된 값이 잘 들어갔는지 확인
			cnt++;//번호 하나씩 증가
			System.out.printf("%03d%7s %8s %7s %7d %9d %9d\n", 
					(i + 1), inData.k39_name[i], inData.k39_kor[i], inData.k39_eng[i], inData.k39_math[i], 
					inData.k39_sum[i], inData.k39_avg[i]);
			
					k39_korsum += inData.k39_kor[i]; //국어 총점
					k39_engsum += inData.k39_eng[i]; //수학 총점
					k39_mathsum += inData.k39_math[i]; //영어 총점
					k39_totalsum += inData.k39_sum[i]; //총점의 합계
					k39_totalavg += inData.k39_avg[i]; //총평균
					
					k39_korsum_total += inData.k39_kor[i]; //국어 총점
					k39_engsum_total += inData.k39_eng[i]; //수학 총점
					k39_mathsum_total += inData.k39_math[i]; //영어 총점
					k39_totalsum_total += inData.k39_sum[i]; //총점의 합계
					k39_totalavg_total += inData.k39_avg[i]; //총평균
			
					
			/////////////////
			//Tail
			if (cnt % 30 == 0 && cnt < k39_iPerson) {
				page++;//페이지 수 하나씩 증가
				System.out.println("========================================================================");
				//current total score
				System.out.println("현재페이지");
				System.out.printf("합계 %17d %7d %7d %9d %9d\n", k39_korsum, k39_engsum, k39_mathsum, k39_totalsum, k39_totalavg);//현 페이지 인원의 합계
				System.out.printf("평균 %17d %7d %7d %9d %9d\n", k39_korsum/30, k39_engsum/30, k39_mathsum/30, k39_totalsum/30, k39_totalavg/30); //각페이지당 인원이 30명이니 30으로 나눔
				System.out.println("========================================================================");
				
				//Cumulative score
				System.out.println("누적페이지");
				System.out.printf("합계 %17d %7d %7d %9d %9d\n", k39_korsum_total, k39_engsum_total, k39_mathsum_total, k39_totalsum_total, k39_totalavg_total);//누적합계 점수
				System.out.printf("평균 %17d %7d %7d %9d %9d\n\n", k39_korsum_total/cnt, k39_engsum_total/cnt, k39_mathsum_total/cnt, 
						k39_totalsum_total/cnt, k39_totalavg_total/cnt);//누적점수을 누적인원으로 나눔
				
				//값 초기화
				k39_korsum = 0; k39_engsum = 0; k39_mathsum = 0; k39_totalsum = 0; k39_totalavg = 0;
				

				System.out.printf("\n%-20s%s\n\n","", "성적집계표");
				System.out.printf("Page : " + page + "%-32s%s\n", "", "출력일자 : " + sdt.format(caldr.getTime()));
				System.out.println("========================================================================");
				System.out.printf("%-4s %-9s %-5s %-5s %-7s %-7s %s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
				System.out.println("========================================================================");
			}
		}
		
		System.out.println("========================================================================");
		//current total score
		System.out.println("현재페이지");
		System.out.printf("합계 %17d %7d %7d %9d %9d\n", k39_korsum, k39_engsum, k39_mathsum, k39_totalsum, k39_totalavg);//현 페이지 인원의 합계
		System.out.printf("평균 %17d %7d %7d %9d %9d\n", k39_korsum/20, k39_engsum/20, k39_mathsum/20, k39_totalsum/20, k39_totalavg/20);//마지막 페이지 인원이 20명이니 20으로 나눔
		System.out.println("========================================================================");
		//Cumulative score
		System.out.println("누적페이지");
		System.out.printf("합계 %17d %7d %7d %9d %9d\n", k39_korsum_total, k39_engsum_total, k39_mathsum_total, k39_totalsum_total, k39_totalavg_total);//누적합계 점수
		System.out.printf("평균 %17d %7d %7d %9d %9d\n\n", k39_korsum_total/cnt, k39_engsum_total/cnt, k39_mathsum_total/cnt, 
				k39_totalsum_total/cnt, k39_totalavg_total/cnt);//누적점수을 누적인원으로 나눔
		
	}		
}