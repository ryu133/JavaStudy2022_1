package ch19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Scanner;

//�ֿܼ��� �迭 100byte ���� �ѱ��� �Է¹��� ���� input.txt�� ����, Charset.defaultCharset() ���
//input.txt ���Ͽ��� ���� �о �ֿܼ� ���

//1 System.in : �ֿܼ��� �Է�
//2 FileOutputStream : �Է¹��� ���� ���Ͽ� �����ϱ� 
//3 FileInputStream : ����� ������ ���� �о����
//4 System.out : �ֿܼ��� ���

public class Ex06_ConsoleInputOutputObject {
	public static void main(String[] args) throws IOException  {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�ѱ� �Է� >>");
		File file=new File("ch19/Ex06/input.txt");
		InputStream is=null;
		OutputStream os=System.out;
		
		os=new FileOutputStream(file);
		byte[] byteArray1=new byte[100];
		byteArray1=scanner.nextLine().getBytes();
	
		os.write(byteArray1);
		os.flush();
	
		
		byte[] byteArray2=new byte[100];
		int count;
		
		is = new FileInputStream(file);
		while ((count=is.read(byteArray2))!=-1) { 
			System.out.println(new String(byteArray2,Charset.defaultCharset()));
		}
		
		os.close();
		is.close();
				
		
		
		
	
		
		
	}
}
