package L09;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class p12_weather {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		//피씽을 위한 준비
		DocumentBuilder k39_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
				
		//xml파일을 처리 pc안에 있어서 전체경로를 지정, xml피싱처리 시작
		Document k39_doc = k39_docBuilder.parse(new File("C:\\Users\\kopo39\\Desktop\\queryDFS.xml"));
				
		String k39_seq = ""; //48시간 중 몇번째인지 가르킴
		String k39_hour = ""; //동네예보 3시간 단위
		String k39_day = ""; //1번재 날 (0: 오늘/ 1: 내일/ 2; 모레)
		String k39_temp = ""; //현재 시간온도
		String k39_tmx = ""; //최고 온도
		String k39_tmn = ""; //최저 온도
		String k39_sky = ""; //하늘 상태코드 (1: 맑음, 2: 구름조금, 3:구름 많음, 4: 흐림)
		String k39_pty = ""; //강수 상태코드 (0: 없음, 1: 비, 2: 비/눈, 3: 눈/비, 4: 눈)
		String k39_wfKor = ""; //날씨 한국어
		String k39_wfEn = ""; //날씨 영어
		String k39_pop = ""; //강수 확률%
		String k39_r12 = ""; //12시간 예상 강수량
		String k39_s12 = ""; //12시간 예상 적설량
		String k39_ws = ""; //풍속 (m/s)
		String k39_wd = ""; //풍속 (0~7: 북, 북동, 동, 남동, 남, 남서, 서 , 북서)
		String k39_wdKor = ""; //풍향 한국어
		String k39_wdEn = ""; //풍향 영어
		String k39_reh = ""; //습도 %
		String k39_r06 = ""; //6시간 예상 강수량
		String k39_s06 = ""; //6시간 예상 적설량
		
		//생성된 document에서 각 요소들을 접근하여 데이터를 저장함
		Element k39_root = k39_doc.getDocumentElement(); //root태그를 가지고 오기도 하지만 지금은 쓰이는 곳이 없음
		NodeList k39_tag_001 = k39_doc.getElementsByTagName("data"); //xml data tag
		
		for (int k39_i = 0; k39_i < k39_tag_001.getLength(); k39_i++) { // data 테그가 여러 개 있는데 하나를 선택(item(i)) 하여 어트리뷰트가 seq를 찾고 그것의 값을 찾는다
			Element k39_elmt = (Element)k39_tag_001.item(k39_i); //i범위들의 태그 요소들
			
			k39_seq = k39_tag_001.item(k39_i).getAttributes().getNamedItem("seq").getNodeValue();// data seq=“0”, data seq=“1”등을 보고 결국 0,1,2,3 값이 나온다. 
			k39_hour = k39_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();// hour테그는 전체 xml이 아니라 현재 data테그 하나를 기준으로 하위의  hour를 찾아 그 노드값을 보여준다
			k39_day =  k39_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue(); //0 - 오늘, 1 - 내일, 2 - 모레의 경우의 노드값을 보여준다
			k39_temp =  k39_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue(); //현재 시간온도 노드값을 보여준다
			k39_tmx =  k39_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();//최고 온도 노드값을 보여준다
			k39_tmn =  k39_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();//최저 온도 노드값을 보여준다
			k39_sky =  k39_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();//하늘 상태코드 (1: 맑음, 2: 구름조금, 3:구름 많음, 4: 흐림) 노드값을 보여준다
			k39_pty =  k39_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();//강수 상태코드 (0: 없음, 1: 비, 2: 비/눈, 3: 눈/비, 4: 눈) 노드값을 보여준다
			k39_wfKor =  k39_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();//날씨 한국어 노드값을 보여준다
			k39_wfEn =  k39_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();//날씨 영어 노드값을 보여준다
			k39_pop =  k39_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();//강수 확률% 노드값을 보여준다
			k39_r12 =  k39_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();//12시간 예상 강수량 노드값을 보여준다
			k39_s12 = k39_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();//12시간 예상 적설량 노드값을 보여준다
			k39_ws =  k39_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();//풍속 (m/s) 노드값을 보여준다
			k39_wd =  k39_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();//풍속 (0~7: 북, 북동, 동, 남동, 남, 남서, 서 , 북서) 노드값을 보여준다
			k39_wdKor =  k39_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();//풍향 한국어 노드값을 보여준다
			k39_wdEn = k39_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();//풍향 영어 노드값을 보여준다
			k39_reh =  k39_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();//습도 % 노드값을 보여준다
			k39_r06 =  k39_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();//6시간 예상 강수량 노드값을 보여준다
			k39_s06 =  k39_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();//6시간 예상 적설량 노드값을 보여준다
			
			System.out.println("=================================================");
			
			System.out.printf("[48시간 중 %s 번째]\n", k39_seq); //48시간 중 몇 번째인지 출력 (0~16)
			System.out.printf("시간 : %s시 \n", k39_hour); //시간 출력
			
			if (k39_day.equals("0")) { //day가 0일때 오늘
				System.out.printf("날짜 : 오늘 (22일 월) \n");
			} else if (k39_seq.equals("1")) {//day가 1일때 내일
				System.out.printf("날짜 : 내일 (23일 화) \n");
			} else if (k39_seq.equals("2")) {//day가 2일때 모레
				System.out.printf("내일 : 모레 (24일 수) \n");
			}
			
			System.out.printf("현재시간 온도 : %s °C\n", k39_temp); //현재 시간온도
			System.out.printf("최고 온도 : %s °C\n", k39_tmx);//최고 온도
			System.out.printf("최저 온도 : %s °C\n", k39_tmn);//최저 온도
			
			if (k39_sky.equals("1")) { 			//sky 1일때,  맑음 
				System.out.printf("하늘 : 맑음\n");
			} else if (k39_sky.equals("2")){	// sky 2일때  구름조금, 
				System.out.printf("하늘 : 구름 조금\n");
			} else if (k39_sky.equals("3")){ 	//sky 3일때 구름 많음
				System.out.printf("하늘 : 구름 많음\n");
			} else if (k39_sky.equals("4")){	//sky 4일때 흐림
				System.out.printf("하늘 : 흐림\n");
			}
			
			if (k39_pty.equals("0")) {			 //pty 0일때, 강수: 없음
				System.out.printf("강수 : 없음\n");
			} else if (k39_pty.equals("1")) {		 //pty 1일때, 강수: 비
				System.out.printf("강수 : 비\n");
			} else if (k39_pty.equals("2")) {		 //pty 2일때, 강수: 비/눈
				System.out.printf("강수 : 비/눈\n");
			} else if (k39_pty.equals("3")) {		 //pty 3일때, 강수: 눈/비
				System.out.printf("강수 : 눈/비\n");
			} else if (k39_pty.equals("4")) {		 //pty 4일때, 강수: 눈
				System.out.printf("강수 : 눈\n");
			}
			
			System.out.printf("날씨 한국어 : %s\n", k39_wfKor); //날씨 한국어
			System.out.printf("날씨 영어 : %s\n", k39_wfEn); //날씨 영어
			System.out.printf("강수 확률(%%) : %s %%\n", k39_pop); //강수 확률 %
			System.out.printf("12시간 예상 강수량 : %s\n", k39_r12); //12시간 예상 강수량
			System.out.printf("12시간 예상 적설량 : %s\n", k39_s12); //12시간 예상 적설량
			System.out.printf("풍속(m/s) : %s m/s\n", k39_ws);//풍속
			
			if (k39_wd.equals("0")) { 			//wd 가 0일때, 풍향: 북
				System.out.printf("풍향 : 북\n");
			} else if (k39_wd.equals("1")){ 			//wd 가 1일때, 풍향: 북동
				System.out.printf("풍향 : 북동\n");
			} else if (k39_wd.equals("2")){ 			//wd 가 2일때, 풍향: 동
				System.out.printf("풍향 : 동\n");
			} else if (k39_wd.equals("3")){ 			//wd 가 3일때, 풍향: 남동
				System.out.printf("풍향 : 남동\n");
			} else if (k39_wd.equals("4")){ 			//wd 가 4일때, 풍향: 남
				System.out.printf("풍향 : 남\n");
			} else if (k39_wd.equals("5")){ 			//wd 가 5일때, 풍향: 남서
				System.out.printf("풍향 : 남서\n");
			} else if (k39_wd.equals("6")){ 			//wd 가 6일때, 풍향: 서
				System.out.printf("풍향 : 서\n");
			} else {						 			//wd 가 그 외 일때, 풍향: 북서
				System.out.printf("풍향 : 북서\n");
			}
			
			System.out.printf("풍향 한국어 : %s\n", k39_wdKor); //풍향 한국어
			System.out.printf("풍향 영어 : %s\n", k39_wdEn); //풍향 영어
			System.out.printf("습도 %% : %s %%\n", k39_reh); //습도
			System.out.printf("6시간 예상 강수량 : %s\n", k39_r06); //6시간 예상 강수량
			System.out.printf("6시간 예상 적설량 : %s\n", k39_s06); // 6시간 예상 적설량
			
		}
				
	}

}
