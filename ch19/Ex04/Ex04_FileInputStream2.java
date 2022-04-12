package ch19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

//is1: MS949 �ѱ� �б�, try (with resource) ����ó��
//is2: UTF-8 �ѱ� �б�, try-catch ����ó��


public class Ex04_FileInputStream2 {
	public static void main(String[] args) {
		File ms=new File("ch19\\Ex04\\file-ms949.txt");
		File utf=new File("ch19/Ex04/file-utf-8.txt");
		
		byte[] arr1=new byte[100];
		int data=0;
		
		try (InputStream is1=new FileInputStream(ms);) {
			while ((data=is1.read(arr1))!=-1) {
				String str=new String(arr1,Charset.forName("MS949"));
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println("������ ���� ���ϴ� ���ܰ� �߻��Ǿ����ϴ�.");
		}
		
		InputStream is2=null;
		byte[] arr2=new byte[200];
		
		try {
			is2=new FileInputStream(utf);
			while ((data=is2.read(arr2))!=-1) {
				String str=new String(arr2,Charset.forName("UTF-8"));
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println("������ ���� ���ϴ� ���ܰ� �߻��Ǿ����ϴ�.");
		} finally {
			if (is2!=null) {
				try {is2.close();} 
				catch (Exception e2) {System.out.println("���� �߻�");}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
