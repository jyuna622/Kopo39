package L08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class p05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File k39_f = new File ("C:\\Users\\kopo39\\Desktop\\kopo39MyTest.txt"); // ���� ���� ���丮�� C:\...����ȭ������ ��θ� �����Ͽ� �ؽ�Ʈ ���Ϸ� ����
			FileWriter k39_fw = new FileWriter(k39_f); //FileWriter�� ���Ͽ� ������ �� �ְ� ����. ���� �ؽ�Ʈ ���Ͽ� �� ����
			
			k39_fw.write("�ȳ� ����\n"); //���Ͽ� ���� ���� ������, FileWriter.write(""); kopo39MyTest.txt���Ͽ� "�ȳ� ����"�̶�� �ؽ�Ʈ�� �Էµ�. ù��
			k39_fw.write("hello ���\n"); //���Ͽ� ���� ���� ������, FileWriter.write(""); kopo39MyTest.txt���Ͽ� "hello ���"��� �ؽ�Ʈ�� �Էµ�. ��°��
			
			k39_fw.close();// ���Ͽ� �۾��� �������ֱ� ���� FileWriter.close(); ����. �׷� ���� �������� �����
			
			FileReader k39_fr = new FileReader(k39_f); //���� �б� --> FileReader. �а� ���� ������ ()�ȿ� �־��ֱ�
			
			int k39_n = -1; //�Ŀ� 0���� �������� ������ ������� initiate�ϴ� ���� 0���� ���� -1�� ��
			char [] k39_ch; //char 1D �迭�� ������ k39_ch�� �����Ͽ� �������� line1, column 1��
			
			while(true) { //while���� �̿��Ͽ� true�϶��� loop�� ��������
				k39_ch = new char[100]; // 100�� k39_ch��� char ���� �������ٰ� ���� ��������.
				k39_n = k39_fr.read(k39_ch); //k39_ch�� char���� ���� ���ϸ����� ����� k39_n�̶�� ������ ����
				
				if (k39_n == -1) //k39_n�� ���� -1�϶��� if ���� loop����. k39_n�� -1�� ���� �Ǿ����� break �ɾ��ֱ�.
					break;
				for (int i = 0; i < k39_n; i++) { //for���� Ȱ���Ͽ� i�� ���� 0���� ũ��, k39_n���� �������� ������ �������ش�. 
					System.out.printf("%c", k39_ch[i]); // ���� �����϶�, i������ char ���� ����Ʈ���ֱ�. %#s�� ���� string ������ �����ش�. �߰��� ""�� �־� �߰� ��ĭ ����, ���ڸ�ŭ �����.
				}
			}
			
			k39_fr.close(); //try�϶��� loop�� ���⼭ �������� ���ϸ����� �ݾ��ش�. Close�� ���ϸ� ��� ������ �����־ ������ �� �� ����.
			
			System.out.printf("\nFILE READ END "); //���̸����� �����ٴ� ���� �˷��ֱ����� FILE READ END�� ����ؼ� �˷��ش�.//%#s�� ���� string ������ �����ش� 
												   //�߰��� ""�� �־� �߰� ��ĭ ����, ���ڸ�ŭ �����. -�� ��������, -�� ������ ���j�� ����
			
		} catch (Exception e) { //else�� ����ó�� ������ ���� exception�� ������ֱ�
			System.out.printf("�� ���� [%s]\n", e); // ���� �ش��� �ȵǾ� ������ �������� "�� ����"��� ������ ����Ʈ�ǵ��� ��. printf�� %s�� �ϰ�, �ش��ϴ� ��(e)�� �޸� �ڿ� �Է�
			//%#s�� ���� string ������ �����ش� //�߰��� ""�� �־� �߰� ��ĭ ����, ���ڸ�ŭ �����. -�� ��������, -�� ������ ���j�� ����
		}
	}
}
