package L08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class p05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File k39_f = new File ("C:\\Users\\kopo39\\Desktop\\kopo39MyTest.txt"); // 파일 저장 디렉토리를 C:\...바탕화면으로 경로를 지정하여 텍스트 파일로 저장
			FileWriter k39_fw = new FileWriter(k39_f); //FileWriter는 파일에 글을쓸 수 있게 해줌. 위에 텍스트 파일에 글 쓰기
			
			k39_fw.write("안녕 파일\n"); //파일에 글을 쓰고 싶을땐, FileWriter.write(""); kopo39MyTest.txt파일에 "안녕 파일"이라는 텍스트가 입력됨. 첫출
			k39_fw.write("hello 헬로\n"); //파일에 글을 쓰고 싶을땐, FileWriter.write(""); kopo39MyTest.txt파일에 "hello 헬로"라는 텍스트가 입력됨. 둘째줄
			
			k39_fw.close();// 파일에 글쓰기 종료해주기 위해 FileWriter.close(); 해줌. 그럼 파일 내용적기 종료됨
			
			FileReader k39_fr = new FileReader(k39_f); //파일 읽기 --> FileReader. 읽고 싶은 파일을 ()안에 넣어주기
			
			int k39_n = -1; //후에 0보다 작을때의 범위를 고려래서 initiate하는 값을 0보다 작은 -1로 줌
			char [] k39_ch; //char 1D 배열을 변수를 k39_ch로 지정하여 저장해줌 line1, column 1임
			
			while(true) { //while문을 이용하여 true일때의 loop을 생성해줌
				k39_ch = new char[100]; // 100을 k39_ch라는 char 지정 변수에다가 값을 저장해줌.
				k39_n = k39_fr.read(k39_ch); //k39_ch의 char값을 읽은 파일리더의 결과를 k39_n이라는 변수에 저장
				
				if (k39_n == -1) //k39_n의 값이 -1일때의 if 조건 loop생성. k39_n이 -1의 값이 되었을때 break 걸어주기.
					break;
				for (int i = 0; i < k39_n; i++) { //for문을 활용하여 i의 값이 0보다 크고, k39_n보다 작을때의 범위로 지정해준다. 
					System.out.printf("%c", k39_ch[i]); // 위의 조건일때, i범위의 char 값을 프린트해주기. %#s를 통해 string 간격을 정해준다. 중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐.
				}
			}
			
			k39_fr.close(); //try일때의 loop가 여기서 끝났으니 파일리더를 닫아준다. Close를 안하면 계속 파일이 열려있어서 제어할 수 가 없다.
			
			System.out.printf("\nFILE READ END "); //파이리더가 끝났다는 것을 알려주기위해 FILE READ END를 출력해서 알려준다.//%#s를 통해 string 간격을 정해준다 
												   //중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬
			
		} catch (Exception e) { //else의 조건처럼 예외인 에러 exception을 만들어주기
			System.out.printf("나 에러 [%s]\n", e); // 위에 해당이 안되어 에러가 났을때는 "나 에러"라는 문구가 프린트되도록 함. printf는 %s를 하고, 해당하는 값(e)를 콤마 뒤에 입력
			//%#s를 통해 string 간격을 정해준다 //중간에 ""를 넣어 중간 빈칸 조절, 숫자만큼 띄어짐. -는 왼쪽정렬, -가 없으면 오릌쪽 정렬
		}
	}
}
