package L03;

public class P07 {

	public static int netprice (int price, double rate) {
		return (int)(price / (1 + rate));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//void는 반환값이 없다는 의미지만 세금 int를 반화한다.
		int price = 1234; //ㅣ상품가격
		double taxRate = 0.1;
		
		double netprice = netprice(price, taxRate);
		double tax = price - netprice; // 세금 = 소비자가격 – 세전가격
		
		System.out.printf("************************************\n"); //\n은 한칸 띄기
		System.out.printf("*      소비자가, 세전가격, 세금 계산       *\n");		
		System.out.printf("소비자가: %d, 세전가격: %d, 세금: %d\n", price, netprice, tax);
				
		System.out.printf("************************************\n");

	}

}
