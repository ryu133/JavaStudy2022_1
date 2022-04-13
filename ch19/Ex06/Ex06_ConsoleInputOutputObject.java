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
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("�ѱ� �Է� >>");
//		File file=new File("ch19/Ex06/input.txt");
//		InputStream is=null;
//		OutputStream os=null;
//		
//		os=new FileOutputStream(file);
//		byte[] byteArray1=new byte[100];
//		byteArray1=scanner.nextLine().getBytes();
//	
//		os.write(byteArray1);
//		os.flush();
//	
//		
//		byte[] byteArray2=new byte[100];
//		int count;
//		
//		is = new FileInputStream(file);
//		while ((count=is.read(byteArray2))!=-1) { 
//			System.out.println(new String(byteArray2,Charset.defaultCharset()));
//		}
//		
//		os.close();
//		is.close();
				
		
		
		
		
		//1 �ֿܼ��� �ѱ� �Է� �ޱ� (System.in) <=byte[] �迭�� �����ؼ� �ѱ��� ó����.
		InputStream ips=System.in; //new�� �������� �ʰ� ���Ḹ ����, �ֿܼ��� �Է� ���� ����
		System.out.println("�ѱ��� �Է� �ϼ��� >>");
		
		byte[] arr1=new byte[100];
		int count1=ips.read(arr1); //arr1�� byte�� \r,\n�� ������ ��ü�� ��. count1: �迭 �ȿ� ���� �� ����
		//int data=ips.read(); //�ѱ��� ó������ ���Ѵ�. data���� 1byte read�� ���� ����
		
		//2 �Է¹��� �ѱ��� ���Ͽ� �����ϱ�. (FileOutputStream)
		File f1=new File("ch19\\Ex06\\input.txt");
		OutputStream fos=new FileOutputStream(f1); //�����
		
		fos.write(arr1); //����(RAM)���� ������
		fos.flush(); //���ۿ� ���� ������ ���Ͽ� ����
		
		//3 ����� ���Ͽ��� ���� �б�. (FileInputStream)
		InputStream fis=new FileInputStream(f1); //read(): �ѱ��� ó������ ����. read(byte[]): �ѱ� ó�� ����
		byte[] arr2=new byte[100];
		
		int count2=fis.read(arr2); //read(byte[]): �迭 ������ �д´�
//		int data2=fis.read(); //read(): 1byte�� �д´�
		
		//4 �о�� �迭�� �ֿܼ� ��� �ϱ�. (System.out)
		OutputStream ops=System.out; //�ֿܼ� ���: byte[]
		
		ops.write(arr2);
		ops.flush();
		
		ips.close();
		fis.close();
		fos.close();
		ops.close();
		
	}
}
