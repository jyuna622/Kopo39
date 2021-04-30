package L06;

public class p11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p11_2 k39_cc = new p11_2();//p11_2클래스 호출, 그리고 cc라고 재정의
		
		System.out.println("3월 성적표");
		System.out.println("======================================================");
		System.out.printf("%s%5s%5s%5s%5s%5s\n", "이름", "국어", "영어", "수학", "총점",  "평균"); //각 %s칸에 맞게 입력
		System.out.println("======================================================");
		System.out.printf("%s%5s%7s%7s %6s%8s\n", "폴리융", 100, 100, 100, 
				k39_cc.k39_sum(100, 100, 100), k39_cc.k39_avg(100, 100, 100));//3개형 덧셈&평균 메소드
		System.out.println("\n\n4월 성적표");
		System.out.println("======================================================");
		System.out.printf("%s%5s%5s%5s%5s%5s%5s\n", "이름", "국어", "영어", "수학", "과학", "총점",  "평균");
		System.out.println("======================================================");
		System.out.printf("%s%5s%7s%7s%7s %6s%8s\n", "폴리융", 100, 100, 100, 100, 
				k39_cc.k39_sum(100, 100, 100, 100), k39_cc.k39_avg(100, 100, 100, 100));//4개형 덧셈&평균 메소드
		System.out.println("\n\n5월 성적표");
		System.out.println("======================================================");
		System.out.printf("%s%5s%5s%5s%5s%5s%5s%5s\n", "이름", "국어", "영어", "수학", "과학", "사회", "총점",  "평균");
		System.out.println("======================================================");
		System.out.printf("%s%5s%7s%7s%7s%7s %6s%8s\n", "폴리융", 100, 100, 100, 100, 100,
				k39_cc.k39_sum(100, 100, 100, 100, 100), k39_cc.k39_avg(100, 100, 100, 100, 100));//5개형 덧셈&평균 메소드
	}
}
