package class0318;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		/* 유니코드 한글은 0xAC00 으로부터 초성 19개, 중상21개, 종성28개로 이루어짐 
		 * 이들을 조합한 11,172개의 문자를 갖는다.
		초성 = ((X - 0xAC00) / 28) / 21
		중성 = ((X - 0xAC00) / 28) % 21
		종성 = (X - 0xAC00) % 28
		ㄱ = 0x1100
		ㄲ = 0x1101
		ㄴ = 0x1102 
		...	
		ㅎ = 0x1112 이런순으로 간다 (18이 아니라 12인 이유는 16진수를 사용하기때문)
		*/
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine(); //"안녕하세요";
		String[] CHO = {"ㄱ","ㄲ","ㄴ","ㄷ","ㄸ","ㄹ","ㅁ","ㅂ","ㅃ", "ㅅ","ㅆ","ㅇ","ㅈ","ㅉ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"};
		String[] JOONG = {"ㅏ","ㅐ","ㅑ","ㅒ","ㅓ","ㅔ","ㅕ","ㅖ","ㅗ","ㅘ", "ㅙ","ㅚ","ㅛ","ㅜ","ㅝ","ㅞ","ㅟ","ㅠ","ㅡ","ㅢ","ㅣ"};
		String[] JONG = {"","ㄱ","ㄲ","ㄳ","ㄴ","ㄵ","ㄶ","ㄷ","ㄹ","ㄺ","ㄻ","ㄼ", "ㄽ","ㄾ","ㄿ","ㅀ","ㅁ","ㅂ","ㅄ","ㅅ","ㅆ","ㅇ","ㅈ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"};
		
		
		for(int i = 0; i < text.length(); i++) { 
			char uniVal = text.charAt(i); // 한글일 경우만 시작해야 하기 때문에 0xAC00부터 아래의 로직을 실행한다 
				if(uniVal >= 0xAC00) { 
				uniVal = (char)(uniVal - 0xAC00); 
			
				char cho = (char)(uniVal/28/21); 
				char joong = (char) ((uniVal)/28%21); 
				char jong = (char) (uniVal % 28); // 종성의 첫번째는 채움이기 때문에 
				System.out.print(CHO[cho] + JOONG[joong] + JONG[jong]); 
			
				} else { 
					System.out.println(); 
			}
		}
	} 			
}



		
