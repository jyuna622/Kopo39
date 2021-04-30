package L04;

public class P06_ppt17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k39_iVal;
		
		for (int i = 0; i < 300; i++) { //0부터 299까지 돌림
			k39_iVal = 5 * i; 
			
			if (k39_iVal >= 0 && k39_iVal <10) //0에서 9 까지
				System.out.printf("일 %d\n", k39_iVal); // 0에서 9 까지'일'
			else if (k39_iVal >= 10 && k39_iVal <100) //10에서 99 까지
				System.out.printf("십 %d\n", k39_iVal); //10에서 99 까지'십'
			else if (k39_iVal >= 100 && k39_iVal <1000)//100에서 999 까지
				System.out.printf("백 %d\n", k39_iVal);//100에서 999 까지 '백'
			else 
				System.out.printf("천 %d\n", k39_iVal);//그외는 '천'
		}
	}

}
