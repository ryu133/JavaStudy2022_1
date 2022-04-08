package ch19.Ex03;

import java.io.UnsupportedEncodingException;
import java.util.Iterator;

//UTF-16: ���� ����. �ѱ۰� ���� ��� 2byte�� ǥ��
//UTF-8: ���� ����. ���� 1byte, �ѱ� 3byte �� ǥ��

public class UTF16_VS_UTF8 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] b1="abc".getBytes("UTF-16");
			//BOM �ĺ� �ڵ� 2byte
			//abc: 6byte
		byte[] b2="abc".getBytes("UTF-8");
		
		System.out.println(b1.length); //8: BOM(2)+6(abc)
		System.out.println(b2.length); //3
		
		for (byte b : b1) {
			System.out.printf("%02X",b); //16������ ���
			System.out.print(" ");
		}
		System.out.println();
		for (byte b : b2) {
			System.out.printf("%02X",b);
			System.out.print(" ");
		}
		
		System.out.println("\n==============");
		
		byte[] b3="������".getBytes("UTF-16");
		byte[] b4="������".getBytes("UTF-8");
		
		System.out.println(b3.length); //BOM(2)+2byte(2 2 2)
		System.out.println(b4.length); //�ѱ� 3byte(3 3 3)
		
		for (byte b : b3) {
			System.out.printf("%02X",b);
		}
		System.out.println();
		
		for (byte b : b4) {
			System.out.printf("%02X",b);
		}
		System.out.println();
		
		System.out.println(new String(b3,"UTF-16"));
		System.out.println(new String(b4,"UTF-8"));
		
		
	}
}
