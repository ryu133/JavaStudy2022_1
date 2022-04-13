package ch19.Ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;



public class InputStreamReader2 {
	public static void main(String[] args) {
		//1 �ܼ� �Է�(MS949): default charset, byte ��Ʈ��

		//InputStreamReader : byte -> char�� ��ȯ
		//System.in: �ܼ� �Է�, byte
		//ist�� ��ȯ�� char 
		try {
			InputStreamReader isr=new InputStreamReader(System.in,"MS949");
			System.out.println("�ѱ��� �Է��ϼ���. >>");
			int data;
			while ((data=isr.read())!='\r') { //�ܼ� �Է� ���
				System.out.print((char)data);
			}
			System.out.println();
			System.out.println(isr.getEncoding());
		} catch (Exception e) {		}
		
		System.out.println("=========================");
	
		//2 �ܼ� �Է�(UTF-8)
		try (InputStreamReader isr=new InputStreamReader(System.in,"UTF-8");) 
	{
		System.out.println("�ѱ��� �Է��ϼ���. >>");
		int data;
		while ((data=isr.read())!='\r') { //�ܼ� �Է� ���
			System.out.print((char)data);
		}
		System.out.println();
		System.out.println(isr.getEncoding());
	} catch (Exception e) {		}
		
		
	}
}
