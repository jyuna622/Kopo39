package L06;

public class p38_1_ReportSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k39_iPerson = 10; //이 값을 주는 만큼 저장소 생성
		
		p38_2_InputData inData = new p38_2_InputData(k39_iPerson); //생성자의 숫자를 준 만큼 배열을 만듬
		
		for (int i = 0; i < k39_iPerson; i++) {
			String k39_name = String.format("홍길%02d", i);//이름 만들기
			int k39_kor = (int)(Math.random()*100); //국어점수 최대범위100까지 랜덤 숫자
			int k39_eng = (int)(Math.random()*100); //영어점수 최대범위100까지 랜덤 숫자
			int k39_math = (int)(Math.random()*100); //수학점수 최대범위100까지 랜덤 숫자
			inData.SetData(i, k39_name, k39_kor, k39_eng, k39_math); //클래스 내 값 입력
		}
		
		for (int i = 0; i < k39_iPerson; i++) {//입력된 값이 잘 들어갔는지 확인
			System.out.printf("번호: %d, 이름: %s, 국어: %s, 영어: %s, 수학: %d,\t총점: %d,\t평균: %f\n", 
					i, inData.k39_name[i], inData.k39_kor[i], inData.k39_eng[i], inData.k39_math[i], 
					inData.k39_sum[i], inData.k39_avg[i]);
		}
	}

}
