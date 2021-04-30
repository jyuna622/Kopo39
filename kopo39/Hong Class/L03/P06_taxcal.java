package L03;

public class P06_taxcal {

public static int taxcal (int val, int rate) { //쿠팡에서 산 맛동산 세금계산
		int k39ret;
		
		if (((double) val * (double)rate / 100/0) == val * rate / 100)
			k39ret = val * rate / 100;
		else
			k39ret = val * rate/100 + 1; // 세금은 1원 미만 금액이 생기명 무조건 1원 더 받을 것
		return k39ret; //ret값을 돌려줌
	}
	
public static void main (String[] args) {
	
	int taxrate = 10; // 세금 10퍼센트
	int aftertaxprice = 1234; // 쿠팡에서 맛동산을 소비자가 1234원에 판매하기로함
	int val = (int) (aftertaxprice / 1.1); //세전 물건값
			
	int tax = taxcal (val, taxrate);
	System.out.printf("************************************\n"); //\n은 한칸 띄기
	System.out.printf("*            단순 세금 계산            *\n");
	System.out.printf("실제 세금계산: %f\n", val * taxrate / 100.0); //하나라도 double형식 연산을 하면 실수로 표시.
	
	System.out.printf("세전가격: %d, 세금: %d, 세금포함가격: %d\n", val, tax, val + tax);
			
	System.out.printf("************************************\n");
}
}
