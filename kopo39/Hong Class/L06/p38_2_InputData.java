package L06;

public class p38_2_InputData {

	public String[] k39_name;//이름 배열에 저장
	public int[] k39_kor;//국어점수 배열에 저장
	public int[] k39_eng;//영어점수 배열에 저장
	public int[] k39_math;//수학점수 배열에 저장
	public int[] k39_sum;//총점 배열에 저장
	public double[] k39_avg;//평균 배열에 저장
	
	p38_2_InputData(int iPerson){//생성자의 숫자(iPerson)의 크기 만큼 각 배열 생성 
		k39_name = new String[iPerson];// 총 iPerson개의 name이 들어가는 String[]
		k39_kor = new int[iPerson];// 총 iPerson개의 kor이 들어가는 int[]
		k39_eng = new int[iPerson];// 총 iPerson개의 eng이 들어가는 int[]
		k39_math = new int[iPerson];// 총 iPerson개의 math이 들어가는 int[]
		k39_sum = new int[iPerson];// 총 iPerson개의 sum이 들어가는 int[]
		k39_avg = new double[iPerson];// 총 iPerson개의 avg이 들어가는 double[]
		
	}
	
	void SetData(int i, String StudentName, int korean, int english, int mathematics) {
		//parameter를 넣어 줬을 때 각 배열에 해당하는 parameter 값을 넣어주는 메소드
		k39_name[i] = StudentName;
		k39_kor[i] = korean;
		k39_eng[i] = english;
		k39_math[i] = mathematics;
		k39_sum[i] = korean + english + mathematics;
		k39_avg[i] = k39_sum[i] / 3.0; //총점을 실수형으로 계산하기
	}
	

}
