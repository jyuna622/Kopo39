package L03;

public class P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#4.원하는 자릿수 반올림, 버림처리
		int k39_ii;
		//버리기
		k39_ii = 12345;   // 12345원은 10원이하 버려서처리하기.
		int j = (k39_ii / 10) * 10; //정수형 연산의 특징을 잘 이해해야 한다.
		System.out.printf("#4-1 : %d\n", j);
		
		//반올림
		k39_ii = 12345;   // 12345원은 10원이하 반올림 처리하기.
		j = ((k39_ii + 5) / 10) * 10; 
		System.out.printf("#4-2 : 10원이하 반올림 --> %d\n", j);
		
		//////////
				
		k39_ii = 12345;   // 12345원은 100원이하 반올림
		j = ((k39_ii + 5) / 100) * 100; 
		System.out.printf("#4-X : 100원이하 반올림 --> %d\n", j);
		
		k39_ii = 12345;   // 12345원은 100원이하 버림
		j = ((k39_ii) / 100) * 100; 
		System.out.printf("#4-X : 100원이하 버림 --> %d\n", j);
		
		//////////
				
		k39_ii = 12345;   // 12345원은 1000원이하 반올림 처리하기.
		j = ((k39_ii + 5) / 1000) * 1000; 
		System.out.printf("#4-X : 1000원 반올림 --> %d\n", j);
		
		k39_ii = 12345;   // 12345원은 1000원이하 버림 처리하기.
		j = ((k39_ii) / 1000) * 1000; 
		System.out.printf("#4-X : 1000원 버림 --> %d\n", j);
		
				
		//검증
		k39_ii = 12344;   // 12344원은 10원이하 버려서처리하기.
		j = (k39_ii / 10) * 10; //이 식이 맞는지 검증해보기
		System.out.printf("#4 검증 : %d\n", j);
	}

}
