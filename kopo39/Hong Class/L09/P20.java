package L09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class P20 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser parser = new JSONParser(); //데이터를우(json안에 json) JsonParser를 사용하여 파싱할 수 있다.
		
		Object obj = parser.parse(new FileReader ("C:\\Users\\kopo39\\Desktop\\test.json")); //파싱할 test.json파일 경로
		
		JSONArray array = (JSONArray)obj; //딱히 키가 없는 어레이라 이런식으로 연결
		
		System.out.println("****************************************");
		for (int i = 0; i < array.size(); i++) { //어레이만큼 반복
			JSONObject result = (JSONObject) array.get(i); //Array에서 하나를 빼온다
			System.out.println("이름 : " + result.get("name")); //이름 가져오기
			System.out.println("학번 : " + result.get("studentid")); //학번 가져오기
			
			JSONArray score = (JSONArray) result.get("score");//성적을 가져오는데 이것도 배열
			long kor = (long)score.get(0); //배열줄 첫번째 = 국어 //int는 32비트, long은 62비트
			long eng = (long)score.get(1); //배열줄 두번째 = 영어//int는 32비트, long은 62비트
			long math = (long)score.get(2); //배열줄 세번째 = 수학 .. 이때 잘못만들어진 json배열이 3개가 아니면 에러남 //int는 32비트, long은 62비트
			System.out.println("국어 : " + kor); //국어점수 풀력
			System.out.println("영어 : " + eng);//영어점수 풀력
			System.out.println("수학 : " + math);//수학점수 풀력
			System.out.println("총점 : " + (kor + eng + math)); //국+영+수를 더한 총점 출력
			System.out.println("평균 : " + ((kor + eng + math) / 3.0)); //세가지 항목이니 총점을 3.0으로 나눔
			System.out.println("****************************************");
			
		}
		
	}

}
