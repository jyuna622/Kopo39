package L05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class p7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//상품가격을 스캐너로 스캔하여 사용자가 직접 입력하게 해주었다. --> 변수값을 변경해야해서 SCANNER로 사용자가 값을 입력하게 했다.
		int k39_iPrice= scan.nextInt(); //상품가격을 스캐너로 스캔하여 사용자가 직접 입력하게 해주었다. 스캐너로 입력한 값을 k39_iPrice변수에 저장해준다. 그리고 그 값으로 부가세 및 금액 계산된다.
		double taxRate = 0.1; //10% 세율 	// 소비자 가격 = 세전가격 + 세전가격 * 세율 = 세전가격 * (1 + 세율)
		//b(부가세) = a(금액) * 0.1
		//b 	  = a(금액) * 1/10
		//y(합계) =  a(금액) + b(부가세)
		// y = a(금액) + a*0.1 = a(1+0.1) = a*1.1= a(11/10)
		// a = y / (11/10) = y * 10 / 11
		double beforeTaxPrice = (int)((k39_iPrice / 11. * 10.)); // 부가세를 TaxPrice을 double로 받아줬다. ***부가세 = 소비자 가격 - (소비자가격 / 1.1%)
		double justPrice = k39_iPrice - beforeTaxPrice; // 세전가격을 beforeTaxPrice로 double로 받아줌. *** 세전가격 = 소비자 가격 - 부가세
		
		
		//거래일시
		Calendar caldr = Calendar.getInstance();//시간 및 날짜 가져오는 함수이다. 영수증에 거래일시에 혀내날짜를 실시간으로 출력해줘야하기 때문에 시간을 바로가져올 수 있는 함수 활용
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY/MM/dd HH:mm:ss"); //시간 표시 format --> 년도, 월, 일, 시간, 분, 초 로 출력된다 -->YYYY/MM/dd HH:mm:ss

		//단위 comma 처리
		DecimalFormat df = new DecimalFormat ("###,###,###,###");   //단위처리의 format을 정해준다. 이때 # # #가 아닌, 붙여서 ### 해야한다 --> ###,###,###,###
		
		System.out.println("신용승인");
		System.out.printf("%-8s%4s%s\n","단말기 : 2N68665898","", "전표번호 : 041218"); //%#s를 통해 string 간격을 정해준다 //중간에 ""를 넣어 중간 빈칸 조절
		System.out.println("가맹점 : 한양김치찌개");
		System.out.println("주  소 : 경기 성남시 분당구 황새울로351번길 10 , 1층");// 줄이 길어도 영수증에서 프린트할때는 자동으로 다음줄로 내려감.
		System.out.println("대표자 : 유창신");
		System.out.printf("%-8s%7s%s\n","사업자 : 752-53-00558","","TEL : 7055695");//%#s를 통해 string 간격을 정해준다 //중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬
		System.out.println("*****************************************");
		
		// 금액, 부가세, 합계를 차례로 출력
		System.out.printf("금  액" + "%-23s%9s%s\n","",df.format(beforeTaxPrice)," 원");//세전가격 = 소비자 가격 - 부가세 //%#s를 통해 string 간격을 정해준다 //df.format으로 씌어줘서 가격에 콤마가 나오게 처리
		System.out.printf("부가세" + "%-23s%9s%1s\n","",df.format(justPrice)," 원");//부가세는 소비자가격 * 세율 //%#s를 통해 string 간격을 정해준다 //df.format으로 씌어줘서 가격에 콤마가 나오게 처리
		System.out.printf("합  계" + "%-23s%9s%1s\n","",df.format(k39_iPrice)," 원");  //가격은 모두 df.format으로 씌어줘서 가격에 콤마가 나오게 처리 //%#s를 통해 string 간격을 정해준다
		System.out.println("*****************************************");
		System.out.println("우리카드");
		System.out.println("카드번호 : 5387-20**-****-4613(S)  일시불");
		System.out.printf("거래 일시: %s\n", sdt.format(caldr.getTime())); // 거래 시간을 실시간으로 프린트해줌 + //가격은 모두 df.format으로 씌어줘서 가격에 콤마가 나오게 처리
		System.out.println("승인번호 : 70404427");
		System.out.println("거래번호 : 357734873739");
		System.out.println("매입 : 비씨카드사	 가맹 : 720068568");
		System.out.println("알림 : EDC매출표");
		System.out.println("문의 : TEL)1544-4700");
		System.out.println("*****************************************");
		System.out.printf("%-13s%s\n","", "* 감사합니다 *");//%#s를 통해 string 간격을 정해준다 //중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬
		System.out.printf("%-22s%s\n","", "표준V2.08_20200212");///%#s를 통해 string 간격을 정해준다 //중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬
	}
}