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

public class P09 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		DocumentBuilder k39_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();//피씽을 위한 준비
		
		Document k39_doc = k39_docBuilder.parse(new File("C:\\Users\\kopo39\\Desktop\\score.xml"));//xml파일을 처리 pc안에 있어서 전체경로를 지정, xml피싱처리 시작
		
		Element k39_root = k39_doc.getDocumentElement(); //root태그를 가지고 오기도 하지만 지금은 쓰이는 곳이 없음
		
		NodeList tag_name = k39_doc.getElementsByTagName("name"); //Node 인터페이스의 getChildNodes() 메서드로 자식 노드 목록을 NodeList 객체로 얻을 수 있습니다.
		NodeList tag_studentid = k39_doc.getElementsByTagName("studentid"); //tag_name의 요수 중 학번
		NodeList tag_kor = k39_doc.getElementsByTagName("kor"); //tag_name의 요수 중 한국어
		NodeList tag_eng = k39_doc.getElementsByTagName("eng"); //tag_name의 요수 중 영어
		NodeList tag_mat = k39_doc.getElementsByTagName("mat"); //tag_name의 요수 중 수학
		
		System.out.printf("**********************************************\n");
		for (int k39_i = 0; k39_i < tag_name.getLength(); k39_i++) { //범위는 0부터 끝까지인 length까지
			System.out.printf("이름 : %s\n", tag_name.item(k39_i).getFirstChild().getNodeValue()); //노드 중, 그 노드의 first child인 이름과 그 value
			System.out.printf("학번 : %s\n", tag_studentid.item(k39_i).getFirstChild().getNodeValue()); //노드 중, 그 노드의 first child인 학번 value
			System.out.printf("국어 : %s\n", tag_kor.item(k39_i).getFirstChild().getNodeValue()); //노드 중, 그 노드의 first child인 국어 value
			System.out.printf("영어 : %s\n", tag_eng.item(k39_i).getFirstChild().getNodeValue()); //노드 중, 그 노드의 first child인 영어 value
			System.out.printf("수학 : %s\n", tag_mat.item(k39_i).getFirstChild().getNodeValue()); //노드 중, 그 노드의 first child인 수학 value
			System.out.printf("**********************************************\n");
		
		
		}
		
	}

}
