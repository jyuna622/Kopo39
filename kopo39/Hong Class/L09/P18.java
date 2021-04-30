package L09;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class P18 {

	public static JSONObject oneRec (String name, int studentid, int kor, int eng, int math) {//반복되는 일이니 함수로 빼줌
		JSONObject k39_dataObject = new JSONObject(); //JsonObject는 객체(주로 String)을 Json객체로 바꿔주거나 Json객체를 새로 만드는 역할을 합니다.
		k39_dataObject.put("name", name); //json object에 name넣기
		k39_dataObject.put("studentid", studentid); //json object에 학번넣기
		//Json Array 생성
		JSONArray k39_score = new JSONArray(); //json들이 들어있는 Array(json 이외의 다른 데이터도 들어갈 수 있음)
		k39_score.add(kor); //한국어점수 array에 추가
		k39_score.add(eng);//영어점수 array에 추가
		k39_score.add(math);//수학점수 array에 추가
		k39_dataObject.put("score", k39_score); //"score하고 추가
		
		return k39_dataObject; //이 내용을 리턴해주기 
	}
	
	
	public static void main(String[] args) {
		JSONObject k39_jsonObject = new JSONObject();//최종 완성될 JSONObject 선언 (전체)
		
		JSONArray k39_dataArray = new JSONArray();//한명 성적의 JSON정보를 담을 Array 선언
		
		
		JSONObject k39_dataObject = new JSONObject();//한명 정보가 들어갈 JSONObject 선언
		k39_dataObject.put("name", "나연"); //나연 이름 추가
		k39_dataObject.put("studentid", 20991);//학번도 추가 
		
		
		JSONArray k39_score = new JSONArray();//Json Array score 생성.
		k39_score.add(90); //나연 - 90점추가
		k39_score.add(100);//나연 - 100점추가
		k39_score.add(95);//나연 - 95점추가
		k39_dataObject.put("score", k39_score); //"score하고 추가
		k39_dataArray.add(k39_dataObject);//array에 이 나연정보 추가 
		
		//깔끔하게 함수 처리
		k39_dataArray.add(oneRec("정연", 209902, 100, 85, 75)); //나연과 같이 나머지 멤버도 입력
		k39_dataArray.add(oneRec("모모", 209903, 90, 75, 85));//나연과 같이 나머지 멤버도 입력
		k39_dataArray.add(oneRec("사나", 209904, 90, 85, 75));//나연과 같이 나머지 멤버도 입력
		k39_dataArray.add(oneRec("지효", 209905, 80, 75, 85));//나연과 같이 나머지 멤버도 입력
		k39_dataArray.add(oneRec("미나", 209906, 90, 85, 55));//나연과 같이 나머지 멤버도 입력
		k39_dataArray.add(oneRec("다연", 209907, 70, 75, 65));//나연과 같이 나머지 멤버도 입력
		k39_dataArray.add(oneRec("채영", 209908, 100, 75, 95));//나연과 같이 나머지 멤버도 입력
		k39_dataArray.add(oneRec("쯔위", 209909, 80, 65, 95));//나연과 같이 나머지 멤버도 입력
		
		try {
			FileWriter k39_file = new FileWriter ("C:\\Users\\kopo39\\Desktop\\test.json"); //내요을 test.json으로 파일라이터로 입력
			k39_file.write(k39_dataArray.toJSONString()); //array로 받아주기
			k39_file.flush(); //flush()는 현재 버퍼에 저장되어 있는 내용을 클라이언트로 전송하고 버퍼를 비운다.
			k39_file.close(); //파일 라이터 닫아주기
		} catch (IOException e) {
			e.printStackTrace(); //예외처리
		}
		System.out.println("JSON 만든거 : " + k39_dataArray); //json만든거를 array로 출력
		
	}

}
