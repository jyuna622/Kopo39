package L05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//거래일시
		Calendar caldr = Calendar.getInstance(); //시간 및 날짜 가져오는 함수이다.
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY.MM.dd HH:mm:ss"); //시간 표시 format --> 년도, 월, 일, 시간, 분, 초 로 출력된다 -->YYYY/MM/dd HH:mm:ss
		//단위 comma 처리
		DecimalFormat df = new DecimalFormat ("###,###,###,###"); //단위처리의 format을 정해준다. 이때 # # #가 아닌, 붙여서 ### 해야한다--> ###,###,###,###
		
		//항목1
		String k39_itemName1 = "퓨어에어 비말차단용마스크"; //아이템은 이름이니 string으로 받아준다. 입력된 가격은 변수에 저장됨.
		String k39_itemCode1 = "1031615";//아이템코드는 숫자로 인식을 하다기 보단 정보를 입력받은거니 string으로 받아준다. 입력된 가격은 변수에 저장됨.
		int k39_price1 = 3000; //가격은 ""입력이 아니니 int로 받아줘도 된다. 입력된 가격은 변수에 저장됨.
		int k39_amount1 = 1; //수량은 "'입력이 아니니 int로 받아줘도 된다. 입력된 가격은 변수에 저장됨.
		//항목2
		String k39_itemName2 = "놀이용슬라임(파랑)"; //아이템은 이름이니 string으로 받아준다. 입력된 가격은 변수에 저장됨.
		String k39_itemCode2 = "11008152"; //아이템코드는 숫자로 인식을 하다기 보단 정보를 입력받은거니 string으로 받아준다. 입력된 가격은 변수에 저장됨.
		int k39_price2 = 1000;//가격은 ""입력이 아니니 int로 받아줘도 된다. 입력된 가격은 변수에 저장됨.
		int k39_amount2 = 1;//수량은 "'입력이 아니니 int로 받아줘도 된다. 입력된 가격은 변수에 저장됨.
		//항목3
		String k39_itemName3 = "플라스틱 빗(검정)";//아이템은 이름이니 string으로 받아준다. 입력된 가격은 변수에 저장됨.
		String k39_itemCode3 = "1020800"; //아이템코드는 한자리 숫자가 아닌 긴 숫자의 연속이니 string으로 받아준다. 입력된 가격은 변수에 저장됨.
		int k39_price3 = 1000;//가격은 ""입력이 아니니 int로 받아줘도 된다. 입력된 가격은 변수에 저장됨.
		int k39_amount3 = 1;//수량은 "'입력이 아니니 int로 받아줘도 된다. 입력된 가격은 변수에 저장됨.
		
		double taxRate = 0.1; //10% 세율 // 소비자 가격 = 세전가격 + 세전가격 * 세율 = 세전가격 * (1 + 세율)
		
		// 반올림을 해주기위해 강제로 int로 변환
		double TaxPrice1 = (int)(k39_price1 / 11 * 10); // 부가세를 TaxPrice1로 double로 받아줬다. ***부가세 = 소비자 가격 - (소비자가격 / 1.1%)
		double beforeTaxPrice1 = k39_price1 - TaxPrice1; // 세전가격을 beforeTaxPrice1로 double로 받아줌. *** 세전가격 = 소비자 가격 - 부가세)
				
		double TaxPrice2 = (int)(k39_price2 / 11 * 10);  // 부가세를 TaxPrice2로 double로 받아줬다. ***부가세 = 소비자 가격 - (소비자가격 / 1.1%)
		double beforeTaxPrice2 = k39_price2 - TaxPrice2; // 세전가격을 beforeTaxPrice2로 double로 받아줌. *** 세전가격 = 소비자 가격 - 부가세)
				
		double TaxPrice3 = (int)(k39_price3 / 11 * 10);  // 부가세를 TaxPrice3로 double로 받아줬다. ***부가세 = 소비자 가격 - (소비자가격 / 1.1%)
		double beforeTaxPrice3 = k39_price3 - TaxPrice3; // 세전가격을 beforeTaxPrice3로 double로 받아줌. *** 세전가격 = 소비자 가격 - 부가세)
				
		double totalPrice =(int) ((k39_price1*k39_amount1) + (k39_price2*k39_amount2) + (k39_price3*k39_amount3)); //세금전의 가격 3개의 물건을 다 더해 합계금액 
		double totalTaxPrice = (int)(totalPrice / 11 * 10); // 부가세 = 소비자 가격 - (소비자가격 / 1.1%) // 부가세에 모든 식에 int강변화하여 소수점 없앰
		double bugase_Tax = (int) (totalPrice - totalTaxPrice); // 세전가격 = 소비자 가격 - 부가세// 세전가격에 모든 식에 int강변화하여 소수점 없앰
		
		System.out.printf("%-12s%s\n","","국민가게, 다이소");//%#s를 통해 string 간격을 정해준다. 중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬. %s의 순서대로 넣고 싶은 값/내용을 ,(콤마)를 넣어 순서대로 입력
		System.out.println("(주)아성다이소_분당서현점");
		System.out.println("전화:031-702-6016");
		System.out.println("본사:서울 강남구 남부순환도로 2748 (도곡동)");
		System.out.println("대표자:박정부,신호섭 213-81-52063");
		System.out.println("매장:경기 성남시 분당구 분당로 53번길 11 (서현동)");// 줄이 길어도 영수증에서 프린트할때는 자동으로 다음줄로 내려감.
		System.out.printf("=========================================\n");//%#s를 통해 string 간격을 정해준다. 중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬. %s의 순서대로 넣고 싶은 값/내용을 ,(콤마)를 넣어 순서대로 입력
		System.out.printf("%-7s%s\n","","소비자중심경영(CCM) 인증기업");//%#s를 통해 string 간격을 정해준다. 중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬. %s의 순서대로 넣고 싶은 값/내용을 ,(콤마)를 넣어 순서대로 입력
		System.out.printf("%-5s%s\n","","ISO 9001 품질경영시스템 인증기업");//%#s를 통해 string 간격을 정해준다. 중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬. %s의 순서대로 넣고 싶은 값/내용을 ,(콤마)를 넣어 순서대로 입력
		System.out.printf("=========================================\n");//%#s를 통해 string 간격을 정해준다. 중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬. %s의 순서대로 넣고 싶은 값/내용을 ,(콤마)를 넣어 순서대로 입력
		System.out.printf("%-6s%s\n","","교환/환불 14일 (03월 12일)이내,");//%#s를 통해 string 간격을 정해준다. 중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬. %s의 순서대로 넣고 싶은 값/내용을 ,(콤마)를 넣어 순서대로 입력
		System.out.println("(전자)영수증, 결제카드 지참후 구입매장에서 가능");// 줄이 길어도 영수증에서 프린트할때는 자동으로 다음줄로 내려감.
		System.out.printf("%-4s%s\n","","포장/가격 택 훼손시 교환/환불 불가");//%#s를 통해 string 간격을 정해준다. 중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬. %s의 순서대로 넣고 싶은 값/내용을 ,(콤마)를 넣어 순서대로 입력
		System.out.printf("%-7s%s\n","","체크카드 취소 시 최대 7일 소요");//%#s를 통해 string 간격을 정해준다. 중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬. %s의 순서대로 넣고 싶은 값/내용을 ,(콤마)를 넣어 순서대로 입력
		System.out.printf("=========================================\n");//%#s를 통해 string 간격을 정해준다. 중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬. %s의 순서대로 넣고 싶은 값/내용을 ,(콤마)를 넣어 순서대로 입력
		System.out.printf("%-8s%-9s%s\n","[POS 1058231]","", sdt.format(caldr.getTime()));// 거래 시간을 실시간으로 프린트해줌. 위에서 이미 지정해준 포맷으로 설정하여 getTime하기
		System.out.printf("=========================================\n");//%#s를 통해 string 간격을 정해준다. 중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬. %s의 순서대로 넣고 싶은 값/내용을 ,(콤마)를 넣어 순서대로 입력
		System.out.printf("%-15s %-6s%-2d%2s\n[%s]\n", k39_itemName1, df.format(k39_price1), k39_amount1, df.format(k39_price1 * k39_amount1), k39_itemCode1); //가격은 모두 df.format으로 씌어줘서 가격에 콤마가 나오게 처리
		System.out.printf("%-19s %-6s%-2d%2s\n[%s]\n", k39_itemName2, df.format(k39_price2), k39_amount2, df.format(k39_price2 * k39_amount2), k39_itemCode2); //가격은 모두 df.format으로 씌어줘서 가격에 콤마가 나오게 처리
		System.out.printf("%-20s %-6s%-2d%2s\n[%s]\n", k39_itemName3, df.format(k39_price3), k39_amount3, df.format(k39_price3 * k39_amount3), k39_itemCode3);//가격은 모두 df.format으로 씌어줘서 가격에 콤마가 나오게 처리
		System.out.printf("%-16s%-10s%6s%s\n","","과세합계:","", df.format((int)totalTaxPrice)); // 세전가격 = 소비자 가격 - 부가세, 소수점을 표시하지 않기위해 int강변화해줌 + 가격은 모두 df.format으로 씌어줘서 가격에 콤마가 나오게 처리
		System.out.printf("%-18s%-10s%7s%s\n","","부가세:","", df.format((int)bugase_Tax)); //부가세에 소수점을 표시하지 않기위해 int강변화해줌 + 가격은 모두 df.format으로 씌어줘서 가격에 콤마가 나오게 처리
		System.out.printf("-----------------------------------------\n");//%#s를 통해 string 간격을 정해준다. 중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬. %s의 순서대로 넣고 싶은 값/내용을 ,(콤마)를 넣어 순서대로 입력
		System.out.printf("%-8s%-23s%s\n","판매합계","", df.format((int)(bugase_Tax + totalTaxPrice))); //과세합계 + 부가세, 반올림을 위해 int강변화, //가격은 모두 df.format으로 씌어줘서 가격에 콤마가 나오게 처리
		System.out.printf("=========================================\n");//%#s를 통해 string 간격을 정해준다. 중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬. %s의 순서대로 넣고 싶은 값/내용을 ,(콤마)를 넣어 순서대로 입력
		System.out.printf("%-8s%-23s%s\n","신용카드","", df.format((int)(bugase_Tax + totalTaxPrice))); //과세합계 + 부가세, 반올림을 위해 int강변화, 가격은 모두 df.format으로 씌어줘서 가격에 콤마가 나오게 처리
		System.out.printf("-----------------------------------------\n");//%#s를 통해 string 간격을 정해준다. 중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬. %s의 순서대로 넣고 싶은 값/내용을 ,(콤마)를 넣어 순서대로 입력
		System.out.printf("%-8s%-13s%s\n","우리카드","","538720**********");//%#s를 통해 string 간격을 정해준다. 중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬. %s의 순서대로 넣고 싶은 값/내용을 ,(콤마)를 넣어 순서대로 입력
		System.out.println("승인번호 77982843(0)      승인금액 " + df.format((int)((int)bugase_Tax + (int)totalTaxPrice))); //승인금액 출력 + 가격은 모두 df.format으로 씌어줘서 가격에 콤마가 나오게 처리 +int강변화로 소수점 제거
		System.out.printf("=========================================\n");//%#s를 통해 string 간격을 정해준다. 중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬. %s의 순서대로 넣고 싶은 값/내용을 ,(콤마)를 넣어 순서대로 입력
		System.out.println("    " + sdt.format(caldr.getTime()) + " 분당서현점"); //캘린더 함수로 시간을 다시 출력하고 매장이름 같이 적어주기
		System.out.println("상품 및 기타 문의 : 1522-4400");
		System.out.println("멤버십 및 샵다이소 관련 문의 : 1599-2211");
		System.out.println("      || ||| |||| | |||||||||||| |||");
		System.out.println("             2112820610158231");
		System.out.printf("-----------------------------------------\n");//%#s를 통해 string 간격을 정해준다. 중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬. %s의 순서대로 넣고 싶은 값/내용을 ,(콤마)를 넣어 순서대로 입력
		System.out.println("◈ 다이소 멤버신 앱 또는 홈페이지에 접속하셔서 회원가입 후 다양한 혜택을 누려보세요! ◈"); // 줄이 길어도 영수증에서 프린트할때는 자동으로 다음줄로 내려감.
	}
}