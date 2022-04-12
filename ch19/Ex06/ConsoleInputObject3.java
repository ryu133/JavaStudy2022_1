package ch19.Ex06;
//�ܼ� �Է� �ѱ� ó��
//InputStream System.in

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ConsoleInputObject3 {
	public static void main(String[] args) throws IOException {
		InputStream is=System.in; //System.in: �ѹ��� ���(����) ����. close() ���� �������� ���

		System.out.println("�ѱ��� �Է��ϼ��� >>");
		
		//#2 n-byte �迭 �б� (byte[] ó�� ��ġ���� ���� ������ ����)
		byte[] byteArray1=new byte[100];
		int count1=is.read(byteArray1); //\r\n ����
			//count1: byteArray1�� ����� ���� ����
		
		String str1=new String(byteArray1,0,count1,Charset.defaultCharset());
		System.out.println(str1);
		
		System.out.println("�迭�� ���� �� ����(r,n ���Ե�): "+count1);
		
		System.out.println("================\n");
		
		//3 n-byte ���� �б�(offset[index]��ġ�� length��ŭ �о byte[]�� ����)
		byte[] byteArray2=new byte[9];
		int offset=3;
		int length=6;
		int count2=is.read(byteArray2,offset,length);
		
		String str2=new String(byteArray2,0,offset+count2,Charset.defaultCharset());
		System.out.println(str2);
		
		
		
	}
}
