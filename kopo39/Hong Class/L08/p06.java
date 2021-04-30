package L08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p06 {

	public static void Kopo39_FileWrite() throws IOException { //���Ͽ� ���� �Է��� �� Ŭ���� ����
		File k39_f = new File ("C:\\Users\\kopo39\\Desktop\\p06MyTest.txt"); // ���� ���� ���丮�� C:\...����ȭ������ ��θ� �����Ͽ� �ؽ�Ʈ ���Ϸ� ����
		/**
		 * Buffer��? �ٸ� ���� �޸𸮸� �ǹ��ϴµ�, �޸𸮰� �ֱ� ������ ����� �ÿ� ���������� ���� �� �ִ�. 
		 * ���� �ӵ��� �о���̰ų�, ���� �ӵ��� ������ �Ҷ� �о� �鿩�� �� ���� ����� ��� ���� �ӵ� ���� ������ ���������� �Ͼ �� �ֱ� �����̴�. 
		 * ���� �߰��� ���۸� �����ν� �б�� ���� �� ������ ���� �� �ִ�.
		 */
		
		BufferedWriter k39_bw = new BufferedWriter(new FileWriter(k39_f)); //BufferedWriter --> Buffer�� ������ ks9_f�� ������ ���� ������ִ� �Լ��̴�.
		//BufferedWriter�� ���, ���۰� �ֱ⶧���� �ݵ�� flush()�޼ҵ带 �̿��ϰų� close()�޼ҵ带 ȣ�� ����߸� �Ѵ�. �׷��� �ʰ� ���α׷��� �����ϰ� �Ǹ� ������ ������ �����ϰ� �� �� ���� �ȴ�. 
		//Ư�� ��Ʈ��ũ ���α׷����� ��쿡��  write()�޼ҵ带 ȣ���� �Ŀ��� �ݵ��  flush()�޼ҵ带 ȣ���� ����Ѵ�.
		k39_bw.write("�ȳ� ����");//���Ͽ� ���� ���� ������, BufferedWriter.write(""); p06MyTest.txt���Ͽ� "�ȳ� ����"�̶�� �ؽ�Ʈ�� �Էµ�. ù��
		k39_bw.newLine(); //newLine() ���� �Լ��� ����Ͽ� �� ��(\n)���� ���ο� ���� ����. �׷��� ���� line���� �Ѿ
		k39_bw.write("hello ���");//���Ͽ� ���� ���� ������, BufferedWriter.write(""); p06MyTest.txt���Ͽ� "hello ���"��� �ؽ�Ʈ�� �Էµ�. ������
		k39_bw.newLine();//newLine() ���� �Լ��� ����Ͽ� �� ��(\n)���� ���ο� ���� ����.�׷��� ���� line���� �Ѿ
		
		k39_bw.close();// ���Ͽ� �۾��� �������ֱ� ���� BufferedWriter.close(); ����. �׷� ���� �������� �����
	}
	
	public static void Kopo39_FileRead() throws IOException {//������ �о��ֱ� ���� �����б�� Ŭ���� ����. IOException�� Ŭ���� ���� ������ �ý��� �޽����� �޴¿�
		File k39_f = new File ("C:\\Users\\kopo39\\p06MyTest.txt");// ���� ���� ���丮�� C:\...����ȭ������ ��θ� �����Ͽ� �ؽ�Ʈ ���Ϸ� ����
		BufferedReader k39_br = new BufferedReader (new FileReader(k39_f));//BufferedReader -  �� �� �� �о� ���̴�  readLine�̶�� �޼ҵ尡 �ֱ� ������ �� �پ� �о� ���̱⿡�� �����ϴ� 
		String readtxt; //�ؽ�Ʈ�� �о��� ������ ����. ���� �����̴� string�Լ��� ����� 
		
		while ((readtxt = k39_br.readLine()) != null) { //���۸����� ���� �ٵ��� �а� �� ������ readtxt������ ������ �ش�. readLine()  ���� �Լ��� ����Ͽ� ����(\n)������ �д´�
			System.out.printf("%s\n", readtxt); //����� readtxt������� ����Ͽ� ���پ� ����ش�.
		}
		k39_br.close();//���۸��� �ݾ��ֱ� - Close�� ���ϸ� ��� ������ �����־ ������ �� �� ����
	}
	
	public static void main (String[] args) throws IOException {
		// TODO Auto-generated method stub
		Kopo39_FileWrite();//���� �ִ� Ŭ������ mainŬ������
		Kopo39_FileRead();//���� ������� Ŭ������ mainŬ������
		
	}

}