package ch19.Ex06;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject1 {
	public static void main(String[] args) throws IOException {
		OutputStream os=System.out; //System.out : �ֿܼ� ��� 
		
		//1-1 byte ���
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r');
		os.write('\n'); //���ۿ����� ����Ǿ� �ִ�.
		
		os.flush(); //������ ������ �ֿܼ� ���
//		os.close();
		
		//2 n-byte ���
		byte[] byteArray1="Hello".getBytes(); //string -> byte ��ȯ
		
		os.write(byteArray1);
		os.write('\n'); //\r\n 
		os.flush();
		
		//3 n-byte ���
		byte[] byteArray2="Better the last smile than the first laughter".getBytes();
		os.write(byteArray2,7,8); //the last
		//write(byte[],offset,length)
		os.flush();
		
		os.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}
