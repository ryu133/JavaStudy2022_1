package ch19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

//FileOutputStream �ѱ� ó��

public class FileOutputStream2 {
	public static void main(String[] args) throws IOException {
		//1 ������ ���� ����
		File outFile=new File("ch19/Ex05/FileOutput2.txt"); //�⺻������ ��Ŭ������ default Charset���� �����
		
		//2 n-byte ���� ���� ó�� (byte[]�� ó������ ������ ����) �ѱ�
		OutputStream os2=new FileOutputStream(outFile);
		byte[] byteArray1="�ȳ��ϼ���".getBytes(Charset.forName("MS949")); //string -> byte[] ���� .getBytes()
						//�� ���� �� 2byte. �� 10byte
		
		os2.write(byteArray1);
		os2.write('\n');
		
		os2.flush();
		os2.close();
		
		//3 n-byte ���� (byte[]�� offset���� length�� ����)
		OutputStream os3=new FileOutputStream(outFile,true);
		byte[] byteArray2="�ݰ����ϴ�.".getBytes(Charset.forName("MS949"));
//		byte[] byteArray1="�ݰ����ϴ�.".getBytes(Charset.defaultCharset()); //�⺻ Charset���� ��������
		
		os3.write(byteArray2,6,5);
		os3.write('\n');
		
		//����, ����, Ư������ <= ASCII �ڵ�� 1byte
		
		os3.flush();
		os3.close();
		
		
		
		
	}
}
