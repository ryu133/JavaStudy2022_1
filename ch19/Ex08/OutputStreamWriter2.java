package ch19.Ex08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//Reader / Writer : �߻�Ŭ����, char�� ó��, ����(o),�̹���(x),MP3(x),...
//FileReader /FileWriter : �ϼ��� Ŭ����, Default charser�� ��� 
//InputStreamReader/OutputStreamReader: ������ �� ���ڵ� �����ؼ� �б�, ����

//����! System.in: �ֿܼ��� �Է�/ System.out: �ֿܼ� ���  <= �ѹ� close()�Ǹ� ���� �Ұ�
	//byte �ϱ�, ����

public class OutputStreamWriter2 {
	public static void main(String[] args) {
		//�ܼ� ���(MS949)
		try {
			OutputStreamWriter osw=new OutputStreamWriter(System.out,"MS949");
			osw.write("OutputStreamWriter2 ���� �����Դϴ�.\n".toCharArray()); //String�� char[]�� ����
			osw.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�."); //string
			osw.write('\n'); //char ����
			osw.write("Good Bye !!!\n\n"); //write: ����(�޸�)�� ����
			osw.flush(); //���ۿ� �ִ� ���� �ֿܼ� ���
		} catch (Exception e) {		}
		
		
		//�ܼ� ���(UTF-8) (���� ����)
		try {
			OutputStreamWriter osw=new OutputStreamWriter(System.out,"UTF-8");
			osw.write("OutputStreamWriter2 ���� �����Դϴ�.\n".toCharArray()); //String�� char[]�� ����
			osw.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�."); //string
			osw.write('\n'); //char ����
			osw.write("Good Bye !!!\n\n"); //write: ����(�޸�)�� ����
			osw.flush(); //���ۿ� �ִ� ���� �ֿܼ� ���
		} catch (Exception e) {		}
		
		
		
		
		
		
		
		
		
	}
}
