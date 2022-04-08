package ch19.Ex03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArraytoString {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//1 String getBytes(): String -> Byte[]�� �����ؼ� ��ȯ
		byte[] array1="�ȳ�".getBytes(); //charset�� �������� ����
		byte[] array2="����".getBytes(Charset.defaultCharset()); //���ڿ��� ����Ʈ�� ��ȯ�ؼ� �迭�� ����
		byte[] array3="����".getBytes(Charset.forName("MS949"));//���� ���� �߻� ����
		byte[] array4="����".getBytes("UTF-8"); //����ó�� �ʿ� //�Ϲ� ���� �߻� ����
		
		//2 �� ���ڵ��� ����Ʈ �� ���
		System.out.println(array1.length); //MS949 : �ѱ� 2byte //4
		System.out.println(array2.length); //MS949 : �ѱ� 2byte //4
		System.out.println(array3.length); //MS949 : �ѱ� 2byte //4
		System.out.println(array4.length); //UTF-8 : �ѱ� 3byte //6
		
		//3 new String() : byte[] -> String ��ȯ
		String str1=new String(array1);
		String str2=new String(array2,Charset.defaultCharset());
		String str3=new String(array3,Charset.forName("MS949")); //������ �� ���ڵ� Ÿ���� ��ġ�ؾ� ��(�ٸ��� ����)
		String str4=new String(array4,Charset.forName("UTF-8"));
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		//4 �ѱ��� ������ ���: �������� ���ڵ� Ÿ�԰� �������� ���ڵ� Ÿ���� ����ġ�� ���
		String str5=new String(array1,Charset.forName("UTF-8"));
		String str6=new String(array1,Charset.forName("MS949"));
		String str7=new String(array3,Charset.forName("MS949"));
		
		
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		
		
		
		
		
		
		
	}
}
