package L04;

import java.text.DecimalFormat;

public class printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 칸 맞춰 인쇄
		String kopo39_item = "사과"; //단어이니까 string으로 받아줌
		int kopo39_unit_price =5000; //unit price는 5000원 입력
		int kopo39_num =500; //갯수는 500개 설정
		int kopo39_total =0; // initiate
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###"); //자릿수 format 설정
		
		System.out.printf("=============================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n","품목","단가","수량","합계"); // 한글을 1s로 인식한다. (즉 한글 한자당 -1을 해야 한다. 당해보면 안다)
		System.out.printf("=============================================================\n");
		
		System.out.printf("%20.20s%10.10s%7.10s%12.10s\n",
				kopo39_item,df.format(kopo39_unit_price), df.format(kopo39_num),df.format(kopo39_unit_price * kopo39_num));
		//품목","단가","수량","합계" 순대로의 값을 출력
		System.out.printf("=============================================================\n");
	}

}
