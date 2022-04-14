package ch19.Ex08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//InputStreamReader: byte->char , charset (MS949,UTF-8)�����ؼ� ���Ͽ� ���� �� �ִ�.
//OutputStreamReader: byte->char , charset (MS949,UTF-8)�����ؼ� ���Ͽ� ������ �� �ִ�.

public class OutputStreamWriter1 {
	public static void main(String[] args) {
		//1 FileWriter�� ���ؼ� ������ ���� (Default : MS949)
		File osw1=new File("ch19/Ex08/osw1.txt"); //MS949
		File osw2=new File("ch19/Ex08/osw2.txt"); //UTF-8
		
		//��Ŭ���� �ܺο� �����ϸ� �� �����
//		File osw1=new File("C:/Temp/osw1.txt"); //MS949
//		File osw2=new File("C:/Temp/osw2.txt"); //UTF-8
		
		try (Writer writer=new FileWriter(osw1);) {
			writer.write("OutputStreamWriter1 ���� �����Դϴ�.\n".toCharArray()); //String�� char[]�� ����
			writer.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�."); //string
			writer.write('\n'); //char ����
			writer.write("Good Bye !!!\n\n");
			writer.flush();
		} catch (IOException e) {		}
		
		//2 FileWriter�� ����ؼ� ���Ͽ� ������ ���� (Default : MS949 ==> UTF-8)
		try (OutputStream os=new FileOutputStream(osw2);
				OutputStreamWriter osw=new OutputStreamWriter(os,"UTF-8");) {
			//OutputStreamWriter : byte -> char
			osw.write("OutputStreamWriter1 ���� �����Դϴ�.\n".toCharArray()); //String�� char[]�� ����
			osw.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�."); //string
			osw.write('\n'); //char ����
			osw.write("Good Bye !!!\n\n");
			osw.flush();
		} catch (IOException e) {		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
