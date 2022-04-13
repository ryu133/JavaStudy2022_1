package ch19.Ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader: byte �����͸� char �������� ��ȯ�ϴ� ��ü
	//byte ������ ���ڵ��� �� �����ؾ� ��
	//char �������� �ٲٸ� ���ڵ� Ÿ���� �Ű澲�� �ʾƵ� ��


public class InputStreamReader1 {
	public static void main(String[] args) {
		//���� ��ü ����
		File isr=new File("ch19/Ex08/isr.txt"); //isr.txt�� UTF-8�� �����
		
		try (Reader reader =new FileReader(isr);) //FileReader�� ���ڵ� ������ ���� ����. default Encoding�� �����
		{
			int data;
			while ((data=reader.read())!=-1) { //MS949
				System.out.print((char)data);
			}
		} catch (Exception e) {		}
		
		System.out.println("\n=========================");
		
		//2 FileInputStream + InputStreamReader�� �̿��� ���� �б�
			//InputStreamReader(is,"UTF-8");  byte -> char ��ȯ
		try (InputStream is=new FileInputStream(isr);
				InputStreamReader isr1=new InputStreamReader(is, "UTF-8");) //isr1: char�� ��ȯ��
		{
			int data;
			while ((data=isr1.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {		}

		
		
		
	}
}
