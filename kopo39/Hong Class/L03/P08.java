package L03;

public class P08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] item = {"맛동산  ", "웨하스  ", "롯데샌드", "오땅   ", "사브레  "};// 배열은 순서대로 입력됨
		int[] price = {1000, 2000, 3000, 2500, 1450}; //상품가격(단가)
		int[] amount = {10, 2, 1, 3, 5}; //개수
		double taxRate = 0.1;
		int totalSum = 0;
		
		System.out.printf("*****************************************\n");
		System.out.printf("*              내가 산 과자들               *\n");
		System.out.printf(" 항 목\t    단 가\t\t수 량\t      합 계\n"); //"\t"으로 tab을 이용하여 간격 일정하게 조정
		for (int i = 0; i < item.length; i++) {
			int sum = price[i] * amount[i];
			totalSum = totalSum + sum;
			System.out.printf(" %.5s\t %7d\t %2d\t %9d\n", item[i], price[i], amount[i], sum); 
		}
		System.out.printf("*****************************************\n");
		System.out.printf("* 지불 금액 :\t %25d\n", totalSum);
		
		int total_net_price = (int) (totalSum / (1 + taxRate));
		System.out.printf("  과세금액 :\t %25d\n", total_net_price);
		int tax = totalSum - total_net_price;
		System.out.printf("  세  금 :\t %25d\n", tax); //%25d로 통일하여 간격 조정
	}

}
