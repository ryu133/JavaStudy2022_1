package ch19.Ex06;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

//�ѱ��� �ֿܼ� ���. 1 byte�� ��� �� �ѱ� ����� �ȵ�, n-byte�� ����ؾ� ��

public class ConsoleOutputObject1_1 {
	public static void main(String[] args) throws IOException {
		OutputStream os=System.out; //System.out : �ֿܼ� ��� byte�� �ֿܼ� ���� �־�� ��

		//2 n-byte ���(byte[] ó������ ������ ������ ����)
		byte[] byteArray1="�ȳ��ϼ���".getBytes(Charset.defaultCharset());
		
		os.write(byteArray1); //���ۿ� ����
		os.write('\n');
		
		os.flush(); //������ ������ �ֿܼ� ���
		
		//3 n-byte ���(byte[]�� offset���� length���� byte ������ ����)
		byte[] byteArray2="�ݰ����ϴ�.".getBytes(Charset.defaultCharset());
		
		os.write(byteArray2,6,4); //6byte �ڸ����� 4byte ����
		
		os.flush();
		
		os.close();
		
		
		
		
		
	}
}
